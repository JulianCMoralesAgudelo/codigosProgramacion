#!/bin/bash

# Bucle for para iterar sobre la salida de un comando
echo "Procesos en ejecución:"
for proceso in $(ps aux | grep -v USER | awk '{print $11}'); do
    echo "$proceso"
done