#!/usr/bin/env python
# -*- coding: utf-8 -*-

import getpass

# Captura usuario actual del sistema
usuario = getpass.getuser()

# Permite introducir una contraseña (no visible)
password = getpass.getpass()

print(usuario, password)
