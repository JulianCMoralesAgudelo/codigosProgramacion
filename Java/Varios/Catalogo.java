package discos;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 * Simula el uso de un catalogo de discos.
 * En cada sesion puede construir su base de discos,
 * agregar discos, consultar el catalogo, iniciar 
 * transmisiones y terminar transmisiones, registrando
 * todas las actividades en el catalogo.
 * @author: Elisa Viso.
 * @version 2017.
 */
public class Catalogo  {
  /** Numero maximo de discos por catalogo */
  public final static int MAX_DISCOS = 50;
  /** Menu del catalogo */
  public static final String[] MENU_CATALOGO = {
    "Salir",                                // 0
    "Agregar disco",                        // 1
    "Mostrar discos",                       // 2
    "Mostrar discos activos",               // 3
    "Pedir transmision",                    // 4
    "Terminar transmision",                 // 5
    "Mostrar disco",                        // 6
    "Mostrar historico de un disco",        // 7
    "Mostrar historico de todos los discos" // 8
  };
  /** Accion de salir del menu. */
  public final static int               SALIR = 0;
  /** Accion de agregar un disco al catalogo. */
  public final static int          AGRGA_DSCO = 1;
  /** Accion de mostrar el catalogo. */
  public final static int        MSTRA_DISCOS = 2;
  /** Accion de mostrar el catalogo de discos activos.*/
  public final static int    MSTRA_DSCS_ACTVS = 3;
  /** Accion de pedir una transmision. */
  public final static int        PIDE_TRNSMSN = 4;
  /** Accion de terminar una transmision. */
  public final static int      TRMINA_TRNSMSN = 5;
  /** Accion de terminar una transmision. */
  public final static int       MSTRA_UNDISCO = 6;
  /** Mostrar los histroricos de un disco */
  public final static int          MSTRA_HIST = 7;
  /** Mostrar los histroricos de todos los discos */
  public final static int        MSTRA_HISTRS = 8;

  /* Variables de objeto */
  private Disco[] catalogo;  // Catalogo de discos
  private int numDiscos = 0; // Numero de discos en el catalogo de discos
  private GregorianCalendar[][] fechas; 
                             // Un renglon por disco, una columna
                             // por transmision. Cada renglon tiene
                             // un numero de columnas dada por
                             // el disco en ese renglon. El numero
                             // de fachas registradas esta dado
                             // por el atributo activas del disco.
  private GregorianCalendar [][][] historico;
                             // Una pareja de renglones por cada disco
                             // Fecha de inicio y fin de una transmision
                             // para el disco elegido
  private int [] numHist;    // Da, para cada disco, el numero de 
                             // transmisiones iniciadas y terminadas
                             // para cada disco
  /**
   * Construye un catalogo. Da el maximo numero posible de
   * registros para discos y anota que no tiene ningun disco
   * registrado. Se construiran los arreglos correspondientes
   * a historico y fechas, pero unicamente con su numero
   * de renglones (o tablas). Al registrar a cada disco, se
   * completaran los arreglos correspondientes a sus fechas
   * y su historico.
   */
  public Catalogo () {
    // Damos el maximo de casilleros posibles al construir el catalogo
    catalogo  = new Disco[MAX_DISCOS];
    numDiscos = 0;
    /* El numero de posiciones disponibles para registrar transmisiones e 
     * historico estara dado por el numero de transmisiones permitidas 
     * del disco en esa posicion, que no se sabra hasta que se construya
     * el disco correspondiente. El numero de lugares ocupados esta dado 
     * por transmisiones activas del disco en esa posicion. */
    fechas    = new GregorianCalendar[catalogo.length][];
    historico = new GregorianCalendar[catalogo.length][2][];
    // el numero de lugares ocupados esta dado por numHist[disco]
    // para cada disco
    numHist   = new int[catalogo.length];
    // Como los elementos del arreglo son enteros, cada elemento se 
    // inicia en ceros
  } // Termina constructor sin parametros
  
