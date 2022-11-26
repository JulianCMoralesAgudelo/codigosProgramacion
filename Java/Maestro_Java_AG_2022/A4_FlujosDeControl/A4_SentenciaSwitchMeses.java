
public class A4_SentenciaSwitchMeses {
  public static void main(String[] args) {

    // Limpiar consola
    System.out.print("\033\143");

    String meses[] = { "ENERO", "FEBRERO", "MARZO",
        "ABRIL", "MAYO", "JUNIO",
        "JULIO", "AGOSTO", "SEPTIEMBRE",
        "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" };

    int year = (int) Math.floor(Math.random() * (2023 - 1582 + 1) + 1582);
    int mes = 0;
    int diasMes = 0;

    // Buscar si el año es bisiesto
    boolean bisiesto = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    System.out.println("");

    for (int i = 0; i < 12; i++) {

      mes = (int) Math.floor(Math.random() * (12 - 1 + 1) + 1);

      switch (mes) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
          diasMes = 31;
          break;
        case 4:
        case 6:
        case 9:
        case 11:
          diasMes = 30;
          break;
        case 2:
          if (bisiesto) {
            diasMes = 29;
          } else {
            diasMes = 28;
          }
          break;
        default:
          System.out.println("Numero inesperado.");
      }
    }
    System.out.println("Año:\t" + year);
    System.out.println("Mes:\t" + meses[mes - 1]);
    System.out.println("Dias:\t" + diasMes);    
  }
}
