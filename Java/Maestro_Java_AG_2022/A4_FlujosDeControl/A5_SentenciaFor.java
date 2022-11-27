import javax.swing.JOptionPane;

public class A5_SentenciaFor {
    public static void main(String[] args) {

        // Limpiar consola
        System.out.print("\033\143");

        // Declaracion de variables
        String[] nombres = { "Amaranto", "Bianca", "Karina", "Eva", "Axel", "Leo", "Erick" };
        int count = nombres.length;

        for (int i = 0; i < count; i++) {
            if (nombres[i].toLowerCase().contains("Carlos".toLowerCase())
                    || nombres[i].toLowerCase().contains("Amaranto".toLowerCase())) {
                continue;
            }
            System.out.println(i + ": " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre");

        boolean encontrado = false;

        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }

        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar + ": Fue encontrado");            
        }else{
            JOptionPane.showMessageDialog(null, buscar + ": No existe");            
        }

    }
}