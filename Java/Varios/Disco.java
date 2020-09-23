package discos;

import java.util.Scanner;
import java.util.GregorianCalendar;

public class Disco implements ServiciosDisco {  
  /**
   * Nombres de los dias en espanhol.
   */
  public static final String N_DIAS = "         "
    + "domingo  "
    + "lunes    "
    + "martes   "
    + "miercoles"
    + "jueves   "
    + "viernes  "
    + "sabado   ";
  public static final int TAM_DIA = 9;
  private final short TIPO_DISCO;    // 1:CD, 2:DVD, 3:BR
  private final String NOMBRE;       // artista o pelicula
  private final int ANHO;            // fecha de grabacion
  public static final short CD = 1;
  public static final short DVD = 2;
  public static final short BR = 3;
  private static final int MAX_PERMITIDAS = 50;
  private static final int ANHO1 = 1950; // Primer anho valido
  private static final int ANHOU = 2017; // Ultimo anho valido
  private final static int LUG_ACT = 5,
    LUG_ANHO = 4,
    LUG_PERM = 5,
    LUG_NMBRE = 80;
  private final static String BLANCOS = "                    "
    + "                    " + "                    "
    + "                    "; 
  
  private int permitidas;     // Maximo transmisiones permitidas
  private int activas;        // Transmisiones activas
  /*  Constructores */
  /**
   * Constructor a partir del tipo de disco, nombre y fecha.
   * 
   * @param tipo si es CD, DVD o BR.
   * @param nombre del artista o pelicula.
   * @param fecha de grabacion.
   */
  public Disco ( short tipo, String nombre, int fecha)  {
    TIPO_DISCO = (short)checaEntero(CD, tipo, BR);
    NOMBRE = checaCadena( nombre );
    ANHO = checaEntero (ANHO1, fecha, ANHOU);
  }
  
  /**
   * Constructor a partir del tipo de disco, nombre, fecha
   * y numero de transmisiones permitidas.
   * 
   * @param tipo si es CD, DVD o BR.
   * @param nombre del artista o pelicula.
   * @param fecha de grabacion.
   * @param permitidas el numero de transmisiones.
   */
  public Disco ( short tipo, String nombre, int fecha, 
                int permitidas)                        {
    TIPO_DISCO = (short)checaEntero(CD, tipo, BR);
    NOMBRE = checaCadena( nombre );
    ANHO = checaEntero (ANHO1, fecha, ANHOU);
    this.permitidas = checaEntero(0, permitidas, MAX_PERMITIDAS);
  }
  