  /**
   * Construye un catalogo con espacio para un numero
   * definido de discos Los espacios para discos contienen
   * una referencia nula. Se construiran los arreglos correspondientes
   * a historico y fechas, pero unicamente con su numero
   * de renglones (o tablas). Al registrar a cada disco, se
   * completaran los arreglos correspondientes a sus fechas
   * y su historico.
   * @param numDscs Maximo numero de discos que va a tener.
   */
  public Catalogo( int numDscs ) {
    /* Verificacion de que el argumento esta en rangos */
    int maxDscs = Disco.checaEntero(1, numDscs, MAX_DISCOS);
    catalogo  = new Disco[maxDscs]; // Construccion del catalogo con ese tamanho
    numDiscos = 0;
    fechas    = new GregorianCalendar[catalogo.length][];
    historico = new GregorianCalendar[catalogo.length][2][];
    numHist   = new int[catalogo.length];
  }  // termina constructor con un parametro
  
  /**
   * Construye una Catalogo con espacio para un numero definido de discos. 
   * El catalogo lo inicializas con el contenido del arreglo que le pasas. 
   * Inicializa el contador relativo al numero de discos. Para aquellos discos
   * que ya estan construidos, construye las columnas relacionadas en fechas
   * e historico. Si el numero de lugares solicitados es menor que el de discos
   * para inicializacion, se usa este ultimo para los tamanhos de arreglos.
   * @param numDscs Maximo numero de discos que va a tener.
   * @param nuevos Arreglo de discos con los que inicia el catalogo.
   */
  public Catalogo ( int numDscs, Disco[ ] nuevos )  {
    int numNvos = nuevos == null ? 0 : nuevos.length;
    numDscs     = numDscs < numNvos ? numNvos : numDscs;
    numDscs     = Disco.checaEntero(1, numDscs, MAX_DISCOS);
    /* El numero de discos a copiar es el minimo entre el tamanho final
     * del arreglo y el numero de discos nuevos */
    numNvos = numNvos > numDscs ? numDscs : numNvos;
    catalogo    = new Disco[numDscs];
    numDiscos   = 0;
    fechas      = new GregorianCalendar[catalogo.length][];
    historico   = new GregorianCalendar[catalogo.length][2][];
    numHist     = new int[catalogo.length];
    /* Copias ahora los discos nuevos al catalogo en los primeros
     * lugares del catalogo */
    for (int i = 0; i < numNvos; i++)  {
      if (nuevos[i] == null)
        continue;             // un unico enunciado para true
      catalogo[numDiscos]     = nuevos[i];
      int numPrest            = catalogo[numDiscos].getPermitidas();
        /* numero posible de fechas para el disco i */
      fechas[numDiscos]       = new GregorianCalendar[numPrest];
        /* numero posible de historicos para el disco i */
      historico[numDiscos][0] = new GregorianCalendar[2 * numPrest];
      historico[numDiscos][1] = new GregorianCalendar[2 * numPrest];
      numDiscos++;
    } // for i = 0
  } // Termina constructor con dos parametros
  
