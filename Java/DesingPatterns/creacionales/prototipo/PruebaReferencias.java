/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.prototipo;

/**
 *
 * @author julian
 */
public class PruebaReferencias {

    public static void main(String[] args) {
        Persona p1 = new Persona("Julian");
        System.out.print("El nombre del primer objeto es: ");
        System.out.println(p1.getNombre());

        Persona p2 = new Persona("");
        p2 = p1;
        System.out.print("El nombre del segundo objeto es: ");
        System.out.println(p1.getNombre());

        p2.setNombre("Camilo");
        System.out.print("El nombre del primer objeto es: ");
        System.out.println(p1.getNombre());

    }
}
