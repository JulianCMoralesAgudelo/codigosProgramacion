# Documentacion : https://realpython.com/python-send-email/

import smtplib
import ssl
import time

smtp_server = 'smtp.gmail.com'
port = 587  # For starttls
sender_email = ''
receiver_email = ''
print('Ingrese la contraseña de su correo')
password = input('Type your password and press enter: ')
message = f'''\
Subject: Feliz navidad
To: {receiver_email }
From: {sender_email}

Que la paz y la armonía celebrada en Navidad  estén presentes todos los días de tu año nuevo. ¡Feliz Navidad  y felices fiestas!.'''
# Create a secure SSL context
context = ssl.create_default_context()

# Try to log in to server and send email
try:
    server = smtplib.SMTP(smtp_server, port)
    server.ehlo()  # Can be omitted
    server.starttls(context=context)  # Secure the connection
    server.ehlo()  # Can be omitted
    server.login(sender_email, password)
    server.sendmail(sender_email, receiver_email, message)
    # TODO: Send email here
except Exception as e:
    # Print any error messages to stdout
    print(e)
finally:
    server.quit()
