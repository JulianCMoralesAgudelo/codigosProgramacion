#!/usr/bin/env python
# -*- coding: utf-8 -*-

# Enviar correo Gmail con Python
# www.pythondiario.com

import smtplib

fromaddr = ''
toaddrs  = ''
msg = 'Correo enviado utilizano Python + smtplib en www.pythondiario.com'


# Datos
username = ''
password = ''

# Enviando el correo
server = smtplib.SMTP('smtp.gmail.com:587')
server.starttls()
server.login(username,password)
server.sendmail(fromaddr, toaddrs, msg)
server.quit()
