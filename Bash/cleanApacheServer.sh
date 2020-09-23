#!/bin/bash
#!/bin/bash
# scripts bash imprescindibles de un sysadmin linux
#
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
sleep 5s; echo "Deshabilitando Swap"
swapoff -a
echo "OK - Swap deshabilitado"
echo "<---------------------------------------------------------->"
sleep 5s; echo "Liberando page-caches, dentries e inodes"
sync;sysctl -w vm.drop_caches=3;sync
echo "OK - Server liberado"
echo "<---------------------------------------------------------->"
sleep 2s; echo "Habilitando la Swap"
swapon -a
echo "OK - Swap habilitado"
echo "<---------------------------------------------------------->"
sleep 2s; echo "Habilitando HTTP"
service httpd start
echo "OK - Http habilitado"
echo "<---------------------------------------------------------->"
sleep 2s; free
echo ".....MANTENIMIENTO CONCLUIDO....."
echo "<---------------------------------------------------------->"
echo "<---------------------------------------------------------->"