#!/usr/bin/env python
# -*- coding: UTF-8 -*-
import time
import re
import smtplib
import ssl

# Filtrar correos
############################################################################################################################################################################

# Cadena con los correos
cadena = """ texto con correos
    """

# Se eliminan caracteres externos al utf8
cadena = cadena.encode('ascii', 'ignore').decode('ascii')

# Expresion regular para filtrar los correos
mailsearch = re.compile(r'[\w\-\.]+@[\w\-\.]+\.+[a-zA-Z]{1,4}')

# Lista para almacenar los correos
emails = []

#  Bucle para recorrer la cadena y extraer los correos
for mail in mailsearch.findall(cadena):
    emails.append(mail)

#  Bucle para Imprimir resultados
for mail in emails:
    ############################################################################################################################################################################
    smtp_server = "smtp.gmail.com"
    port = 587  # For starttls
    # Specify the sender’s and receiver’s email addresses:
    sender = "my@gmail.com"
    password = "pass"
    receiver = mail

    # Type your message: use two newlines (\n) to separate the subject from the message body, and use 'f' to  automatically insert variables in the text
    SUBJECT = "Felices fiestas"
    TEXT = "Que la paz, la armonia, la alegria llenen tu hogar de esperanza y abundancia por todos los rincones"
    message = "Subject: {}\n\n{}".format(SUBJECT, TEXT)

    # Create a secure SSL context
    context = ssl.create_default_context()

    # Try to log in to server and send email
    try:
        server = smtplib.SMTP(smtp_server, port)
        server.ehlo()  # Can be omitted
        server.starttls(context=context)  # Secure the connection
        server.ehlo()  # Can be omitted
        server.login(sender, password)
        # TODO: Send email here
        server.sendmail(sender, receiver, message)
    except Exception as e:
        # Print any error messages to stdout
        print(e)
    finally:
        server.quit()
    time.sleep(1)
############################################################################################################################################################################
