
# Definicion del problema
'''
Un hombre desea saber cuánto dinero se genera por concepto de intereses sobre la cantidad que tiene en inversión en el banco. 
El decidirá reinvertir los intereses siempre y cuando estos excedan a $700000,
y en ese caso desea saber cuánto dinero tendrá finalmente en su cuenta.
'''

print("")
print("El interés simple es aquel interés que se produce al invertir o prestar una cantidad de dinero durante un periodo de tiempo.")
print("")
print("El capital inicial (C), es la cantidad de dinero que se invierte o se presta.",
"\nEste también es conocido por «principal» o «valor actual», y representa la base sobre la cual se genera el interés.")
print("")
print("La tasa de interés (i), es la cantidad de interés expresado en tanto por ciento por unidad de tiempo.",
"\nLa tasa de interés se expresa generalmente en año, aunque puede expresarse en semanas, quincenas, meses, bimestres.")
print("")
print("El tiempo (t), es el lapso transcurrido entre el momento de la inversión o préstamo y el retiro o pago.",
"\nEl tiempo puede estar expresado en cualquier unidad, sin embargo, para efectos de cálculo, se debe establecer en las mismas unidades de tiempo que la tasa de interés.\nPudiendo diferenciar entre:")
print("")
# Declaracion de variables

I = 'Interes'
C = 'Capital inicial'
i = 'Tasa de interes'
t = 'Tiempo'

# Lectura de datos

C = float(input("Por favor ingrese su capital inicial: "))
i = float(input("Por favor ingrese la tasa de interes que desea contratar: "))
t = float(input("Por favor ingrese el tiempo en años para calcular el interes: "))
I = C * i * t
1
if (I>700000):
    C = I
    print("Los intereses generados hasta el momento son: ", I)
    I = C * i * t
    print("Los nuevos intereses generados despues de superar el tope de 700000 son: ", I)
else:
    print("Los intereses generados hasta el momento son: ", I)


