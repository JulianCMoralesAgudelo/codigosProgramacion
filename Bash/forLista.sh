#!/bin/bash

# Bucle for para iterar sobre una lista de nombres
nombres=("Juan" "María" "Carlos" "Ana")
echo "Iterando sobre la lista de nombres:"
for nombre in "${nombres[@]}"; do
    echo "Hola, $nombre"
done