  /**
   * Regresa el catalogo de discos, incluyendo
   * aquellas posiciones que no tienen disco.
   * @return Arreglo con el catalogo de discos.
   */
  public Disco[] getCatalogo () {
    return catalogo;
  }
  /**
   * Regresa el numero de discos registrados en el
   * catalogo.
   * @return el numero de discos registrados en 
   * el catalogo.
   */
  public int getNumDiscos () {
    return numDiscos;
  }
  /**
   * Regresa un arreglo de dos dimensiones donde en cada
   * renglon registra las fechas de prestamo para cada
   * disco.
   * @return el arreglo con las fechas de los prestamos
   * para cada disco.
   */
  public GregorianCalendar[][] getFechas () {
    return fechas;
  }
  /**
   * Regresa el arreglo historico de transmisiones
   * iniciadas y terminadas para cada disco. Hay una
   * pareja de renglones con fechas para cada disco,
   * por lo que el arreglo es de tres dimensiones.
   * @return el historico de todos los discos.
   */
  public GregorianCalendar[][][] getHistorico( )  {
    return historico;
  }
  /**
   * Copiamos el catalogo del parametro, si no es
   * una referencia nula. Si nuevos es una referencia
   * nula, "borramos" todos los arreglos asociados.
   * Para cada disco que existe en el catalogo se 
   * inicializan los arreglos asociados y se anota cuantos
   * discos hay. No se copian las referencias nulas (ni se
   * cuentan) para que no haya huecos en el arreglo. 
   * @param nuevos El arreglo con el que se va a inicializar el
   *               catalogo y todos los arreglos asociados.
   */
  public void setCatalogo(Disco[] nuevos) {
    int cuantos = nuevos == null ? 0 : nuevos.length;
    if (cuantos == 0) { // "Borrar" todos los arreglos
      catalogo  = null;
      fechas    = null;
      historico = null;
      numDiscos = 0;
      numHist   = null;
      return;  // recuerda que regresa void
    }
    // Llegas aca si la referencia no es nula (cuantos != 0)
    catalogo  = new Disco[cuantos]; // Reconstruyes el catalogo
                                    // y el resto de los arreglos
    fechas    = new GregorianCalendar[cuantos][ ];
    historico = new GregorianCalendar[cuantos][2][ ];
    numHist   = new int [ cuantos];
    // Quieres copiar los discos vivos
    // catalogo empieza con todas sus referencias en null
    numDiscos = 0;  // No has copiado ningun disco "vivo"
    for ( int i = 0; i < cuantos; i++)  {
      if (nuevos[i] == null) continue; // Regresas al encabezado
      // Llegas aca si hay un disco vivo en esa posicion
      catalogo[numDiscos] = nuevos[i]; // lo copias al catalogo
      int numPerm = catalogo[i].getPermitidas(); // el disco no es nulo
      catalogo[numDiscos].setActivas(0); // Inicializamos transmisiones
      fechas[numDiscos] = new GregorianCalendar[numPerm];
      historico[numDiscos][0] = new GregorianCalendar[2 * numPerm];
      historico[numDiscos][1] = new GregorianCalendar[2 * numPerm];
      numDiscos ++;
    }// for
  } // setCatalogo
  
  /**
   * Agrega un disco al catalogo, si es que hay lugar.
   * @param nuevo El disco a agregar.
   * @return false si el disco es nulo o ya no hay lugar;
   *         verdadero si lo pudo agregar.
   */
  public boolean addCatalogo ( Disco nuevo )  {
    if (nuevo == null || numDiscos >= catalogo.length )
      return false;  // No agrega nada
    // Llegas aca porque hay lugar y la referencia es valida
    catalogo [ numDiscos ] = nuevo;
    int numPerm = nuevo.getPermitidas();  // transmisiones permitidas
    fechas[numDiscos] = new GregorianCalendar[numPerm];
    historico[numDiscos][0] = new GregorianCalendar[2 * numPerm];
    historico[numDiscos][1] = new GregorianCalendar[2 * numPerm];
    numDiscos ++;
    return true;
  } // fin de addCatalogo
  
  /**
   * Otorga una transmision de un disco dado, determinado
   * por la posicion que ocupa en el catalogo, de donde el
   * usuario elige la posicion del disco.
   * Obtiene la hora y fecha de la transmision y la registra
   * para el disco en el arreglo fechas del disco elegido.
   * @param cualDisco Posicion del disco que va a transmitir.
   * @return falso Si las posiciones del disco es incorrecta;
   *               si ya no hay lugar para prestamos en ese disco;
   *         true si se pudo dar la transmision.
   */
  public boolean daTransmision ( int cualDisco )  {
    if ( cualDisco >= numDiscos || cualDisco < 0 )
      return false;
    if ( catalogo[ cualDisco ] == null )
      return false;
    int numDato = catalogo[cualDisco].getActivas();
    if ( numDato >= catalogo[cualDisco].getPermitidas() ) {
      System.out.println("El disco " + catalogo[cualDisco].getNOMBRE( )
                           + " ya no tiene transmisiones disponibles");
      return false;
    }
    // Llegas aca porque puedes dar una transmision
    GregorianCalendar ahora = new GregorianCalendar();
    fechas[ cualDisco ] [ numDato ] = ahora;
    System.out.println( catalogo[cualDisco].daTransmision(ahora) );
    return true;
  } // fin de daTransmision
  
