#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : autosRent.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-05-03
Documentación   : https://www.comfenalcoantioquia.edu.co/
Descripcion     : 

Una compañía dedicada al alquiler de automoviles cobra un monto fijo de $300000
para los primeros 300 km de recorrido. Para más de 300 km y hasta 1000 km, cobra un
monto adicional de $ 15.000 por cada kilómetro en exceso sobre 300 km.

Para más de 1000 km cobra un monto adicional de $10.000 por cada kilómetro en exceso sobre los 1000 km.

Los precios ya incluyen el 20% del impuesto general a las ventas, IVA.

Diseñe un algoritmo que determine el monto a pagar por el alquiler de un vehículo y 
el monto incluído del impuesto.
'''

# Declaracion de variables
kilometros = 0.0
impuesto = 0.0
exceso = 0.0
monto = 0.0
nombre = ""

print("")
while True:
    print("Ingrese el kilometraje del viaje", end=": ")
    try:
        kilometros = float(input())
    except:
        print("\nDato invalido")
    if not(kilometros > 0):
        print("\nIntente nuevamente, por favor.\n")
    else:
        break

# Para más de 1000 km cobra un monto adicional de $10.000 por cada kilómetro en exceso sobre 1000.
if kilometros > 1000:    
    limite = 700 
    exceso = kilometros - 1000    
    monto = 300000 + exceso * 10000 + limite * 15000
    impuesto = monto * 0.2
    iva = monto * 0.19
    costoAlquiler = monto + impuesto 
# Para más de 300 km y hasta 1000 km, cobra un monto adicional de $ 15.000 por cada kilómetro en exceso sobre 300.
if kilometros > 300 and kilometros <= 1000:    
    exceso = kilometros - 300
    monto = 300000 + exceso * 15000
    impuesto = monto * 0.2
    iva = monto * 0.19
    costoAlquiler = monto + impuesto 
# Cobra un monto fijo de $300000 para los primeros 300 km de recorrido.
if kilometros <= 300:    
    monto = 300000
    impuesto = monto * 0.2
    iva = monto * 0.19
    costoAlquiler = monto + impuesto 

print("")
print("El monto del alquiler es de:\t\t", monto)
print("El kilometraje recorrido fue de:\t", kilometros)
print("El exceso en kilometros fue de:\t\t", exceso)
print("El impuesto general a las ventas es de:\t", impuesto)
print("El costo total del alquiler es:\t\t", costoAlquiler)
print("")
