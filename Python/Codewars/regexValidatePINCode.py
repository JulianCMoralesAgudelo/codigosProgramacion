#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : regexValidatePINCode.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-02-11
Documentación   : https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/python
Descripcion     :

Los cajeros automáticos permiten códigos PIN de 4 o 6 dígitos y los códigos PIN no pueden contener nada más que exactamente 4 dígitos o exactamente 6 dígitos.

Si a la función se le pasa una cadena de PIN válida, devuelve verdadero, de lo contrario devuelve falso.

1) Leer pin

2) Validar que sea numeros enteros

3) Validar longitud del pin

'''


def validate_pin(pin):
    # return true or false
    try:
        if (int(pin.isnumeric()) & (len(pin) == 4) | (len(pin) == 6) & (pin.isalnum())):
            return True
        else:
            return False
    except:
        return False


# return true or false
print(validate_pin("1"), False, "Wrong output for '1'")
print(validate_pin("12"), False, "Wrong output for '12'")
print(validate_pin("123"), False, "Wrong output for '123'")
print(validate_pin("12345"), False, "Wrong output for '12345'")
print(validate_pin("1234567"), False, "Wrong output for '1234567'")
print(validate_pin("-1234"), False, "Wrong output for '-1234'")
print(validate_pin("-12345"), False, "Wrong output for '-12345'")
print(validate_pin("1.234"), False, "Wrong output for '1.234'")
print(validate_pin("00000000"), False, "Wrong output for '00000000'")
print(validate_pin("a234"), False, "Wrong output for 'a234'")
print(validate_pin(".234"), False, "Wrong output for '.234'")
print(validate_pin("1234"), True, "Wrong output for '1234'")
print(validate_pin("0000"), True, "Wrong output for '0000'")
print(validate_pin("1111"), True, "Wrong output for '1111'")
print(validate_pin("123456"), True, "Wrong output for '123456'")
print(validate_pin("098765"), True, "Wrong output for '098765'")
print(validate_pin("000000"), True, "Wrong output for '000000'")
print(validate_pin("123456"), True, "Wrong output for '123456'")
print(validate_pin("090909"), True, "Wrong output for '090909'")
print(validate_pin("1234.0"), False, "Wrong output for '1234.0'")
print(validate_pin("09876"), False, "Wrong output for '09876'")
print(validate_pin("+88888"), False, "Wrong output for '+88888'")
