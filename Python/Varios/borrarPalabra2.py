words = list()
while True:
  word = input('Enter a word or type "end" if you want to exit: ')
  if word == 'end': break
  words.append(word)
 
delete = input('Enter a word for delete: ')
if delete in words:
  words.remove(delete)
 
else:
  print('Sorry, that word is not on the list')
 
print(words)