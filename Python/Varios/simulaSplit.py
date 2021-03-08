def misplit(strng):

    list = []

    cad = ''

    for i in range(len(strng)):

        if strng[i] != ' ':

            cad += strng[i]

        else:

            if cad != '':

                list.append(cad)

                cad = ''

    return list

    

#

# coloca tu código aquí

#



print(misplit("Ser o no ser, esa es la pregunta"))

print(misplit("Ser o no ser,esa es la pregunta"))

print(misplit("   "))

print(misplit(" abc "))

print(misplit(""))