#!/usr/bin/env python3
# -*- coding: UTF-8 -*-
import time
import re



texto = '''
Adriana Maria Lopera Hernanadez <adrianamlopera@yahoo.com>, Adriana Maria Lopera Hernanadez <alopera@procuraduria.gov.co>, Biviana Sierra Agudelo <bivianasierra@hotmail.com>, Gilma Agudelo <gilmaagudelo53@gmail.com>, John Camayo Ortiz <johncamayo@hotmail.es>, "Juan Carlos Calle, Primo" <juancqcalle@hotmail.com>, Lina María Calle Pérez <linacalle@hotmail.com>, Lina María Calle Pérez <limacape@gmail.com>, Mor <yisela.guzman.morales@gmail.com>, Rosa Perez <rosapdec@une.net.co, Yisela Guzman>
'''

patron = r'[a-z0-9]+[\._]?[a-z0-9]+[@]\w+[.]\w{2,3}'

emails = re.findall(patron, texto)

for i in emails:
    print(i)
    

#print(emails)


