#!/bin/bash
# scripts bash imprescindibles de un sysadmin linux
# File System Backups via FTP with MySQL Databases
## 
# Guardar en /bin/ftpbackup.sh y hacer ejecutable
# chmod +x /bin/ftpbackup.sh
## Your System Settings ##
DIRS="/bin /etc /home /var/local /usr/local/bin /usr/lib /var/www"
BACKUP=/tmp/backup.$$
NOW=$(date +"%Y-%m-%d")
INCFILE="/root/tar-inc-backup.dat"
DAY=$(date +"%a")
FULLBACKUP="Mon"
## Your MySQL Settings ##
MUSER="root"
MPASS="tupassword"
MHOST="localhost"
MYSQL="$(which mysql)"
MYSQLDUMP="$(which mysqldump)"
GZIP="$(which gzip)"
## Your FTP server Settings ##
FTPD="//backup-directory-on-ftp-server"
FTPU="ftp-usuario"
FTPP="ftp-password"
FTPS="ftp.server.address"
NCFTP="$(which ncftpput)"
## Your Email Address ##
EMAILID="tuemail@tudominio.com"
## Backup our DPKG Software List ##
dpkg --get-selections > /etc/installed-software-dpkg.log
## Start the Backup for the file system ##
[ ! -d $BACKUP ] && mkdir -p $BACKUP || :
## Check if we want to make a full or incremental backup ##
if [ "$DAY" == "$FULLBACKUP" ]; then
  FTPD="//full-backups"
  FILE="MyServer-fs-full-$NOW.tar.gz"
  tar -zcvf $BACKUP/$FILE $DIRS
else
  i=$(date +"%Hh%Mm%Ss")
  FILE="MyServer-fs-incremental-$NOW-$i.tar.gz"
  tar -g $INCFILE -zcvf $BACKUP/$FILE $DIRS
fi
## Start the MySQL Database Backups ##
## Get all the MySQL databases names ##
DBS="$($MYSQL -u $MUSER -h $MHOST -p$MPASS -Bse 'show databases')"
for db in $DBS
do
 FILE=$BACKUP/mysql-$db.gz
 $MYSQLDUMP --single-transaction -u $MUSER -h $MHOST -p$MPASS $db | $GZIP -9 > $FILE
done
## Check the Date for Old Files on FTP to Delete ##
REMDATE=$(date --date="30 days ago" +%Y-%m-%d)
## Start the FTP backup using ncftp ##
ncftp -u"$FTPU" -p"$FTPP" $FTPS<<EOF
cd $FTPD
cd $REMDATE
rm -rf *.*
cd ..
rmdir $REMDATE
mkdir $FTPD
mkdir $FTPD/$NOW
cd $FTPD/$NOW
lcd $BACKUP
mput *
quit
EOF
## Find out if ftp backup failed or not ##
if [ "$?" == "0" ]; then
 rm -f $BACKUP/*
 mail  -s "MYSERVER - BACKUP SUCCESSFUL" "$EMAILID"
else
 T=/tmp/backup.fail
 echo "Date: $(date)">$T
 echo "Hostname: $(hostname)" >>$T
 echo "Backup failed" >>$T
 mail  -s "MYSERVER - BACKUP FAILED" "$EMAILID" <$T
 rm -f $T
fi
