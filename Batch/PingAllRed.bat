for /l %i in (1,1,254) do ping -w 50 -n 1 192.168.1.%i

Quién tenga un nivel básico de programción ya sabría interpretar un bucle for. Pero para aquellas personas que no sepan y no se limiten simplemente a copiar/pegar, pasaré a explicar brevemente que hace este script:

for: Realizamos un bucle, para que recorra todas las direcciones IP posibles de nuestra red.

/l: Con este argumento estaríamos especificando que se trataría de un bucle que recorre una sucesión de números que va desde una inicio hasta un fin.

%i: El % inicia una variable que en este caso le llame i.

in: marcamos los parámetros que queremos que se recorran del bluque for.

(1,1,254): Los parámentros están entre paréntesis y separados por coma en un orden especifico: (inicio, paso, fin). Por lo tanto, en este caso recorrerá desde el número 1 hasta el 254.

do: Indicamos el comando DO para determinal lo que queremos que recorra.

ping -w 50 -n 1: Realizará un ping con (-n 1) tan solo 1 respuesta de echo y con (-w 50) un tiempo de solicitud de 50 milisegundos.

192.168.1.%i: La dirección IP que recorrerá el for indicándole que el %i (colocada en el último octeto) es la variable que tiene que ir recorriendo hasta el limite marcado en los parámetros del IN (254).
