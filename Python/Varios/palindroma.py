"""Desarolla una aplicacion en la cual guardes en un arreglo las siguientes palabras 
OSO
MARIA
ANA
GOOGLE
OLO
una vez que tengas almacenadas esas 4 palabras en el arreglo, ahora verifica y muestra por pantalla cuales son palindromas(Es decir
que escritas alrevez se escriban igual) usa If"""

def buscarPlindromas(lista_palabras):
    p_palindromas = []
    p_n_palindromas = []

    for palabra in lista_palabras:
        palabra_inversa = palabra[::-1]
        
        if palabra_inversa in lista_palabras:
            p_palindromas.append(palabra)
        if not palabra_inversa in lista_palabras:
            p_n_palindromas.append(palabra)
    
    return p_palindromas, p_n_palindromas

palindromas, n_palindromas = buscarPlindromas(["OSO", "MARIA", "ANA", "GOOGLE", "OLO"])

print(str(len(palindromas)) + " son palindromas: " + ", ".join(palindromas))
print(str(len(n_palindromas)) + " son palindromas: " + ", ".join(n_palindromas))