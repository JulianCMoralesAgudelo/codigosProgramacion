/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.claseabstracta;

/**
 *
 * @author julian
 */
public abstract class ClaseabstractaEjemplo {

    // Contiene un atributo modificable para todos
    // Metodo comun pero inmutable
    // Metodo abstracto mutable en los hijos
    public String nombre;

    public void saludar() {
        System.out.println("Hola " + nombre);
    }

    public abstract void despedirse();

}
