#!/bin/sh

# Recorremos los archivos de video en la carpeta actual
for filename in *.mp4; do
  # La variable $filename será el nombre de cada archivo
  # Obtenemos la resolución
  res=$(ffgetres $filename)
  # La variable $res será la resolución del archivo $filename
  # Mostramos la resolución del archivo
  echo "$filename, Resolution: $res";

  # Si la resolución es diferente a la deseada
  if [ "$res" != "1920x1080" ]; then

    # Anunciamos la escalación del archivo
    echo "Scaling $filename to 1920x1080";
    # Escalamos el archivo, con nuestra recién creada máscara
    ffscale $filename 1920 1080
	# Al terminar, informamos al usuario
    echo "File $filename is scaled"
    # Vamos a borrar el original y a renombrar el nuevo
    echo "Overriding original $file"
    # Borramos original
    rm $filename
    # Renombramos el nuevo
    mv scaled-$filename $filename
    # Anunciamos el cambio
    echo "$filename is 1920x1080"
  fi;
done

echo "Donezo!";