  /**
   * Regresa una cadena con el catalogo de discos. Cada disco
   * muestra su contenido en forma compacta.
   * @param encabezado El titulo del listado.
   * @return La cadena con un disco por renglon y la posicion que ocupa.
   */
  public String mstraCatalogo(String encabezado)  {
    if (catalogo == null)
      return encabezado + "\nEl catalogo no existe";
    if (numDiscos <= 0)
      return encabezado + "\nNo hay discos en el catalogo";
    String cadena = ( encabezado == null ? "" : encabezado) + "\n";
    for (int i = 0; i < numDiscos; i++) {
      cadena += "[" + i + "] "; // posicion que ocupa el disco
      if ( catalogo[i] == null)  {
        cadena += "no hay disco en esta posicion\n";
        continue;
      }
      cadena += "(" + catalogo[i].daTIPO_DISCO() + ") "
        + catalogo[i].getNOMBRE() + "\n"
        + "\t Num. de transmisiones permitidas: "
        + catalogo[i].getPermitidas() + "\n"
        + "\t Num. de transmisiones activas: "
        + catalogo[i].getActivas() + "\n"
        + "\n";
    } // for
    return cadena;
  } // fin de mstraCatalogo
  
  /**
   * Muestra en una lista aquellos discos que tienen 
   * transmisiones activas. Identifica al disco por 
   * la posición que ocupa y, para cada disco, identifica
   * a las transmisiones activas por la columna que ocupan
   * en el renglon correspondiente al disco en el arreglo
   * fechas.
   * @param encabezado Para que el listado tenga un 
   *                   titulo.
   * @return una lista de los discos que tienen transmisiones
   *         activas con las transmisiones identificadas por
   *         la posicion que ocupa cada una.
   */
  public String mstraActivos(String encabezado)  {
    if (catalogo == null || numDiscos <= 0) 
      return encabezado + "\nNo hay discos en el catalogo";
    String cadena = encabezado == null ? "" : encabezado + "\n";
    for( int i = 0; i < numDiscos; i++)  {
      if (catalogo[i] == null ) continue;
      int numActivas = catalogo[i].getActivas();
      if ( numActivas <= 0 )  continue;
      cadena += "catalogo[" + i + "]: " + catalogo[i].getNOMBRE()
        + "\n";
      for (int j = 0; j < numActivas; j++) {
        // la j da la posicion de fecha en el disco posicion i
        cadena += "[" + j + "] " + daCalndrio(fechas[i][j]) + "\n";
      } // fin de for j
      cadena += "\n";
    } // fin de for i
    return cadena;
  } // fin de mstraActvos
  
  /**
   * Convierte una fecha de GregorianCalendar en una cadena con la 
   * fecha y la hora representada en el parametro.
   * @param fecha un GregorianCalendar que se desea "descifrar".
   * @return una cadena que corresponde al parametro.
   */
  public static String daCalndrio(GregorianCalendar fecha)  {
    if (fecha == null) return "fecha invalida";
    String laFecha = Disco.daFecha(fecha) 
      + ( fecha.get (fecha.HOUR) != 1
           ? " a las " : " a la " )
      + Disco.daHora(fecha);
    return laFecha;
  } // fin de daCalndrio
  
  /**
   * Muestra las transmisiones activas de un disco determinado.
   * @param cualDisco el disco elegido en el catalogo.
   * @return cadena con una lista de las transmisiones activas.
   */
  public String mstraActivas(int cualDisco) {
    if ( catalogo == null // el catalogo exista
          /* la posicion sea valida */
          || cualDisco < 0 || cualDisco >= catalogo.length
          /* el disco en esa posicion existe */
          || catalogo[cualDisco] == null)  {
      System.out.println("Este disco no existe en el catalogo");
      return null;
    } // del if
    int cuantas = catalogo[cualDisco].getActivas( );
    if ( cuantas <= 0 ) {
      System.out.println("Este disco no tiene transmisiones activas");
      return null;
    }
    String cadena = 
      catalogo[cualDisco].muestraDisco ("Transmisiones activas:")
      + "\n";
    for (int i = 0; i < cuantas; i++)  {// numero de trans activas
      if (fechas[cualDisco][i] != null)
        cadena += "[" + i + "]\t" + daCalndrio(fechas[cualDisco][i])
        + "\n";
      else
        cadena += "fecha no registrada\n";
    } // del for
    return cadena;
  }  // fin de mstraActivas

