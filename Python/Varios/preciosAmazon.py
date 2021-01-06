# www.pythondiario.com
 
import requests
from bs4 import BeautifulSoup
import smtplib
import time
 
URL = 'https://www.amazon.com/-/es/Samsung-DS-Dynamic-Unlocked-Smartphone/dp/B07WV6BY5S/ref=sr_1_9?__mk_es_US=%C3%85M%C3%85%C5%BD%C3%95%C3%91&amp;crid=JYU71JQXJVWI&amp;dchild=1&amp;keywords=xiaomi+mi+10+pro&amp;qid=1609348165&amp;sprefix=xiaomi%2Caps%2C381&amp;sr=8-9'
 
headers = {"User-Agent" : "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:84.0) Gecko/20100101 Firefox/84.0"}
 
def rastrear_precio():
    page = requests.get(URL, headers=headers)
 
    soup = BeautifulSoup(page.content, 'html.parser')
 
    producto = soup.find(id="productTitle").get_text().strip()
    precio = soup.find(id="priceblock_ourprice").get_text().strip()
    precio_convertido = float(precio[4:])
 
    if(precio_convertido < 800):
        enviar_correo(producto, precio)
 
def enviar_correo(producto, precio):
    fromaddr = 'tucorreo@gmail.com'
    toaddrs  = 'destino@gmail.com'
 
    # Datos
    username = 'tucorreo@gmail.com'
    password = 'password'
 
    # Enviando el correo
    server = smtplib.SMTP('smtp.gmail.com:587')
    server.ehlo()
    server.starttls()
    server.ehlo()
    server.login(username,password)
 
    subject = 'El precio bajo'
    body = 'Revisar el siguiente link de amazon: ' + URL
 
    msg = f"Subject: {subject}\n\n{body}"
    server.sendmail(
        fromaddr,
        toaddrs,
        msg
    )
    print("HEEEEEY, el producto bajo")
    server.quit()
 
while True:
    rastrear_precio()
    time.sleep(20)
