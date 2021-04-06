#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : spinWords
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-22
Documentación   : https://www.codewars.com/kata/5264d2b162488dc400000001/train/python
Descripcion     : 

Escriba una función que tome una cadena de una o más palabras y devuelva la misma cadena, pero con las cinco o más palabras invertidas 
(como el nombre de este kata).

Las cadenas pasadas constarán solo de letras y espacios.

Los espacios se incluirán solo cuando haya más de una palabra.

spinWords("Hey fellow warriors") => "Hey wollef sroirraw" 
spinWords("This is a test") => "This is a test" 
spinWords("This is another test") => "This is rehtona test"


print(spin_words("Welcome"), "emocleW")



'ot' should equal 'to'
Test Passed
Multiple words
'sroirraw wollef yeH' should equal 'Hey wollef sroirraw'
'ecnetnes a si ecnetnes sihT' should equal 'This ecnetnes is a ecnetnes'
Random testing
'ni' should equal 'in'
'eman taht evif tneserp eb drow secaps gnirts sgnirtS eht' should equal 'the sgnirtS gnirts secaps word be tneserp five that name'
'ro dna evif emas erom erom ro ylno eht srettel sgnirtS eht naht secaps sekat ataK eno erom gnirts ekil emas ylno desrever' should equal 'desrever only same like gnirts more one Kata sekat secaps than the sgnirtS srettel the only or more more same five and or'
'etirW naht fo eno tneserp dna erom fo sekat secapS dna secaps lla rettel secaps secapS sdrow rettel sdrow erom etirW dedulcni' should equal 'dedulcni etirW more sdrow rettel sdrow secapS secaps rettel all secaps and secapS sekat of more and tneserp one of than etirW'
'tneserp a lliw ni erom erom lla sdrow ro tsisnoc sdrow tub dessap evif emas tsuJ tsisnoc eno drow sdrow sekat srettel gnirts tub ni ro naht' should equal 'than or in but gnirts srettel sekat sdrow word one tsisnoc Just same five dessap but sdrow tsisnoc or sdrow all more more in will a tneserp'
'fo tub erom fo tsuJ dna' should equal 'and Just of more but of'
'erom rettel ylno emas si tub erom a' should equal 'a more but is same only rettel more'
'a tsuJ nehw a gnirts evif ataK lliw ylno taht rettel emas lla eb ylno snruter ni ylno eht etirW eno noitcnuf eht dna' should equal 'and the noitcnuf one etirW the only in snruter only be all same rettel that only will Kata five gnirts a when Just a'
'lla etirW eht siht fo dedulcni htiw a' should equal 'a with dedulcni of this the etirW all'
'tub snruter sdrow dna eht ni fo ataK tneserp dedulcni a fo ro dedulcni lliw desrever lla tsisnoc fo secaps noitcnuf sekat' should equal 'sekat noitcnuf secaps of tsisnoc all desrever will dedulcni or of a dedulcni tneserp Kata of in the and sdrow snruter but'
'desrever snruter dna a dessap secaps erom ataK rettel ni ylno tsisnoc ni noitcnuf sdrow' should equal 'sdrow noitcnuf in tsisnoc only in rettel Kata more secaps dessap a and snruter desrever'
'dessap siht gnirts' should equal 'gnirts this dessap'
'ni siht ro erom drow fo fo eno ylno ataK nehw lliw eman rettel gnirts ekil lliw srettel gnirts secapS secaps a snruter sekat desrever ylno' should equal 'only desrever sekat snruter a secaps secapS gnirts srettel will like gnirts rettel name will when Kata only one of of word more or this in'
'dna eno gnirts tsisnoc nehw gnirts si fo si srettel rettel naht evif snruter etirW' should equal 'etirW snruter five than rettel srettel is of is gnirts when tsisnoc gnirts one and'
'ro ataK a etirW htiw desrever erom ylno nehw eht sgnirtS' should equal 'sgnirtS the when only more desrever with etirW a Kata or'
'dedulcni lliw dna secaps evif ni emas noitcnuf eb fo eht eno' should equal 'one the of be noitcnuf same in five secaps and will dedulcni'
'eman a sdrow ro ylno eht ro sdrow evif htiw secapS eb taht tsisnoc srettel eht desrever sdrow ekil ylno' should equal 'only like sdrow desrever the srettel tsisnoc that be secapS with five sdrow or the only or sdrow a name'
'ro ni eno sgnirtS ni rettel eman drow srettel a ekil erom drow lliw htiw erom gnirts desrever erom eb a' should equal 'a be more desrever gnirts more with will word more like a srettel word name rettel in sgnirtS one in or'
'ylno a drow dna ataK sdrow fo sdrow secapS sgnirtS a tsisnoc sdrow fo' should equal 'of sdrow tsisnoc a sgnirtS secapS sdrow of sdrow Kata and word a only'
'ylno eno eht lliw eht ro dessap gnirts' should equal 'gnirts dessap or the will the one only'


'''


def spin_words(sentence):
    # Your code goes here
    sentence =''.join(reversed(sentence))
    return sentence





print(spin_words("sroirraw wollef yeH"))

