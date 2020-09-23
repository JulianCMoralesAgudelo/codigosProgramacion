#!/usr/bin/env python
# -*- coding: UTF-8 -*-
# importando el modulo de regex de python
import re
correos = [
    "hola@", "contacto@parzibyte.me", "staff@hotmail.com",
    "juan.perez@sitio.com", "maggie@outlook.com", "parzibyte@gmail.com", "asd",
    "luis@gmail@hotmail.com"
]

for correo in correos:
    print("Probando si '{}' es válido...{}".format(correo,
                                                   es_correo_valido(correo)))
