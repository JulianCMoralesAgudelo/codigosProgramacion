array = list()
while True:
  number = int(input('Add a positive number to the list or enter 0 if you want to exit: '))
  if number == 0: break
  array.append(number)

def counting(num, array):
  counter = 0
  for i in array:
    if num is i:
      counter += 1
  return counter


def position_finding(num, array):
  position = 0
  finding = list()
  if num in array:
    position = array.index(num)
  else:
    position = -1
  
  for i, j in enumerate(array):
    if num is j:
      finding.append(i)
      
  return position, finding

x = int(input('Enter a number: '))
c1 = counting(x, array)
print(f'number of occurrences of number {x}: {c1} times.')
c2, c3 = position_finding(x, array)
if c2 >= 0:
  print(f'The first coincidence of the number {x} is index {c2}')
else:
  print(f'Your number is not in the list so you have {c2} as return.')
print(c3)