package retos;

public class MaximumofArray {

	public static void main(String[] args) {
		String cadena = "-46523 -56965 77658 -23173 -32801 45985 45945 318 39398 79661 -41093 15052 -10766 -71919 -43313 49522 67376 18317 -45209 -1626 -15643 54081 -24224 -4600 51475 79883 75134 57068 41138 -62284 32159 74615 -39249 29817 -28558 7950 -4197 -62612 -71732 -44799 -62950 -32825 50252 6283 -24745 -73061 -24194 -37368 25256 10597 41006 -70386 -15321 -63217 5014 -43846 -63334 148 -66777 57804 17864 45381 52419 58615 -4802 -56138 -13434 71000 -38750 -5167 -53798 -21700 42008 76453 64582 -62737 -76607 -39611 -20105 28648 50986 -59098 38261 -44335 -42316 -36725 -8181 -25650 43423 5041 -47846 -18712 -29578 -75427 -40096 45620 -51565 26469 36621 -10316 -58697 62822 47983 63310 59275 32566 -79426 62668 72955 -19531 11316 43941 1370 -30422 79605 39053 12852 -8576 -66597 -23724 76465 -34444 37564 -33112 -29871 77467 -67492 -1436 23937 49128 68247 45240 31951 36231 28550 11226 -11203 29123 -6106 -18248 -70408 -74789 -54306 10961 -25212 -54701 -29985 67640 16723 -16583 -36083 13188 28973 -78519 60075 79102 78948 72583 -2334 22886 41712 -14087 -11874 -6337 -57855 -63324 -75110 10942 45799 -1217 72693 55391 3994 -61613 -13648 58781 -36314 36367 46422 60409 -60216 -69661 -6403 48757 -68180 -26327 47859 -69232 -33743 -34475 33654 -72031 31438 -58220 1631 53583 -41544 6520 -15475 -75745 -74696 -22781 59645 9297 -4394 -34002 -11921 39291 -77635 -45499 19701 -57851 -35160 -66701 70905 -23341 -13029 38764 -12573 33227 -75710 -58918 41196 35728 -37139 -37173 9311 1316 49347 73835 5571 54650 -28946 -14783 -16052 46659 31214 52026 5951 33578 -73472 -54348 55726 -28632 -41050 46632 28027 25921 5397 -64545 -20851 9686 -43464 -59655 -34586 -603 -16828 54725 -79286 -47480 48561 6284 -72829 -60385 71500 -8882 66274 22714 -36855 -7774 -23707 -30327 17878 -47980 21040 56828 78652 -30932 2749 4049 -15478 61898 -66265 21057 -77756 -20851 -59546 -14585 -46125 -58833 17935 -77564 27451 25105 -57950 18952 -63777 -71675 -38334 -20632";
		String patron = cadena.replaceAll("\r\n", " ");
		String[] partes = patron.split("\\s+");
		int[] numeros = new int[partes.length];
		int length = partes.length;
		int aux;

		for (int i = 0; i < partes.length; i++) {
			numeros[i] = Integer.parseInt(partes[i]);
		}

		ordenBurbuja(numeros);

	}

	public static void ordenBurbuja(int[] array) {
		int aux;
		boolean cambios = false;
		while (true) {
			cambios = false;
			for (int i = 1; i < array.length; i++) {
				if (array[i] < array[i - 1]) {
					aux = array[i];
					array[i] = array[i - 1];
					array[i - 1] = aux;
					cambios = true;
				}
			}
			if (cambios == false) {
				break;
			}
		}
		System.out.println(array[array.length - 1] + " " + array[0]);
		// -79873 79810
	}

}