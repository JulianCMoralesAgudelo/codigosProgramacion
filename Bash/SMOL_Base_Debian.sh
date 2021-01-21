#!/bin/bash
# -*- ENCODING: UTF-8 -*-
#============================================================================================================================
#============================================== Declaracion de rutas absolutas ==============================================
#============================================================================================================================

clear
printf "$(tput setaf 6)$(tput bold)Script de Configuración Versión 1.0
Autor: Yobany Alexander Rosso Uribe <yobanyrosso.ies@gmail.com>
Actualizado por: Sigifredo Escobar Gómez <sigifredo89@gmail.com>
Actualizado: Julian Camilo Morales Agudelo <julian.morales.ies@gmail.com>
Actualizado: Wagner Castro Ponton <wwwkstro@gmail.com>
Actualizado el: 2017-03-04
Se Prepará el sistema para la instalación del sistema SMOLWEB$(tput sgr 0)"
echo ""
echo $LAZUL'El nombre de usuario del PC es: '$LVERDE$BOLD$USER $NOFORMAT

FUNCTIONS=/etc/init.d/functions
INITFUNCTIONS=/lib/lsb/init-functions
SMOLINUX=/home/$USER/SMOLLinux
BACKUP=/home/$USER/SMOLLinux/Backup-Util/runBackup.sh 
JBOSS=/home/$USER/SMOLLinux/jboss-as-7.1.1.Final
NEWJBOSS=/opt/jboss-as-7.1.1.Final
COMM=/home/$USER/SMOLLinux/SMOLcomm
SCO=/home/$USER/SMOLLinux/SMOLsco
SHOME=/home/$USER/SMOLLinux/SMOL-Home
SOFT=/home/$USER/SMOLLinux/software
POSTG=/opt/PostgreSQL/9.5
VARENT=/home/$USER/SMOLLinux/config
MAIL=etc/init.d/SystemEmail
DIA=`date +"%d/%m/%Y"`
HORA=`date +"%H:%M"`
echo ""

#==============================================================================================================================
#============================================= Borrando archivos innecesarios =================================================
#==============================================================================================================================

echo "$(tput setaf 4)Borrando archivos innecesarios...$(tput sgr 0)"
sleep 5
rm -Rf $COMM/MensajesValidacion.properties
rm -Rf $COMM/mensajesexcepciones.properties
rm -Rf $COMM/iesProperties.properties
rm -Rf $COMM/reportes
rm -Rf $SCO/iesProperties.properties
rm -Rf $SCO/MensajesValidacion.properties
rm -Rf $SCO/mensajesexcepciones.properties
rm -Rf $SCO/lib
rm -Rf $SCO/reportes
rm -Rf $JBOSS/standalone/data
rm -Rf $JBOSS/standalone/log*
rm -Rf $JBOSS/standalone/tmp
echo "$(tput setaf 4)Los archivos fueron borrados.$(tput sgr 0)"
sleep 2

#============================================================================================================================
#========================================== Instalar Skype y paquetes varios ================================================
#============================================================================================================================

echo "$(tput setaf 4)$(tput bold)Instalación y Configuración de Repositorios y Paquetes necesarios$(tput sgr 0)"
echo ""
#echo "## Repositorio para cargar UFW ##" | sudo tee --append /etc/apt/sources.list
#echo "deb http://ftp.de.debian.org/debian sid main" | sudo tee --append /etc/apt/sources.list
#echo "## Repositorio para cargar PlayOnLinux ##" | sudo tee --append /etc/apt/sources.list
#echo "deb http://ftp.de.debian.org/debian jessie main contrib" | sudo tee --append /etc/apt/sources.list
echo ""
sleep 1
sudo apt-get install linux-headers-$(uname -r) build-essential checkinstall make automake cmake autoconf git git-core --yes
sudo apt-get install module-assistant cmake git checkinstall --yes
sudo m-a update
sudo m-a prepare
sleep 1
echo "$(tput setaf 4)Actualizando base de paquetes$(tput sgr 0)"
sleep 1
sudo aptitude update -y
echo "$(tput setaf 4)Instalando Python$(tput sgr 0)"
sleep 1
sudo aptitude install python-psycopg2 python-paramiko -y
echo "$(tput setaf 4)Instalando paquetes Adicionales:$(tput sgr 0)"
sleep 1
echo "$(tput setaf 4)Soporte para sistema de archivos NTFS de Microsoft$(tput sgr 0)"
sleep 1	
sudo aptitude install rar unrar zip unzip unace ntfs-3g nmap vsftpd htop vim ufw x11vnc bzip2 lzop p7zip-full p7zip-rar openssh-server filezilla -y
echo "$(tput setaf 4)Pack de Librerias necesarias para la instalación de SKYPE$(tput sgr 0)"
sleep 1
sleep 1
echo "$(tput setaf 4)Soporte para Acceso Remoto$(tput sgr 0)"
echo "$(tput setaf 4)Paquete X11VNC$(tput sgr 0)"
sleep 1
echo "$(tput setaf 3)$(tput setab 0)$(tput bold)Ingrese la contraseña para el usuario remoto.$(tput sgr 0)"
echo "$(tput setaf 3)$(tput setab 0)$(tput bold)Debe ingresarla dos veces.$(tput sgr 0)"
echo "$(tput setaf 3)$(tput setab 0)$(tput bold)Se recomienda smol2014$(tput sgr 0)"
sleep 2
x11vnc --storepasswd
sleep 1
echo "$(tput setaf 3)Instalando Teamviewer$(tput sgr 0)"
	sudo dpkg -i install $SOFT/teamviewer_10.0.46203_amd64.deb
	sudo apt-get -f install --yes
