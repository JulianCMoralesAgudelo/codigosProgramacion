'''
def solve(weight_0, weight_1, weight_2):
    # Write your code here
    # To debug: print("Debug messages...", file=sys.stderr, flush=True)
    lista=[weight_0, weight_1, weight_2]
    return lista.index(max(lista))
    

print(solve(80, 100, 90))
'''
'''
def is_duo_digit(number):
    # Write your code here
    # To debug: print("Debug messages...", file=sys.stderr, flush=True)
    digitos =[]
    while number>0:
        digitos.append(number%10)
        number = number / 10    
    print(digitos)
    numeros=set(digitos)    
    print(numeros)
    print(len(numeros))
    if len(numeros)==2:
        return 1
    else:
        return 0 


print(is_duo_digit(12))
'''
'''
def is_foo(param):
    # Your code goes here
    return "foo" is param


print(is_foo("foo"))
'''
'''
def average(table):
    # Your code goes here
    avg =  sum(table)/len(table)
    if ( avg > 0):
        return avg
    else :
         return 0

values = [0, 1, 2, 3, 4, 6, 7, 8, 9, 10]
print(average(values))  # 5.0
'''

def is_on_even_position(table, value):
    # Your code goes here
    if(table.index(value)%2==0):
        return True
    else:
        return False
    

t = [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
print(is_on_even_position(t, 6))  # False
print(is_on_even_position(t, 3))  # True
t = [1, 1]
print(is_on_even_position(t, 1))  # True