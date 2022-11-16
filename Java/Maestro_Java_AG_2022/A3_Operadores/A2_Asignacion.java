import javax.swing.*;

public class A2_Asignacion {
    public static void main(String[] args) {
        // TODO document why this method is empty
        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i += 2;
        System.out.println("i = " + i);

        i += 5;
        System.out.println("i = " + i);

        j -= 4;
        System.out.println("j = " + j);

        j *= 3;
        System.out.println("j = " + j);

        String sqlString = "SELECT * FROM clientes as c";

        sqlString += " WHERE c.nombre='Julian' ";
        sqlString += " AND c.activo=1";

        System.out.println("sqlString = " + sqlString);

    }
}
