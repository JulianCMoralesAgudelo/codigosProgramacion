# Crea una clase Minibus que herede de la clase Vehiculo. Debes poder tener
# un método capacidad() que defina por defecto la capacidad de 6 asientos.
# Luego crea una clase Pasajero que puedas ir agregando a una instancia de
# Minibus. Esa instancia no deberá permitir mas de 50 pasajeros únicos (no
# se permiten pasajeros repetidos).

# **************** Import ***************
import os

# **************** Funciones ***************
def borrarPantalla(): 
    if os.name == "posix":
        os.system ("clear")
    elif os.name == "ce" or os.name == "nt" or os.name == "dos":
        os.system ("cls")
        
# **************** clases ******************
class Vehiculo():
    def __init__(self, capacidad):
        self.capacidad = int(input('ingrese la capacidad del vehículo: '))
        self.pasajeros=[]
    

class Minibus(Vehiculo):
    def lugares(self,capacidad):
        if self.capacidad < 6:
            self.capacidad = 6
        else:
            self.capacidad = self.capacidad

    def persona(self, nombre):
        i=0
        while i < self.capacidad:           
            nombre = input("ingrese el nombre de un pasajero\n")
            self.pasajeros.append(nombre)
            libres=self.capacidad - (len(self.pasajeros))
            print('nombre ingresado', nombre)
            if libres >0:
                print('quedan', libres,' libres')
            i += 1
        print('no hay mas capacidad')
        print('El listado de pasajeros es: ',self.pasajeros)


# *************** Instanciando **************


borrarPantalla()
min=Minibus(0)
min.lugares(0)
min.persona(0)

print('terminado')

# *********************** Modificaciones - Mejoras **********************
# Funcionando sin forzar errores
# No responde a pasajeros unicos
# Agregar un try para evitar errores en la entrada de datos junto con un for 
# para volver a intentarlo. 