  /** 
   * Constructor sin parametros; interacciona con el usuario 
   * para pedirle los datos de inicializacion del disco.
   */
  public Disco()  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Bienvenido a la fabrica de Discos");
    System.out.println("Que deseas grabar: "
                         + "(1) CD, (2) DVD, (3) Bluray");
    System.out.print("Elige tipo de disco (1,2,3) "
                       + "(termina con [Enter]):--> ");
    TIPO_DISCO = (short)checaEntero(CD, sc.nextShort(), BR);
    sc.nextLine();
    System.out.print("Ahora dame "
                       + ( TIPO_DISCO == CD
                            ? "el nombre del cantante"
                            : (TIPO_DISCO == DVD
                                 ? "el nombre de la pelicula"
                                 : "el nombre de la serie"
                              )
                         )
                       + " ( terminando con [Enter])-->");
    NOMBRE = checaCadena(sc.nextLine());
    System.out.print("Dame ahora el numero de "
                       + "anho en que se grabo entre "
                       +  ANHO1 + " y " + ANHOU
                       + " (terminando con [Enter]) --> ");
    ANHO = checaEntero(ANHO1, sc.nextInt(), ANHOU);
    System.out.print("Dame ahora el numero de "
                       + "transmisiones permitidas entre 1 y "
                       +  MAX_PERMITIDAS 
                       + " (terminando con [Enter]) --> ");
    permitidas = checaEntero(1,sc.nextInt(),MAX_PERMITIDAS);
    sc.nextLine();
    System.out.println("Gracias");
    sc.close();
  }
    
  /*  Métodos de actualizacion  */
  /**
   * Modifica el valor de transmisiones permitidas.
   *
   * @param permisos valor que se desea establecer
   */
  public void setPermitidas(int permisos) {
    permitidas = checaEntero(0,permisos,MAX_PERMITIDAS);
  }
  
  /**
   * Modifica el valor de transmisiones activas.
   *
   * @param activ valor que se desea establecer
   */
  public void setActivas(int activ)  {
    activas = checaEntero(0, activ, permitidas);
  }
  
  /*  Métodos de consulta */
  /**
   * Proporciona el numero de transmisiones activas.
   *
   * @return numero de transmisiones activas.
   */
  public int getActivas()   {
    return activas;
  }

  /**
   * Proporciona el anho en que fue grabado el disco.
   *
   * @return fecha de grabacion.
   */ 
  public int getANHO()   {
    return ANHO;
  }
  
  /**
   * Proporciona el nombre que tenga asociado el disco. Puede 
   * ser el musico si se trata de un CD o la pelicula si se 
   * trata de un DVD o Blue-Ray.#\vs{-.5ex}#
   *#\vs{-.5ex}#
   * @return nombre del musico si se trata de un CD o de la 
   * pelicula, si se trata de un DVD o Blue-Ray.
   */
  public String getNOMBRE()   {
    return NOMBRE;
  }

  /**
   * Proporciona el numero de transmisiones permitidas.
   *
   * @return numero de transmisiones permitidas.
   */
  public int getPermitidas()   {
    return permitidas;
  }

  /**
   * Proporciona el tipo del disco.
   *
   * @return el tipo de disco entre 1 y 3.
   */
  public short getTIPO_DISCO()   {
    return TIPO_DISCO;
  }
  
  /*  Métodos de implementación  */
  /**
   * Duplica a este disco, construyendo otro objeto con los mismos
   * valores, pero con identidad distintinta.
   *
   * @return un nuevo disco identico al que se le pide.
   */
  public ServiciosDisco copiaDisco( ) {
    return new Disco (this.TIPO_DISCO, this.NOMBRE,
                      this.ANHO,this.permitidas);
  }

  /**
   * Muestra de forma estetica el contenido de este disco.
   * 
   * @return una cadena con la informacion y que contiene saltos de
   *         linea.
   */
  public String muestraDisco(String titulo)  {
    String muestra = titulo;
    muestra += "Tipo de disco: "
      + (TIPO_DISCO == CD
           ? "CD" 
           : (TIPO_DISCO == DVD
                ? "DVD"
                : "BlueRay")
        ) + "\n";
    
    muestra += "Nombre de"
      + (TIPO_DISCO == CD
           ? "l artista"
           : (TIPO_DISCO == DVD
                ? " la pelicula"
                : " la serie")
        ) + ": " + NOMBRE + "\n";
    
    muestra += "Anho de grabacion: " + ANHO + "\n";
    
    muestra += "Numero de transmisiones permitidas: "
      + permitidas +"\n";
    
    muestra += "Numero de transmisiones activas: " 
      + activas + "\n";
    
    return muestra;
  }
  
  /** Proporciona una cadena con los distintos campos ocupando un
    * lugar definido.
    *
    * @return la informacion del disco linealizada en forma de
    *         cadena, todos los discos con la misma informacion en 
    *         las mismas posiciones.
    */   
  public String toString()   {
    String snombre = NOMBRE + BLANCOS; // Rellenarlo por la derecha
    /* Tomamos los primeros simbolos, que incluyen al nombre */
    snombre = snombre.substring(0,LUG_NMBRE - 1); 
    /* Construimos ahora una cadena con cada campo ocupando
     * un numero de lugares fijos
     */
    String cadena = "" 
      + TIPO_DISCO // ocupa un unico lugar
      + editaNum(ANHO,LUG_ANHO)
      + snombre
      + editaNum(permitidas,LUG_PERM) 
      + editaNum(activas,LUG_ACT);
    return cadena;
  }
   
  /**
   * Decrementa el numero de transmisiones activas si es que
   * las hay.
   * 
   * @return si pudo o no terminar la transmision.
   *         Podria no haberla terminado si no hay transmision que
   *         terminar.
   */
  public boolean terminaTransmision()   {
    boolean bHay = activas > 0;
    activas -= bHay ? 1 : 0;
    return bHay;
  } 
  
  /**
   * Otorga una transmision, contestando con la fecha y hora en que
   * la esta dando. Si no la puede dar, responde negativamente.
   * Actualiza el numero de transmisiones activas.
   *
   * @return Un mensaje diciendo si pudo o no otorgar la transmision.
   */
  public String daTransmision ()   {
    GregorianCalendar miCal = new GregorianCalendar();
    boolean siHay = activas < permitidas;
    activas += siHay ? 1 : 0;
    return siHay
      ? (" Transmision dada a las " + daHora(miCal)
           + " del " + daFecha(miCal))
      : " No hay transmisiones disponible";
  }
  
  /**
   * Otorga una transmision, interpretando la fecha y hora en que
   * la esta dando. Si no la puede dar, responde negativamente.
   * Actualiza el numero de transmisiones activas.
   * @param miCal La fecha y hora en la que se esta pidiendo 
   *              la transmision.
   * @return      Un mensaje diciendo si pudo o no otorgar la 
   *              transmision.
   */
  public String daTransmision( GregorianCalendar miCal )   {
    boolean siHay = activas < permitidas;
    activas += siHay ? 1 : 0;
    return siHay
      ? (" Transmision dada a las " + daHora(miCal)
           + " del " + daFecha(miCal))
      : " No hay transmisiones disponible";
  }
  
  /*  Métodos auxiliares */
  
  /* Verifica que el argumento entero esta en los limites
   * establecidos.
   * Recibe como parametros el limite inferior permitido, 
   * el valor dado y el limite superior permitido y
   * entrega un numero valido.
   */
  public static int checaEntero (int limInf, int arg, int limSup) {
    return (arg < limInf       // expresion booleana 1
              ? limInf         // valor si True
              : (arg > limSup  // si False, expresion booleana 2
                   ? limSup    // valor si eb1=false y eb2=true
                   : arg       // valor si eb1=false y eb2=false
                )
           ); 
  }
  
  /* Verifica que el nombre del artista o pelicula no sea una cadena 
   * vacia o una referencia nula.
   * Recibe como parametro la cadena a verificar y regresa una
   * cadena correcta.
   */
  public static String checaCadena(String cadena) { 
    return (cadena == null || cadena.length() == 0)
      ? "No definido"
      : cadena;
  }
  
  /* Acomoda a un número para que tenga cierto numero de
   * blancos a la izquierda.
   * Recibe como parametros el valorf y el numero
   * de lugares.
   */
  public String editaNum(int valor, int lugares)  {
    String sNum = BLANCOS + valor; // Agregamos blancos por la izq.
    return sNum.substring(sNum.length() - lugares);
           // Tomamos lo que incluye al numero original.
  }
  
  /**
   * Edita la hora para que salga en singular o plural.
   * @param cal un GregorianCalendar.
   * @return Una cadena que dice la hora con AM o PM.
   */
  public static String daHora (GregorianCalendar cal)  {
    int hora = cal.get (cal.HOUR);
    int minutos = cal.get (cal.MINUTE);
    int segundos = cal.get (cal.SECOND);
    String ampm = cal.get(cal.AM_PM) == cal.AM
      ? "AM" : "PM";
    hora = (hora == 0 && cal.get(cal.AM_PM) == cal.PM) ? 12 : hora;
    return " " + (hora < 10 ? "0" + hora : hora) + ":" 
      + (minutos < 10 ? "0" + minutos : minutos) 
      + ":" + (segundos < 10 ? "0" + segundos : segundos)
      + " " + ampm + " ";
  }
  
  /* Convierte los enteros en los atributos del calendario y 
   * los interpreta para que de la fecha y hora en espanhol.
   * Recibe como parámetro un GregorianCalendar y regresa la
   * fecha escrita con el nombre del mes en espanhol.
   */
  public static String daFecha(GregorianCalendar cal)  {
    int dia = cal.get(cal.DAY_OF_MONTH);
    int mes = cal.get(cal.MONTH) + 1;  // Porque empieza en 0
    int anho = cal.get(cal.YEAR);
    String diaSemana = nombreDia(cal.get(cal.DAY_OF_WEEK));
    return " " + diaSemana + " " + dia + "/" + mes + "/" + anho;
  }
  
  /**
   * Convierte el numero de dis de la semana en
   * el nombre en espanhol.
   * 
   * @param ndia el ordinal de la semana.
   * @return Una cadena con el nombre del dia de la semana.
   */
  public static String nombreDia ( int ndia)  {
    int desde = ndia * TAM_DIA;
    int hasta = desde + TAM_DIA;
    return N_DIAS.substring (desde,hasta).trim();
  }
  public static void main(String[] args) {
    GregorianCalendar elCal = new GregorianCalendar();
    System.out.println("Hora: " + daHora (elCal));
    System.out.println ("Fecha: " + daFecha (elCal));
  }
  /**
   * Regresa el tipo de disco en una cadena.
   * @return La cadena que contiene el tipo de disco.
   */
  public String daTIPO_DISCO ()  {
    return TIPO_DISCO == CD ? "CD"
      : (TIPO_DISCO == DVD ? "DVD"
           : "BR");
  }
}