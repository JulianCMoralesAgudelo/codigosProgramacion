#!/bin/bash
#!-*- ENCODING: UTF-8 -*-

#============================================================================================================================
#================================================= Definición de Constantes =================================================
#============================================================================================================================

#---Color de Letra
LNEGRA=$(tput setaf 0)
LROJA=$(tput setaf 1)
LVERDE=$(tput setaf 2)
LAMARILLA=$(tput setaf 3)
LAZUL=$(tput setaf 4)
LVIOLETA=$(tput setaf 5)
LAGUAM=$(tput setaf 6)
LGRIS=$(tput setaf 7)
LBLANCA=$(tput setaf 8)
#---Sombreado de Texto
RNEGRO=$(tput setab 0)
RROJO=$(tput setab 1)
RVERDE=$(tput setab 2)
RAMARILLO=$(tput setab 3)
RAZUL=$(tput setab 4)
RVIOLETA=$(tput setab 5)
RAGUAM=$(tput setab 6)
RGRIS=$(tput setab 7)
#---Negrita y Terminar Formato
BOLD=$(tput bold)
NOFORMAT=$(tput sgr 0)
#---URL Página Web
URLORIGINAL=http://www.nosinmiubuntu.com/script-para-crear-lanzadores/
URL=http://www.ingenieriadelin.co/blog/#
DIR=/usr/share/applications

#============================================================================================================================
#============================================ Información y Encabezado del Script ===========================================
#============================================================================================================================

echo ""
printf ${LVERDE}${BOLD}"Script de Configuración, que genera un 
lanzador de determinada aplicación.
Versión: 1.1
URL Autor Original: $URLORIGINAL
Modificado por: Yobany Alexander Rosso Uribe
Actualizado: 2015-06-10
URL: $URL
"$NOFORMAT
echo ""
echo $LBLANCA${BOLD}"Se Preparará el Sistema para Crear el Lanzador"$NOFORMAT
echo ""

sleep 5

#============================================================================================================================
#============================================== Recolección de datos Necesarios =============================================
#============================================================================================================================

echo "El nombre del lanzador no debe contener espacios."$NOFORMAT
read -p "Nombre del lanzador: " NOMBRE                      # Se nos pide el nombre del lanzador.
if [ -e /usr/share/applications/$NOMBRE.desktop ]; then     # Si el lanzador ya existe...
	echo $LROJA"ERROR: El lanzador ya existe.  Abortado."$NOFORMAT
	echo $LAMARILLA"Introduce tu contraseña de usuario si es necesario,"$NOFORMAT
	echo $LAMARILLA"para intentar crear un lanzador en el Escritorio."$NOFORMAT
	sudo cp /usr/share/applications/$NOMBRE.desktop /home/$USER/Escritorio/
	sudo chmod 777 /home/$USER/Escritorio/$NOMBRE.desktop
	echo ${LVERDE}${BOLD}"El lanzador ha sido creado con éxito y con los siguientes parámetros:"$NOFORMAT
	echo
	cat /usr/share/applications/$NOMBRE.desktop
	echo
	sleep 2
 exit                                                # ...salimos del script.
fi

if [ -e /usr/local/share/applications/$NOMBRE.desktop ]; then     # Si el lanzador ya existe...
	echo $LROJA"ERROR: El lanzador ya existe.  Abortado."$NOFORMAT
	echo $LAMARILLA"Introduce tu contraseña de usuario si es necesario,"$NOFORMAT
	echo $LAMARILLA"para intentar crear un lanzador en el Escritorio."$NOFORMAT
	sudo cp /usr/local/share/applications/$NOMBRE.desktop /home/$USER/Escritorio/
	sudo chmod 777 /home/$USER/Escritorio/$NOMBRE.desktop
	echo ${LVERDE}${BOLD}"El lanzador ha sido creado con éxito y con los siguientes parámetros:"$NOFORMAT
	echo
	cat /usr/local/share/applications/$NOMBRE.desktop
	echo
	sleep 2
 exit                                                # ...salimos del script.
fi

read -p "Ruta completa del archivo ejecutable: " RUTAEXE    # Se nos pide la ruta completa del archivo ejecutable.
if [ ! -e $RUTAEXE ]; then                                  # Si el archivo ejecutable no existe...
	echo $LROJA "ERROR: El archivo no existe.  Abortado."$NOFORMAT
	sleep 2
 exit                                                # ...salimos del script.
elif [ ! -x $RUTAEXE ]; then                                # O si el archivo no es ejecutable...
	$LROJA echo "ERROR: El archivo no es ejecutable.  Abortado."$NOFORMAT
	sleep 2
 exit                                                # ...salimos del script.
fi

read -p "Ingrese la ruta completa del archivo de icono: " RUTAICO # Se nos pide la ruta completa del archivo de icono.
if [ ! -e $RUTAICO ]; then                                  # Si el archivo de icono no existe...
	$LROJA echo "ERROR: El archivo no existe."
	echo "..........Abortado....."$NOFORMAT
	sleep 2
 exit                                                # ...salimos del script.
fi

#============================================================================================================================
#===================================================== Creando Lanzador =====================================================
#============================================================================================================================

echo "Creando Lanzador..."
echo "Esto puede tardar unos segundos..."
sleep 2
echo "[Desktop Entry]" > $NOMBRE.desktop                    # Se crea el archivo del lanzador
echo "Version=1.0" >> $NOMBRE.desktop
echo "Encoding=UTF-8" >> $NOMBRE.desktop
echo "Type=Application" >> $NOMBRE.desktop                  # Se Escriben los datos necesarios
echo "Terminal=false" >> $NOMBRE.desktop                    # anteriormente facilitados.
echo "Name=$NOMBRE" >> $NOMBRE.desktop
echo "Exec=$RUTAEXE" >> $NOMBRE.desktop
echo "Icon=$RUTAICO" >> $NOMBRE.desktop

sleep 5

echo "Lanzador creado."
sleep 1
echo "Ahora se moverá el lanzador al directorio '/usr/share/applications/'."
sleep 1
echo $LAMARILLA"Introduzca la contraseña de usuario si es necesario."$NOFORMAT
sleep 1
echo ${LAZUL}"Otorgando permisos de Administrador al Lanzador..."
sudo chown root:root $NOMBRE.desktop                        # Hacemos que el lanzador pertenezca a root
sleep 1
echo "Moviendo Lanzador a /usr/share/applications"/$NOMBRE.desktop
if [ ! -d /usr/share/applications/ ]; then 
	if [ -d /usr/local/share/applications/$NOMBRE.desktop ]; then
		sudo mv $NOMBRE.desktop /usr/local/share/applications/
                $DIR=/usr/local/share/applications
	fi
else 
	sudo mv $NOMBRE.desktop /usr/share/applications/            # y lo enviamos al directorio de los lanzadores.
	$DIR=/usr/share/applications
fi
sleep 1
echo "Creando copia de Lanzador $NOMBRE.desktop en Escritorio."
sleep 1
sudo cp $DIR/$NOMBRE.desktop /home/$USER/Escritorio/ 
sudo chmod 777 /home/$USER/Escritorio/$NOMBRE.desktop
sleep 1

#============================================================================================================================
#=============================================== Verificación y Fin del Script ==============================================
#============================================================================================================================

echo ${LVERDE}${BOLD}"El lanzador ha sido creado con éxito y con los siguientes datos:"
echo
cat $DIR/$NOMBRE.desktop
echo ""$NOFORMAT
