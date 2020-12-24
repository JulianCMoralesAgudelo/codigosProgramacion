# Tenga en cuenta que Gmail requiere que se conecte al puerto 465 si usa SMTP_SSL () y al puerto 587 cuando usa .starttls ().
import smtplib, ssl

port = 465  # For SSL
password = input("Type your password and press enter: ")

# Create a secure SSL context
context = ssl.create_default_context()

with smtplib.SMTP_SSL("smtp.gmail.com", port, context=context) as server:
    server.login("", password)
    # TODO: Send email here
