sudo apt update
sudo apt -y install wget curl
curl -O https://download.java.net/java/GA/jdk18/43f95e8614114aeaa8e8a5fcf20a682d/36/GPL/openjdk-18_linux-x64_bin.tar.gz
sudo rm -rf /usr/lib/jvm/*
sudo cp openjdk-18_linux-x64_bin.tar.gz /usr/lib/jvm/
cd /usr/lib/jvm/
sudo tar -xvf openjdk-18_linux-x64_bin.tar.gz
sudo rm openjdk-18_linux-x64_bin.tar.gz 
sleep 1
sudo update-alternatives --install "/usr/bin/java" "java" "/usr/lib/jvm/jdk-18/bin/java" 1
sudo update-alternatives --set java "/usr/lib/jvm/jdk-18/bin/java"
sudo tee /etc/profile.d/jdk18.sh <<EOF
export JAVA_HOME=/usr/lib/jvm/jdk-18
export PATH=\$PATH:\$JAVA_HOME/bin
EOF
