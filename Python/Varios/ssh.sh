Port 22
  PreferredAuthentications publickey
  IdentityFile "/Users/<localuser>/.ssh/keys/<myhost>_rsa"
  
ssh-keygen -q -b 2048 -P "" -f /Users/<localuser>/.ssh/keys/<myhost>_rsa -t rsa

type $env:USERPROFILE\.ssh\id_rsa.pub | ssh admindock@192.168.1.100 "cat >> ~/.ssh/authorized_keys && echo 'Key copied'"

cat ~/.ssh/id_rsa.pub | ssh   admindock@192.168.1.100 'cat >> .ssh/authorized_keys && echo "Key copied"'

