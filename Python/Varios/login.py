#!/usr/bin/env python3
# -*- coding: utf-8 -*-

# Importacion de modulos
from contextlib import nullcontext
import getpass


'''
Autor: Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Descripcion: Script para simular un sistema de registro de usuarios con la estructura de datos diccionarios.
Fecha de creacion: 07/01/2021
'''


'''
# Definición
Escribir un programa que almacene la cadena de caracteres contraseña en variable.
'''

''' Diccionario de usuarios'''
usuarios = {}


'''##################################################################################################################################################################################################################################'''
'''
# Declaracion e inicializacion de variables
Funciones
'''


def menu():
    print('')
    print("----------- Sistema de registro -----------")
    print("1. Registro")
    print("2. Iniciar sesion")
    print("3. Editar Datos")
    print("4. Eliminar Cuenta")
    print("5. Mostrar registro de usuarios")
    print("6. Salir")
    print("-----------------------------------")


def registro():
    print('')
    print('Registro')
    print('Ingrese su nombre', end=': ')
    nombre = input()
    clave = getpass.getpass()
    usuarios[clave] = [nombre]
    print('Usuario Registrado')
    print('')


def sesion():
    print('')
    intentos = 0
    while intentos < 3:
        print('Ingrese sus contraseña')
        clave = getpass.getpass()
        if usuarios.get(clave):
            print('Bienvenido', usuarios[clave])
            intentos = 3
        else:
            intentos += 1
            print('Contraseña incorrecta')
            print('Intente nuevamente')


def editar():
    print('')
    respuesta = int(input('Realmente desea modificar sus datos: 1=Si : '))
    if(respuesta == 1):
        clave = getpass.getpass()
        respuesta = 0
        if usuarios.get(clave):
            respuesta = int(
                input('Que dato desea modificar 1: Nombre, 2: Contraseña: '))
            if respuesta == 1:
                nombre = input('Ingrese su nuevo nombre : ')
                usuarios[clave] = nombre
            elif respuesta == 2:
                newClave = input('Ingrese su nueva contraseña : ')
                usuarios[newClave] = usuarios.pop(clave)
            else:
                return "Hasta luego"
        else:
            return "Contraseña incorrecta"
    else:
        return "Hasta luego"


def eliminar():
    respuesta = int(input('Realmente desea eliminar sus datos: 1=Si : '))
    if(respuesta == 1):
        clave = getpass.getpass()
        print("Hasta luego")
        del usuarios[clave]


def mostrar():
    print('')
    print('Usuarios Registrados')
    for valor in usuarios.values():
        print(valor)


'''########################################################################################################################################################################################################################################'''

'''
Inicio del sistema
'''
menu()
dato = int(input("Seleccione una opcion: "))

while dato != 6:
    if dato == 1:
        registro()
    elif dato == 2:
        sesion()
    elif dato == 3:
        editar()
    elif dato == 4:
        eliminar()
    elif dato == 5:
        mostrar()
    menu()
    dato = int(input("Seleccione una opcion: "))
