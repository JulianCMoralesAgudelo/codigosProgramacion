#!/usr/bin/env python3
# -*- coding: UTF-8 -*-
from email import message
import smtplib
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText

print("*** enviar email con gmail ****")
user = ''
password = ''

# Cabeceras
remitente = input("From, ejemplo: administrador <admin@gmail.com>: ")
destinatario = input("To, ejemplo: amigo <amigo@gmail.com>: ")
asunto = input("Subject, Asunto del mensaje: ")
mensaje = input("Mensaje HTML:")

# Host y puerto
gmail = smtplib.SMTP('smtp.gmail.com', 587)

# Protocolo de cifradio de datos
gmail.starttls()

# Credenciales
gmail.login(user, password)

# Muestra de la operacion de envio 1=true
gmail.set_debuglevel(1)

# Cabecera
header = MIMEMultipart()
# Asunto
header['Subject'] = asunto
# Remitente
header['From'] = remitente
# Destinatario
header['To'] = destinatario

# Pasar mensaje a html
mensaje = MIMEText(mensaje, 'html')  # Content-type:text/html
# Se agrega a la cabecera
header.attach(mensaje)

# Enviar email.
gmail.sendmail(remitente, destinatario, header.as_string())

# Cerrar conexion SMTP
gmail.quit()