echo "$(tput setaf 3)Instalando Anydesk$(tput sgr 0)"
	sudo dpkg -i install $SOFT/anydesk_2.9.5-1_amd64.deb 
echo "$(tput setaf 4)Corrigiendo paquetes(tput sgr 0)"
	sudo apt-get -f install --yes
echo "$(tput setaf 3)Instalando maxthon browser y paquetes necesarios$(tput sgr 0)"
	sudo dpkg -i install $SOFT/maxthon-browser-stable_1.0.5.3_amd64.deb
	sudo apt-get -f install --yes
echo "$(tput setaf 3)Maxthon browser se instaló de manera correcta$(tput sgr 0)"
sleep 1

#==============================================================================================================================
#======================================== Configuracion Java y Variables de Entorno ===========================================
#==============================================================================================================================

echo "$(tput setaf 3)$(tput setab 0)$(tput bold)Limpiando contenido del directorio /usr/lib/jvm$(tput sgr 0)"
sudo rm -rf /usr/lib/jvm/*
sudo cp $SOFT/jre-7u21-linux-x64.tar.gz /usr/lib/jvm/
cd /usr/lib/jvm/
sudo tar -xvf jre-7u21-linux-x64.tar.gz 
sudo  rm jre-7u21-linux-x64.tar.gz 
sleep 1
#***************************************** Asignar Java por defecto ***********************************************************
	sudo update-alternatives --install "/usr/bin/java" "java" "/usr/lib/jvm/jre1.7.0_21/bin/java" 1
	sudo update-alternatives --set java "/usr/lib/jvm/jre1.7.0_21/bin/java"
	echo "$(tput setaf 4)Verificando versión de java$(tput sgr 0)"
	echo ""
	echo "$(tput setaf 2)$(tput setab 0)$(tput bold)"
	java -version
	echo "$(tput sgr 0)"
	cd	
	sleep 1
#***************************************** Asignar variables de entorno ***********************************************************
echo "$(tput setaf 3)$(tput setab 0)$(tput bold)Agregando validacion en el archivo /etc/profile$(tput sgr 0)"
sudo sed -i '$ a\#' /etc/profile
sudo sed -i '$ i\#' /etc/profile
sudo sed -i '$ i\if [ -f /home/smolies/SMOLLinux/config/smolrc ]; then' /etc/profile
sudo sed -i '$ i\	. /home/smolies/SMOLLinux/config/smolrc' /etc/profile
sudo sed -i '$ i\	export PATH=$PATH:$SMOL_HOME' /etc/profile
sudo sed -i '$ i\fi' /etc/profile
sleep 1
source /etc/profile
echo "$(tput setaf 4)SMOL_HOME$(tput sgr 0)"
echo $SMOL_HOME
echo "$(tput setaf 4)POSTGRESQL$(tput sgr 0)"
echo $POSTGRESQL
echo "$(tput setaf 4)PATH$(tput sgr 0)"
echo $PATH
sleep 3

#============================================================================================================================
#====================================== Configuracion JBOSS7 y Links Simbolicos =============================================
#============================================================================================================================

echo "$(tput setaf 4)$(tput bold)Configuración jboss7 y links simbólicos$(tput sgr 0)"
echo "$(tput setaf 4)************* Generando componente jboss *************$(tput sgr 0)"
echo ""
sudo mv /home/smolies/SMOLLinux/jboss-as-7.1.1.Final /opt/
sudo cp /opt/jboss-as-7.1.1.Final/bin/init.d/jboss-as-standalone.sh   /etc/init.d/jboss7
sudo ln -s /opt/jboss-as-7.1.1.Final/ /home/smolies/SMOLLinux/jboss-as-7.1.1.Final

#********************************************** Configuración JBOSS *********************************************************
echo "$(tput setaf 4)****************** Agregando componente JBOSS como servicio *****************$(tput sgr 0)"
echo ""
echo "$(tput setaf 3)$(tput setab 0)$(tput bold)Por favor revise las configuraciones del archivo jboss7$(tput sgr 0)"
	echo ""
	sleep 5
	sudo gedit /etc/init.d/jboss7
	sleep 1  
#************************************************** Links Simbólicos ********************************************************


sudo ln -s /etc/init.d/jboss7 /etc/rc0.d/K90jboss7
sudo ln -s /etc/init.d/jboss7 /etc/rc1.d/K90jboss7
sudo ln -s /etc/init.d/jboss7 /etc/rc2.d/K90jboss7
sudo ln -s /etc/init.d/jboss7 /etc/rc2.d/S90jboss7
sudo ln -s /etc/init.d/jboss7 /etc/rc3.d/S90jboss7
sudo ln -s /etc/init.d/jboss7 /etc/rc4.d/S90jboss7
sudo ln -s /etc/init.d/jboss7 /etc/rc5.d/S90jboss7
sudo ln -s /etc/init.d/jboss7 /etc/rc6.d/K90jboss7

sleep 1
echo "$(tput setaf 2)Se han creado los siguientes links simbólicos:$(tput sgr 0)"
echo
ls -l /etc/rc*.d/*jboss7*
sleep 3
echo

#============================================================================================================================
#===================================== Permisos de Ejecución a los archivos bash ============================================
#============================================================================================================================

echo "$(tput setaf 4)Otorgando permisos de ejecución a los script sh.$(tput sgr 0)"
sleep 1
sudo sed -i '$ i\echo "nameserver 8.8.8.8"  | sudo tee --append /etc/resolv.conf ' /etc/rc.local
sudo sed -i '$ i\echo "nameserver 8.8.4.4"  | sudo tee --append /etc/resolv.conf ' /etc/rc.local
sudo cp   $SOFT/deploy-smol.sh /bin/deploy-smol.sh
sudo chmod +x $COMM/RunNoGui.sh 						
sudo chmod +x $COMM/Run.sh
sudo chmod +x /opt/jboss-as-7.1.1.Final/bin/standalone.sh
sudo chmod +x $SCO/run-local.sh
sudo chmod +x /home/smolies/SMOLLinux/Backup-Util/runBackup.sh
sudo chmod +x /etc/init.d/SystemEmail
sudo chmod +x /etc/init.d/SystemSpace
sudo chmod +x /bin/deploy-smol.sh
sudo chmod +x /etc/rc.local
sudo chmod +x /lib/lsb/init-functions
sudo chmod +x /etc/init.d/jboss7
sudo chmod +x /etc/resolv.conf

sudo cp   /home/smolies/SMOLLinux/config/*    /etc/init.d/
cd /etc/init.d/
sudo update-rc.d SystemEmail defaults
sudo update-rc.d SystemSpace defaults
sudo update-rc.d smolrc defaults 
cd

echo "$(tput setaf 4)[Hecho]$(tput sgr 0)"
sleep 1

#============================================================================================================================
#=================================================== Instalar PostgreSQL ====================================================
#============================================================================================================================

echo "$(tput setaf 4)$(tput bold)Iniciando Proceso de Instalación para postgreSQL version 9.2.3.1$(tput sgr 0)"
echo ""
sleep 1
echo "$(tput setaf 4)Cambiando ubicación a $SOFT$(tput sgr 0)"
cd $SOFT
echo "$(tput setaf 4)Ahora el directorio de trabajo es: $(tput sgr 0)"
pwd
sleep 1
echo "$(tput setaf 4)Generando Permisos de ejecución al instalador de Postgres$(tput sgr 0)"
echo "$(tput setaf 4)Ingrese la contraseña de usuario de ser necesario.$(tput sgr 0)"
echo ""
sudo chmod +x postgresql-9.5.7-1-linux-x64.run
sleep 1
echo "$(tput setaf 4)Comenzando la instalación en modo gráfico.$(tput sgr 0)"
echo "$(tput setaf 4)Ejecute las configuraciones pertinentes.$(tput sgr 0)"
echo ""
sleep 1
sudo ./postgresql-9.5.7-1-linux-x64.run
sleep 1

#************************************************* Validación PostgreSQL ***********************************************

echo "$(tput setaf 4)$(tput bold)Validando instalación de Postgres$(tput sgr 0)"
echo ""
sleep 1

if [ -d $POSTG ]; then
	echo "$(tput setaf 2)Ahora postgres esta instalado$(tput sgr 0)"
	sleep 1 
fi

#============================================================================================================================
#============================================ Agregar la ip de IES en pg_hba.conf ====================================================
#============================================================================================================================
sudo sed -i '$ a\#' /opt/PostgreSQL/9.5/data/pg_hba.conf
sudo sed -i '$ i\host     all             all             190.0.24.226/32         md5' /opt/PostgreSQL/9.5/data/pg_hba.conf


#============================================================================================================================
#====================================== Configuración de reglas y puertos en el firewall ====================================
#============================================================================================================================

echo "$(tput setaf 4)$(tput bold)Configuración de reglas y servicios en el firewall$(tput sgr 0)"
sleep 1
sudo iptables -A INPUT -m state --state ESTABLISHED,RELATED -j ACCEPT
sudo iptables -A INPUT -p tcp -m tcp --tcp-flags FIN,SYN,RST,ACK SYN -j ULOG	
# HABILITAR PUERTOS LINUX MINT
sudo ufw enable
sudo ufw allow 20/tcp
sudo ufw allow 21/tcp
sudo ufw allow 22/tcp
sudo ufw allow 25/tcp
sudo ufw allow 465/tcp
sudo ufw allow 80/tcp
sudo ufw allow 5900/tcp
sudo ufw allow 5901/tcp
sudo ufw allow 5902/tcp
sudo ufw allow 5903/tcp
sudo ufw allow 443/tcp
sudo ufw allow 587/tcp
sudo ufw allow 631/tcp
sudo ufw allow 1095/tcp
sudo ufw allow 1097/tcp
sudo ufw allow 1098/tcp
sudo ufw allow 1099/tcp
sudo ufw allow 3389/tcp
sudo ufw allow 5432/tcp
sudo ufw allow 8161/tcp
sudo ufw allow 8443/tcp
sudo ufw allow 8888/tcp
sudo ufw allow 49152/tcp
sudo ufw allow 10000/tcp
sudo ufw allow 30300:30309/tcp
sudo ufw allow 69/udp
echo "$(tput setaf 4)Se Completó la configuración, ahora se procederá a recargar el firewall$(tput sgr 0)"
sleep 1
sudo ufw reload

#============================================================================================================================
#=========================================== Instalar y configurar Servidor VSFTPD ==========================================
#============================================================================================================================

echo "$(tput setaf 4)Se habilita el servicio vsftp$(tput sgr 0)"
sleep 1
sudo service vsftpd start
echo "$(tput setaf 3)$(tput setab 0)$(tput bold)Por favor edite el archivo de configuración para vsftpd --> vsftpd.conf$(tput sgr 0)"
sleep 1
sudo geditvi 
echo "pasv_min_port=30300"  | sudo tee --append /etc/vsftpd.conf
echo "pasv_max_port=30309"  | sudo tee --append /etc/vsftpd.conf
echo 'seccomp_sandbox=NO' >> /etc/vsftpd.conf 
echo "$(tput setaf 4)Se Completó la configuración, ahora se reinicia el servicio vsftpd$(tput sgr 0)"
sleep 1
sudo service vsftpd restart
echo ""

#============================================================================================================================
#============================================ Optimización de la memoria ====================================================
#============================================================================================================================

echo "$(tput setaf 4)$(tput bold)Se modifican archivos de configuración para optimizar el uso de memoria$(tput sgr 0)"
sleep 1
sudo sed -i '$ a\#' /etc/sysctl.conf
sudo sed -i '$ i\#' /etc/sysctl.conf
sudo sed -i '$ i\# Optimización de memoria' /etc/sysctl.conf
sudo sed -i '$ i\# Reducir el porcentaje de uso swap/ram al 10%' /etc/sysctl.conf
sudo sed -i '$ i\vm.swappiness=20' /etc/sysctl.conf
sudo sed -i '$ i\# Disminuir valor de cache de bloques de datos de 100 a 50' /etc/sysctl.conf
sudo sed -i '$ i\vm.vfs_cache_pressure=50' /etc/sysctl.conf
sudo sed -i '$ i\# Modificar la frecuencia de acceso al disco de 500 a 1500' /etc/sysctl.conf
sudo sed -i '$ i\vm.dirty_writeback_centisecs=1500' /etc/sysctl.conf
sudo sed -i '$ i\# Configuracion para buffer postgres' /etc/sysctl.conf
sudo sed -i '$ i\kernel.shmmax=17179869184' /etc/sysctl.conf
sudo sed -i '$ i\kernel.shmall=4194304' /etc/sysctl.conf
sudo sed -i '$ i\fs.file-max=500000' /etc/sysctl.conf
sudo sysctl -p
echo "$(tput setaf 4)[Hecho].$(tput sgr 0)"
sleep 1

#============================================================================================================================
#============================================== Fin de la Configuración =====================================================
#============================================================================================================================

echo "$(tput setaf 2)$(tput setab 0)$(tput bold)Finalizando Ejecución... $(tput sgr 0)" 
sudo apt-get clean
sleep 5
echo "$(tput setaf 2)$(tput setab 0)$(tput bold)Este proceso de configuración se realizó el: $(tput sgr 0)" 
date
sleep 5
exit

#============================================================================================================================
