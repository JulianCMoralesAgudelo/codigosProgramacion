#liberaPlesk.sh
#!/bin/bash
echo "<---------------------------------------------------------->"
echo "<---------------------------------------------------------->"
echo "Comprobando estado de memoria"
free
echo "OK - Comprobacion completada"
echo "<---------------------------------------------------------->"
sleep 2s; echo “Limpieza de memoria cache y swap“;
echo "<---------------------------------------------------------->"
sleep 2s; echo "Deshabilitando HTTP"
killall -KILL httpd
echo "OK - Http deshabilitado"
echo "<---------------------------------------------------------->"
sleep 1s; echo "Deshabilitando Swap"
swapoff -a
echo "OK - Swap deshabilitado"
echo "<---------------------------------------------------------->"
sleep 2s; echo "Liberando pagecaches, dentries e inodes"
sync;sysctl -w vm.drop_caches=3;sync
echo "OK - Server liberado"
echo "<---------------------------------------------------------->"
sleep 3s; echo "Habilitando la Swap"
swapon -a
echo "OK - Swap habilitado"
echo "<---------------------------------------------------------->"
sleep 3s; echo "Habilitar HTTP, reinciar MariaDB y Nginx"
systemctl restart mariadb.service
sleep 2s; service nginx restart
sleep 3s; service httpd start
echo "OK - Http habilitado"
echo "<---------------------------------------------------------->"
sleep 3s; echo "Habilitando Memcached"
chkconfig memcached on
service memcached restart
echo "OK - Memcached habilitado"
echo "<---------------------------------------------------------->"
#service ddos restart
sleep 2s; echo "Comprobacion rutinaria"
echo "Script liberadorPLESK sh"
echo "https://www.sololinux.es"
echo "<---------------------------------------------------------->"
sleep 2s; free
echo ".....MANTENIMIENTO FINALIZADO....."
echo "<---------------------------------------------------------->"
echo "<---------------------------------------------------------->"
