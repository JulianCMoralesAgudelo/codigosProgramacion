#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : menuPython
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 22-03-2022
Documentación   : https://www.youtube.com/watch?v=Gk_fk1RvAys&t=4886s
Descripcion     : Ejemplo de menu y uso de listas.
'''
# Importar librerias
import configparser
import os

configparser.__name__

# Declaracion de constantes.
AGREGAR = 1
INSERTAR = 2
MOSTRAR = 3
BUSCAR = 4
ELIMINAR = 5
ORDENAR = 6
LIMPIAR = 7
SALIR = 0

# Declaracion de variables
datos = []

# Declaracion de funciones
# Borrar pantalla

def borrarPantalla():  # Definimos la función estableciendo el nombre que queramos
    if os.name == "posix":
        os.system("clear")
    elif os.name == "ce" or os.name == "nt" or os.name == "dos":
        os.system("cls")


def menu():
    borrarPantalla()
    print('******** BIENVENIDO *************')
    print(f'''
    {AGREGAR}) Agregar
    {INSERTAR}) Insertar
    {MOSTRAR}) Mostrar
    {BUSCAR}) Buscar
    {ELIMINAR}) Eliminar
    {ORDENAR}) Ordenar
    {LIMPIAR}) Limpiar
    {SALIR}) Salir''')
    print('\n*******************************')


def agregar_registro():
    print('             Agregar')
    nombre = input('Nombre: ')
    datos.append(nombre)
    print('\nRegistro agregado con exito')


def insertar_registro():
    print('             Insertar')
    nombre = input('Nombre: ')
    pos = int(input('Posicion: '))
    datos.insert(pos, nombre)
    print('\nRegistro insertado con exito')


def mostrar_registro():
    print('             Mostrar')
    if len(datos) > 0:
        for elemento in datos:
            print(elemento)
    else:
        print('No hay datos en la lista\n')


def buscar_registro():
    print('             Buscar')
    if len(datos) > 0:
        nombre = input('Dato a buscar: ')
        if nombre in datos:            
            cantidad = datos.count(nombre)
            inicio = 0
            for elemento in range(cantidad):
                pos = datos.index(nombre, inicio)
                print(f'{nombre} se encuentra registrado en la poscicion {pos + 1}\n')
                inicio = pos + 1
        else:
            print(f'{nombre} no registrado.\n')
    else:
        print('No hay datos en la lista.')


def eliminar_registro():
    print('             Eliminar')
    if len(datos) > 0:
        for elemento in range(len(datos)):
            print(f'{elemento+1}.{datos[elemento]}')
        print('0. Cancelar')
        pos = int(input(f'Posicion a eliminar(1- {len(datos)}): '))
        if 0 < pos <= len(datos):
            datos.pop(pos-1)
            print('Registro eliminado.\n')
        else:
            print('No se eliminara ningun registro.\n')
    else:
        print('No hay datos en la lista.\n')


def ordenar_registros():
    print('             Eliminar')
    if len(datos) > 0:
        datos.sort()
        print('Datos ordenados alfabeticamente.\n')
    else:
        print('No hay datos.\n')


def limpiar_registros():
    print('             Limpiar')
    datos.clear()
    print('Datos eliminados.\n')


def main():
    continuar = True
    while continuar:
        menu()
        print('')
        opcion = int(input('Seleccione una opcion: '))
        borrarPantalla()
        if opcion == AGREGAR:
            agregar_registro()
        elif opcion == INSERTAR:
            insertar_registro()
        elif opcion == MOSTRAR:
            mostrar_registro()
        elif opcion == BUSCAR:
            buscar_registro()
        elif opcion == ELIMINAR:
            eliminar_registro()
        elif opcion == ORDENAR:
            ordenar_registros()
        elif opcion == LIMPIAR:
            limpiar_registros()
        elif opcion == SALIR:
            print('Hasta pronto')
            continuar = False
        else:
            print('Opcion no valida')
        input("\nPresiona enter para continuar....")


if __name__ == '__main__':
    main()
