#!/usr/bin/env python
# -*- coding: utf-8 -*-
import sys
import math



def compute_closest_to_zero(ts):
    # Write your code here
    # To debug: print("Debug messages...", file=sys.stderr, flush=True)
    positivos = [x for x in ts if x>0]
    negativos = [x for x in ts if x<0]
    positivos.sort()
    negativos.sort()
    if(abs(positivos[0])==abs(negativos[0])):
        return positivos[0]
    elif (abs(positivos[0])<abs(negativos[0])):
        return positivos[0]
    else:
        return negativos[0]
    

    


# Ignore and do not change the code below
print("")
solution = compute_closest_to_zero([])
print(solution)
print("")


