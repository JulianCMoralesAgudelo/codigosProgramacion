numeroSecreto = 777

print(
"""
+==================================+
| Bienvenido a mi juego, muggle!   |
| Introduce un número entero       |
| y adivina qué número he          |
| elegido para ti.                 |
| Entonces,                        |
| ¿Cuál es el número secreto?      |
+==================================+
""")
while True:
    # lee el primer número
    numero = int (input ("Introduce un número para adivinar el número secreto:"))
    if(numero==numeroSecreto):
        print("¡Bien hecho, muggle! Eres libre ahora")
        break
    print("¡Ja, ja! ¡Estás atrapado en mi ciclo!")