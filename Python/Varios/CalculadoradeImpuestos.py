#calculadora de impuestos
'''
Tu tarea es escribir una calculadora de impuestos.

Debe aceptar un valor de punto flotante: el ingreso.
A continuación, debe imprimir el impuesto calculado, redondeado a pesos totales. Hay una función llamada round() que hará el redondeo por ti, la encontrarás en el código de esqueleto del editor.
Nota: Este país feliz nunca devuelve dinero a sus ciudadanos. Si el impuesto calculado es menor que cero, solo significa que no hay impuesto (el impuesto es igual a cero). Ten esto en cuenta durante tus cálculos.

Observa el código en el editor: solo lee un valor de entrada y genera un resultado, por lo que debes completarlo con algunos cálculos inteligentes.

Prueba tu código con los datos que hemos proporcionado.
'''


ingreso = float(input("Ingrese el ingreso anual: "))
if ingreso <=0:
    print("El impuesto es: 0.0 pesos")
if 0 < ingreso <= 85528:
    impuesto = (ingreso * 0.18) - 556.02
    if impuesto <= 0: print("El impuesto es: 0.0 pesos")
    else:
        print("El impuesto es:" , round(impuesto,0) , "pesos")
if ingreso > 85528:
    impuesto = 14839.02 + (ingreso - 85528) * 0.32
    if impuesto <= 0: print("El impuesto es: 0.0 pesos")
    else:
        print("El impuesto es:" , round(impuesto,0) , "pesos")