  /**
   * Termina una transmision activa y la coloca en el historico
   * de transmisiones para ese disco.
   * @param cualDisco la posicion del disco cuya transmision se 
   * desea terminar.
   * @param cons la consola a traves de la cual se hace la 
   * comunicacion.
   * @return si pudo (true) o no (false) terminar la transmision.
   */
  public boolean terminaTrans(int cualDisco, Scanner cons)  {
    if (cualDisco < 0 || cualDisco >= numDiscos 
       || catalogo[cualDisco] == null)  { // verificar disco
      System.out.println("El disco "+ cualDisco + " no existe");
      return false;
    }
    if (cons == null )  {      // verificar consola
      System.out.println("No es una consola valida");
      return false;
    }
    System.out.println("Para el disco\n" 
              + catalogo[cualDisco].muestraDisco("Disco num. ["
                                                + cualDisco + "]"));
    System.out.println("Tenemos las siguientes transmisiones activas:");
    String cadena = mstraActivas(cualDisco);
    if (cadena == null)  {
      System.out.println("Este disco no tiene transmisiones activas");
      return false;
    }
    System.out.println(cadena); // cadena != null
    int numActivas = catalogo[cualDisco].getActivas();
    int cualTrans = pideNum(cons, "Elige el numero de transmision"
                              + " a terminar, ", 0, numActivas - 1);
    if (cualTrans == -1) { // el numero dado esta fuera de rango
      System.out.println("Esta transmision no existe");
      return false;
    }
    GregorianCalendar inicio   = fechas[cualDisco][cualTrans];
    GregorianCalendar fechaFin = new GregorianCalendar();
    int donde = numHist[cualDisco]; // para ahorrar codigo  
    historico[cualDisco][0][donde] = inicio;
    historico[cualDisco][1][donde] = fechaFin;
    numHist[cualDisco]++;
    System.out.println("Transmision terminada: " 
                         + daCalndrio(fechaFin));
    if ( eliminaCelda(fechas[cualDisco], cualTrans))  { 
      catalogo[cualDisco].terminaTransmision();
      return true;
    }
    return false; // si no pudo eliminar y no ha salido
  } // fin de eliminaTrans
  
  /**
   * Elimina la celda solicitada, si existe, en el arreglo 
   * correspondiente. Despues de llamar a este metodo, 
   * se tienen que hacer los decrementos correspondientes 
   * a los arreglos que se esten usando.
   * @param arreglo de una dimension del que se va a eliminar 
   * la celda.
   * @param cual el indice del elemento que se va a eliminar.
   * @return si pudo (true) o no hacer la eliminacion.
   */
  public static boolean eliminaCelda(Object[] arreglo, int cual)  {
    if (arreglo == null) { // verificar que el arreglo existe
      System.out.println("El arreglo no existe");
      return false;
    }
    // Si la posicion en el arreglo esta fuera de rango
    if ( cual < 0 || cual >= arreglo.length)  {
      System.out.println("La posicion a eliminar no existe");
      return false;
    }
    for (int i = cual + 1; // empiezas uno después de la posicion dada
         i < arreglo.length && arreglo[i] != null; // sin salirse del arreglo
         i++)  {
      arreglo[i - 1] = arreglo[i]; // i al menos vale 1
      arreglo[i] = null;           // ya esta copiado
    } // for
    return true;
  } // fin de eliminaCelda
         
  /**
   * Muestra el historico de transmisiones que solo incluye
   * las iniciadas que ya fueron terminadas de un disco dado.
   * @param cual Elige al disco del que va a mostrar el historico.
   * @return cadena con el historico bien presentado.
   */
  public String mstraHist( int cual )  {
    if (cual < 0 || cual >= numDiscos // si la posicion no es valida
          || catalogo[cual] == null) // la posicion no contiene nada
      return "Este disco no existe";
    String cadena = "Historico del disco\t" 
      + catalogo[cual].getNOMBRE ( ) + "\n";
    if (numHist[ cual ] == 0)  {
      cadena += "Este disco no tiene historico\n";
      return cadena;
    }
    for (int i = 0; i < numHist[cual]; i++) {
      cadena += "[" + i + "]\tTransmision iniciada: \t" 
        + daCalndrio( historico[cual][0][i]) // inicio
        + "\n    \tTransmision terminada: \t"
        + daCalndrio( historico[cual][1][i]) + "\n\n"; // fin
    }
    return cadena;
  } // fin de mstraHist
       
