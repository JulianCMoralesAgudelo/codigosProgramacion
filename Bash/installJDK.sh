# From
# https://gist.github.com/LongClipeus/77b0beda7a3a794688a5c4257007d3c8
# <script src="https://gist.github.com/LongClipeus/77b0beda7a3a794688a5c4257007d3c8.js"></script>
sudo s

#create jvm directory
mkdir /usr/lib/jvm

#uncompress, change to your file name
tar -zxf jdk-8u211-linux-x64.tar.gz -C /usr/lib/jvm

#check if files are there
#ls /usr/lib/jvm

#update alternatives so the command java point to the new jdk 
update-alternatives --install /usr/bin/java java /usr/lib/jvm/java-8-oracle/bin/java 100


#update alternatives so the command javac point to the new jdk 
sudo update-alternatives --install /usr/bin/javac javac /usr/lib/jvm/java-8-oracle/bin/javac 100

update-alternatives --display java

update-alternatives --display javac

#check if java is running
java -version
