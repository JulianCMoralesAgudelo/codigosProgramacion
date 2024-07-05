# Importar ABC y abstractmethod del módulo abc (que significa clases base abstractas)
from abc import ABC, abstractmethod

# Clase Bank
class Bank(ABC):
    """ 
    Una clase abstracta de banco

    [IMPLEMENTACIÓN]
        1. Esta clase debe derivar de la clase ABC
        2. Escribir una función basicinfo() que imprime "This is a generic bank"
           y devuelve la cadena "Generic bank: 0"
        3. Definir una segunda función llamada withdraw y mantenerla vacía agregando
           la palabra clave 'pass'. Hacer esta función abstracta agregando
           '@abstractmethod' justo encima de la declaración de la función.
    """
    @abstractmethod
    def withdraw(self, amount):
        pass

    def basicinfo(self):
        print("This is a generic bank")
        return "Generic bank: 0"

# Clase Swiss
class Swiss(Bank):
    """ 
    Un tipo específico de banco que deriva de la clase Bank

    [IMPLEMENTACIÓN]
        1. Esta clase debe derivar de la clase Bank
        2. Crear un constructor para esta clase que inicialice una variable de clase
           `bal` a 1000
        3. Implementar la función basicinfo() para que imprima "This is the Swiss Bank"
           y devuelva una cadena con "Swiss Bank: " (no olvidar el espacio después de los dos puntos)
           seguido del saldo bancario actual.

           Por ejemplo, si self.bal = 80, debería devolver "Swiss Bank: 80"

        4. Implementar withdraw() para que tome un argumento (además de
           self) que sea un entero que representa la cantidad a retirar
           del banco. Restar la cantidad retirada del saldo bancario, imprimir
           la cantidad retirada ("Withdrawn amount: {amount}"), imprimir el nuevo
           saldo ("New Balance: {self.bal}") y devolver el nuevo saldo.

           Nota: ¡Asegurarse de verificar que haya suficiente dinero para retirar!
                 Si la cantidad es mayor que el saldo, no restar ningún dinero
                 de la variable de clase `bal`. En su lugar, imprimir una
                 declaración que diga `"Insufficient funds"`, y devolver el
                 saldo original.

    """
    def __init__(self):
        self.bal = 1000

    def basicinfo(self):
        print("This is the Swiss Bank")
        return f"Swiss Bank: {self.bal}"

    def withdraw(self, amount):
        if amount > self.bal:
            print("Insufficient funds")
            return self.bal
        else:
            print(f"Withdrawn amount: {amount}")
            self.bal -= amount
            print(f"New Balance: {self.bal}")
            return self.bal

# Código principal
def main():
    assert issubclass(Bank, ABC), "Bank debe derivar de la clase ABC"
    s = Swiss()
    print(s.basicinfo())
    s.withdraw(30)
    s.withdraw(1000)

if __name__ == "__main__":
    main()