  /**
   * Muestra el historico de transmisiones que solo incluye
   * las iniciadas que fueron terminadas de aquellos discos
   * que tienen historico.
   * @return cadena con el historico bien presentado.
   */
  public String mstraHistrs(  )  {
    String cadena = "Historico en los discos que lo tienen:\n"
                  + "======================================\n";
    for ( int cual = 0; cual < numDiscos; cual++) { // Recorrer cada disco
      if (catalogo[cual] != null)
        cadena += mstraHist ( cual ) + "\n";
    }  // fin del for
    return cadena;
  } // fin de mstraHistrs
  
  /**
   * Se comunica con un usuario y le solicita un entero que
   * este en ciertos rangos. Le da un mensaje al usuario
   * indicando lo que debe proporcionar y los límites que
   * debe observar.
   * @param cons un Scanner a traves del que se comunica la 
   *             clase con el usuario.
   * @param msg  el mensaje con el que pide el dato este metodo.
   * @param minimo menor valor aceptado.
   * @param maximo mayor valor aceptado.
   */
  public static int pideNum(Scanner cons, String msg, 
                         int minimo, int maximo)  {
    int num = -1; // Si no lee nada, tiene valor incorrecto
    System.out.print(msg + "\nterminando con un [enter]: -->");
    num = cons.nextInt();
    cons.nextLine();
    if (num < minimo || num > maximo)
      num = -1;
    return num;
  }

