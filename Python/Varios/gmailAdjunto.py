#!/usr/bin/env python3
# -*- coding: utf-8 -*-

#Importamos librerías
import smtplib
import mimetypes

# Importamos los módulos necesarios
from email.MIMEMultipart import MIMEMultipart
from email.MIMEImage import MIMEImage
from email.Encoders import encode_base64

# Creamos objeto Multipart, quien será el recipiente que enviaremos
msg = MIMEMultipart()
msg['From']="desde@gmail.com"
msg['To']="para@gmail.com"
msg['Subject']="Correo con imagen Adjunta"

# Adjuntamos Imagen
file = open("fondo.jpg", "rb")
attach_image = MIMEImage(file.read())
attach_image.add_header('Content-Disposition', 'attachment; filename = "avatar.png"')
msg.attach(attach_image)

# Autenticamos
mailServer = smtplib.SMTP('smtp.gmail.com',587)
mailServer.ehlo()
mailServer.starttls()
mailServer.ehlo()
mailServer.login("desde@gmail.com","pasword")

# Enviamos
mailServer.sendmail("desde@gmail.com", "hasta@alu.uct.cl", msg.as_string())

# Cerramos conexión
mailServer.close()
