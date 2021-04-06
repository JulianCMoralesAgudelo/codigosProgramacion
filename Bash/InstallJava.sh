sudo rm -rf /usr/lib/jvm/*
sudo cp openjdk-11+28_linux-x64_bin.tar.gz /usr/lib/jvm/
cd /usr/lib/jvm/
sudo tar -xvf openjdk-11+28_linux-x64_bin.tar.gz 
sudo rm openjdk-11+28_linux-x64_bin.tar.gz

#***************************************** Asignar Java por defecto ***********************************************************

sudo update-alternatives --install "/usr/bin/java" "java" "/usr/lib/jvm/jdk1.8.0_212/bin/java" 1
sudo update-alternatives --set java "/usr/lib/jvm/jdk1.8.0_212/bin/java"



sudo update-alternatives --install "/usr/bin/java" "java" "/usr/lib/jvm/java-11-openjdk-amd64/bin/java" 1
sudo update-alternatives --set java "/usr/lib/jvm/jdk1.8.0_111/bin/java"


sudo update-alternatives --install "/usr/bin/java" "java" "/usr/lib/jdk-11/bin/java" 1
sudo update-alternatives --set java "/usr/lib/jvm/jdk-11/bin/java"


sudo update-alternatives --install /usr/bin/jar jar /usr/lib/jvm/jdk1.8.0_111/bin/jar 2
sudo update-alternatives --install /usr/bin/javac javac /usr/lib/jvm/jdk1.8.0_111/bin/javac 2
sudo update-alternatives --set jar /usr/lib/jvm/jdk1.8.0_111/bin/jar
sudo update-alternatives --set javac /usr/lib/jvm/jdk1.8.0_111/bin/javac


sudo rm -rf /usr/lib/jvm/*
sudo cp /media/julian/Datos/software/jdk-7u80-linux-i586.tar.gz /usr/lib/jvm/
cd /usr/lib/jvm/
sudo tar -xvf jdk-7u80-linux-i586.tar.gz
sudo  rm jdk-7u80-linux-i586.tar.gz

#***************************************** Asignar Java por defecto ***********************************************************

sudo update-alternatives --install "/usr/bin/java" "java" "/usr/lib/jvm/jdk1.7.0_80/bin/java" 1

sudo update-alternatives --set java "/usr/lib/jvm/jdk1.7.0_80/bin/java"


sudo update-alternatives --config java

etc/profile
export JAVA_HOME=$(readlink -f /usr/bin/javac | sed "s:/bin/javac::")


Set the JAVA_HOME, JRE_HOME and PATH environment variables.

export JAVA_HOME=/opt/jdk1.8.0_201
export JRE_HOME=/opt/jdk1.8.0_201/jre
export PATH=$PATH:/opt/jdk1.8.0_201/bin:/opt/jdk1.8.0_201/jre/bin

Also add the above commands to /etc/bashrc or /etc/environment 
file to auto set environment variables during the system reboot.

sudo ln -s /opt/sts-bundle/ /usr/local/bin/sts

export JAVA_HOME=$(readlink -f /usr/bin/java | sed "s:bin/java::")
export JAVA_HOME=$(readlink -f /usr/bin/java | sed "s:jre/bin/java::")

echo JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64/ >> .bashrc


setx -m JAVA_HOME "g:\JDK\OpenJDK\jdk-11.0.2"

Using Java to Find JAVA_HOME
java -XshowSettings:properties -version 2>&1 > /dev/null | grep 'java.home' 

/usr/lib/jvm/openlogic-openjdk-11-hotspot-amd64
