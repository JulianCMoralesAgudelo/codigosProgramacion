class House:
    """
    Esta es una clase que representa una casa y se puede usar para crear objetos y evaluar diferentes métricas requeridas en su construcción.
    """
    # Atributos de clase (compartidos por todas las instancias)
    num_rooms = 5
    bathrooms = 2

    def cost_evaluation(self):
        # Funcionalidad para calcular los costos a partir del área de la casa
        print(self.num_rooms)
        pass

# Crear una instancia de la clase House
house = House()

# Imprimir el atributo de clase num_rooms usando la instancia y la clase
print(house.num_rooms)  # Acceso a través de la instancia
print(House.num_rooms)  # Acceso a través de la clase

# Modificar el atributo de instancia num_rooms
house.num_rooms = 7  # Cambia solo para esta instancia
print(house.num_rooms)  # Muestra el valor modificado para la instancia
print(House.num_rooms)  # El valor de la clase no cambia

# Modificar el atributo de clase num_rooms
House.num_rooms = 7  # Cambia para todas las instancias que no tengan sobreescritura
print(house.num_rooms)  # La instancia aún muestra su propio valor
print(House.num_rooms)  # Muestra el valor modificado de la clase
