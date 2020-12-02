import java.util.*;

class MirrorMatrix {
    public static void main(String[] args) {
        int row, column;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows for matrix :");
        row = in.nextInt();
        System.out.print("Enter number of column for matrix :");
        column = in.nextInt();

        int matrix[][] = new int[row][column];

        System.out.println("Enter matrix : ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.println("Mirror matrix : ");

        for (int i = 0; i < row; i++) {
            for (int j = column - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println("");
        }
    }
}