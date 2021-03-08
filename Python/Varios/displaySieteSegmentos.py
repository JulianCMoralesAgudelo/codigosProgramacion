 #display de siete segmentos.

 #ESPERO LES SIRVA ESTE MÉTODO    
a1=["###","#","###","###","# #","###","###","###","###","###"]
b1=["# #","#","  #","  #","# #","#  ","#  ","  #","# #","# #"]
c1=["# #","#","###","###","###","###","###","  #","###","###"]
d1=["# #","#","#  ","  #","  #","  #","# #","  #","# #","  #"]
e1=["###","#","###","###","  #","###","###","  #","###","###"]
a2,b2,c2,d2,e2=[],[],[],[],[]
z=input("introduce un número: ")
for i in z:
    i=int(i)        
    a2.append(a1[i]),b2.append(b1[i]),c2.append(c1[i])
    d2.append(d1[i]),e2.append(e1[i])
print("  ".join(a2),"  ".join(b2),"  ".join(c2),"  ".join(d2),"  ".join(e2),sep="\n")