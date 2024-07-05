prefijos = "JKLMNOPQ"
sufijo = "ack"
"Jack, Kack, Lack, Mack, Nack, Ouack, Pack, y Quack"

for letra in prefijos:
    if letra=='O' or letra=='Q':
        print(letra + 'u' + sufijo)
    else:
        print(letra + sufijo)