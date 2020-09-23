# Obtener los elementos de una lista que cumplen un filtro
 
def filtro_numero_par(numero):
    if numero % 2 == 0:
        return True
    else:
        return False
 
 
numeros = [1, 2, 2, 5, 6, 7, 13, 8]
 
numeros_pares_iter = filter(filtro_numero_par, numeros)
 
for num in numeros_pares_iter:
    print(num)