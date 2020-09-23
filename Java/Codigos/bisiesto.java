/*
Un año es bisiesto en el calendario Gregoriano, si es divisible entre 4 y no divisible entre 100, y también si es divisible entre 400.
En programación, el algoritmo para calcular si un año es bisiesto es un algoritmo útil para la realización de calendarios.
Considérese las siguientes proposiciones o enunciados lógicos:

    p: Es divisible entre 4
    ¬q: No es divisible entre 100
    r: Es divisible entre 400

La fórmula lógica que se suele usar para establecer si un año es bisiesto sería cuando [p y ¬q] ó [r] es verdadera,
pero esta otra p y [¬q ó r] sería más eficiente. 
*/

public boolean isLeap(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
}
