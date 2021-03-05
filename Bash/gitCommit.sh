#!/bin/bash
# -*- ENCODING: UTF-8 -*-


<<'MULTILINE-COMMENT'
Script          : gitCommit.sh
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-08
Documentación   : https://codigofacilito.com/articulos/buenas-practicas-en-commits-de-git
Descripcion     : Buenas Practicas en Commits de Git
Sugerencias     : Hacer ejecutable y mover a la carpeta /bin, modificar la carpeta del repositorio.
MULTILINE-COMMENT

clear

git config --global user.email "juliancmorales10@gmail.com"
git config --global user.name "julian"


######################################################################################################################################################################################
while true; do

    echo "¿Seleccione el tipo de commit que desea realizar?"
    echo ""
    echo "1. feat: Una nueva caracteristica?."
    echo "2. fix: Se soluciono un bug."
    echo "3. style: Se aplico formato, comas y puntos faltantes, etc; Sin cambios en el codigo?."
    echo "4. refactor: Refactorizacion del codigo en produccion."
    echo "5. test: Se añadieron pruebas, refactorizacion de pruebas; Sin cambios en el codigo."
    echo ""
    echo "Seleccione una opcion [1 - 5] :"
    echo ""
    read -p "Tipo de commit: " opcion

    case $opcion in
    "1")
        type='feat'
        ;;
    "2")
        type='fix'
        ;;
    "3")
        type='style'
        ;;
    "4")
        type='refactor'
        ;;
    "5")
        type='test'
        ;;
    *) ;;
    esac

    echo ""

    read -p "¿El tipo de commit selecionado es? :$type  S/N? " opcion

    case $opcion in
    [Ss]*)
        echo "Confirmado. !"
        break
        ;;
    [Nn]*)
        echo "Elija nuevamente. !"
        exit
        ;;
    *) echo "Seleccione Si o No." ;;
    esac

done

######################################################################################################################################################################################
echo ""
echo "Indique el asunto para el commit:
Como sugerencia, el asunto no debe contener mas de 50 caracteres, debe iniciar con una letra mayuscula y no terminar con un punto. 
Debemos ser imperativos al momento de redactar nuestro commit, es decir hay que ser objetivos y muy importante tenemos que acostumbrarnos a escribirlos en Ingles 
esto es una de las mejores practicas que podemos tener en nuestros commits. "
echo ""
read -p "Asunto: " submit

echo ""
echo "Indique el cuerpo para el commit:
Como sugerencia, no todos los commits son lo suficientemente complejos como para necesitar de un cuerpo, sin embargo es opcional y se usan en caso de que el commit requiera una explicacion y contexto.
Utilizamos el cuerpo para explicar el ¿Que y Porque? de un commit y no el ¿Como? Al escribir el cuerpo, requerimos de una linea en blanco entre el titulo y el cuerpo, 
ademas debemos limitar la longitud de cada linea a no mas de 72 caracteres. " body
echo ""

read -p "Cuerpo: " body

echo "Indique el footer para el commit:
Como sugerencia, el pie es opcional al igual que el cuerpo, pero este es usado para el seguimiento de los IDs con incidencias. " footer
echo ""

read -p "Footer: " footer

# Carpeta donde esta configurado el repositorio
cd /home/julian/codigosProgramacion
git add *
git commit -m "Type :$type" -m "Submit :$submit" -m "Body: $body" -m "Footer: $footer"
git push
git log
