#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : compra.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 01-05-2021
Documentación   :
Descripcion     :

En un almacén se hace un 20% de descuento a los clientes cuya compra
supere los $500000.
¿Cuál será la cantidad que pagara una persona por su compra?.
'''

# Declaracion e inicializacion de variables


# lectura de datos
print("")
nombre = input("Ingrese sus nombres y apellidos: ")
print("")
precio = float(input("Ingrese el precio de su compra: "))

print("")
if precio > 500000:
    precioCompra = precio * 0.8
    descuento = precio - precioCompra
    print("El valor de su compra es por valor de: ", precio)
    print("Valor descuento: ", descuento)
    print("Total a pagar")
    print("El valor de su compra con un 20% de descuento: ", precioCompra)
else:
    print("Su compra no tiene descuento")
    print("El valor de su compra es por valor de: ", precio)
print("")

# Manipulacion de datos


# Presentacion de datos.
