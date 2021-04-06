#La capacidad de utilizar tuplas del lado izquierdo del operador de asignación.

#sto permite asignar más de una variable a la vez cuando hay una secuencia del lado derecho, pero como siempre, no me crean a mí 🤷♂, veamos un ejemplo: 

m = ["Python", "LatAm"]
a, b = m

print (a) 
# Python

print (b)
# LatAm

#Quieren ver un ejemplo más práctico de este súperpoder 🦸♀?

#Quiero dividir un correo electrónico :e-mail: en usuario y dirección email. Veamos:

sentence = "tuchicobello@perdedor.com"

user, email = sentence.split ("@")

print(user)
#tuchicobello

print(email)
#perdedor.com

'''
Una sola línea de código bastante legible para hacer una operación que, si bien no es de las más difíciles que hay, tomaría unas cuantas líneas más si se hace de otra forma.
:mag_right: Recuerda que lo que define la sintaxis de una tupla es el caracter especial coma ( , ) y no los paréntesis. Es decir, da lo mismo tener esto:

(a, b) que esto a, b

Incluso, si quieres crear una tupla con un solo elemento, la sintaxis debe ser: (x,) 
Nunca olvides la coma en creación de tuplas.

'''