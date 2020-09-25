package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("introduce las filas");
		int n = in.nextInt();
		System.out.println("introduce las columnas");
		int m = in.nextInt();
		int j, i, t = 0;
		int mat[][] = new int[n][m];
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				System.out.println("introduce el numero en la pocision" + i + "  " + j);
				mat[i][j] = (int) (Math.random() * 14) + 1;
			}
		}
		
		System.out.println();
		
		for (i = 0; i < n; i++) {// imprime la matriz como ingresaste los datos
			for (j = 0; j < m; j++) {
				System.out.print(mat[i][j] + "	");
			}
			System.out.println("");
		}
		for (i = 0; i < n; i++) {// ordena la matriz de abajo hacia arriba
			for (j = 0; j < m; j++) {
				for (int x = 0; x < n; x++) {
					for (int y = 0; y < m; y++) {
						if (mat[i][j] > mat[x][y]) {
							t = mat[i][j];
							mat[i][j] = mat[x][y];
							mat[x][y] = t;
						}
					}
				}
			}
		}
		System.out.println("******************************************************");
		for (i = mat.length - 1; i >= 0; i--) {// imprime la matriz ascendentemente
			for (j = mat.length - 1; j >= 0; j--) {
				System.out.print(mat[i][j] + "	");
			}
			System.out.println("");
		}

	}

}
