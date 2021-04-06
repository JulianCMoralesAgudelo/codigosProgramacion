#testeado con un ZTE N720
#!/usr/bin/env python
import requests
import sys
 
tlf = sys.argv[1]
texto = sys.argv[2]
url = 'https://eu208.chat-api.com/instance200474/'
dato = {"0573042448822": tlf, "Hola": texto}
res = requests.post(url,json=dato)
print(res)
print('ok')