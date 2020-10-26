/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.interfaz;

import creacionales.interfaz.Interfaz;

/**
 *
 * @author julian
 */
public class Hereda implements Interfaz {

    public Hereda() {
        saludar();
    }

    @Override
    public String getNombre() {
        return miNombre;
    }

    @Override
    public void saludar() {
        System.out.println("Hola " + getNombre());
    }

    public static void main(String[] args) {
        Hereda hereda = new Hereda();
    }

}
