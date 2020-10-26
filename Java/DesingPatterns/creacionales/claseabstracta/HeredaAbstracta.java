/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.claseabstracta;

import creacionales.claseabstracta.ClaseabstractaEjemplo;

/**
 *
 * @author julian
 */
public class HeredaAbstracta extends ClaseabstractaEjemplo {

    @Override
    public void despedirse() {
        System.out.println("Sayonara " + super.nombre);
    }

    public HeredaAbstracta() {
        darNombre("Julian");
        saludar();
        despedirse();
    }

    public void darNombre(String nombre) {
        super.nombre = nombre;
    }

    public static void main(String[] args) {
        HeredaAbstracta ha = new HeredaAbstracta();
    }

}
