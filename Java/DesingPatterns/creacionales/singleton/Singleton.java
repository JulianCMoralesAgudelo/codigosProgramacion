/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.singleton;

/**
 *
 * @author julian Tomado de
 * https://www.youtube.com/watch?v=77Kw5P5Y73U&list=PLC238B0613515968F
 */
// Clase principal
public final class Singleton {

    // Objeto
    private static final Singleton singleton = new Singleton();
    private static int cantidad;

    // Objeto
    private Singleton() {
        System.out.println("Hola, he sido creado solo una sola vez!!!");
    }

    // Metodo
    public static Singleton obtenerSingleton() {
        cantidad++;
        return singleton;
    }

    public static void vecesLLamado() {
        System.out.println("Se ha llamdado " + cantidad + " veces");
    }

}