  /**
   * Inicia la comunicacion ya sea con el duenho del
   * catalogo o con un cliente. Mediante esta linea de
   * comunicacion se agregan discos, clientes, se piden
   * transmisiones y se terminan transmisiones.
   */
  public void conectaCatlgo ( ) {
    Scanner cons = new Scanner(System.in); // montado en la terminal
    int opcion = 0;       // Para que pueda entrar por primera vez
    Disco discoNvo;               // Para construir un disco nuevo
    int cualDisco;                           // Para elegir discos
    int sigDato;       // Posicion de una transmision en fechas[i]
    Disco elDisco;          // Para guardar referencias a un disco
    // terminan declaraciones
    System.out.println("Bienvenido al Catalogo de discos ");
    do  {
      System.out.println("Menu de opciones de trabajo\n"
                        + "===========================");
      for (int i=0; i < MENU_CATALOGO.length; i++) // Recorrer el menu
        System.out.println((i<10?" ":"")
                             +"[" + i + "] " + MENU_CATALOGO[i]);
      // Al terminar de mostrar el menu, pedirle al usuario la opcion
      System.out.print("Elige una opcion (terminando con [Enter]): [0-" 
                         + (MENU_CATALOGO.length - 1) + "] --> ");
      // Llegamos aca para que el usuario teclee un entero
      opcion = cons.nextInt();
      cons.nextLine(); // Para comerse el [Enter]
      // El usuario tecleo un entero
      switch ( opcion ) {
        case SALIR : 
          System.out.println("Termina la sesion.\nHasta luego.");
          continue; // Para que regrese a la evaluacion del while
        case AGRGA_DSCO :
          discoNvo = new Disco( ); // Lo solicita por consola
          if ( addCatalogo (discoNvo) ) // regresa un booleano
            System.out.println(discoNvo.getNOMBRE() 
                                 + " agregado\n");
          else
            System.out.println("Ya no hay lugar para " 
                                 + discoNvo.getNOMBRE() );
          break;
        case MSTRA_DISCOS:
          if (catalogo == null || numDiscos <= 0) {
            System.out.println("No hay discos registrados "
                                 + "en el catalogo");
            break;
          }
          System.out.println(mstraCatalogo("Discos disponibles") );
          break;
        case MSTRA_DSCS_ACTVS:
          if (catalogo == null || numDiscos <= 0)  {
            System.out.println("El catalogo esta vacio");
            break;
          }
          System.out.println( mstraActivos( "Discos activos\n"
                                             + "==============" ) );
          break;
      
        case PIDE_TRNSMSN:
          System.out.println(mstraCatalogo("Discos disponibles "
                                               + "en el catalogo"));
          cualDisco = pideNum(cons, "Elige el numero de disco, ", 
                             0, numDiscos - 1);
          if (cualDisco == -1  || cualDisco >= numDiscos) {
            System.out.println("El disco elegido no existe");
            break;
          }
          /* se obtiene la posicion a ocupar antes de agregarla
           * al cliente, porque el cliente incrementa el
           * contador del disco */
          sigDato = catalogo[cualDisco].getActivas();
          if ( daTransmision( cualDisco ) )
            System.out.println( "Disco [" + cualDisco + "]: "
                                 // pos del disco
                                 + catalogo[cualDisco].getNOMBRE()
                                 .trim() + " transmitiendose: "
                                 + " empezando "
                                 + daCalndrio( 
                                      fechas[cualDisco][sigDato])
                                 + "\n");
          break;
            
        case TRMINA_TRNSMSN:
          /* primero se localiza la transmision */
          System.out.println("Elige el disco cuya transmision deseas "
                               + "terminar");
          System.out.println( mstraActivos("Discos con transmisiones"
                                              + " abiertas") );
          cualDisco = pideNum(cons, "Elige el numero de disco, ",
                              0, numDiscos - 1);
          if ( cualDisco == -1 )  { // Disco incorrecto
            System.out.println("El disco " + cualDisco + " no existe");
            break;
          }
          if (catalogo[cualDisco].getActivas() <= 0) {
            System.out.println("El disco [" + cualDisco + "] "
                                 + "no tiene transmisiones activas");
            break;
          }       
          /* El disco es correcto. Falta dar de baja la transmision */
          if (! terminaTrans(cualDisco, cons) )
            System.out.println("No se realizo la eliminacion");
          else
            System.out.println("Transmision terminada");
          break;
          
        case MSTRA_UNDISCO:
          System.out.println(mstraCatalogo( "Discos disponibles "
                                              + "en el catalogo" ) );
          cualDisco = pideNum(cons, "Elige el numero de disco, ", 
                             0, numDiscos - 1);
          if (cualDisco == -1 ) {
            System.out.println("El disco elegido no existe");
            break;
          }
          elDisco = catalogo[cualDisco];
          if (elDisco == null)  {
            System.out.println("Ese disco no existe");
            break;
          }
          System.out.println( elDisco.muestraDisco
                               ("[" + cualDisco + "] Disco"));
          break;
          
        case MSTRA_HIST:
          System.out.println(mstraCatalogo("Discos disponibles en "
                                             + "el catalogo"));
          cualDisco = pideNum(cons, "Elige el disco del que quieres "
                                + "el historico, ", 0, numDiscos - 1);
          if (cualDisco == -1) {
            System.out.println("Numero incorrecto de disco");
            break;
          }
          if (numHist[cualDisco] == 0) {
            System.out.println("El disco [" + cualDisco 
                                 + "] no tiene historia");
            break;
          }
          System.out.println( mstraHist( cualDisco ) );
          break;
          
        case MSTRA_HISTRS:
          System.out.println( mstraHistrs( ) );
          break;
            
        default: 
          System.out.println("Opcion no implementada\n");
      } // switch
    } while (opcion != 0); // do ... while
  } // conectaCatlgo
  
    
  public static void main(String[] args) {
    // Construimos un catalogo "al vuelo"
    Catalogo elMio = 
      new Catalogo (10, 
                new Disco[ ] {
                    new Disco(Disco.DVD, "Ahora los ves, ahora no",
                              1999,5),
                    new Disco(Disco.BR,"Billions",2015,4),
                    new Disco(Disco.BR,"Outlander",2016,3),
                    new Disco(Disco.CD,"Frank Sinatra",1992, 2)
                  }  // termina construccion de Disco[]
                 );  // termina construccion de Catalogo
    
    // Inicia la comunicacion desde el catalogo con el usuario
    elMio.conectaCatlgo( );
  } // main
} // Catalogo
