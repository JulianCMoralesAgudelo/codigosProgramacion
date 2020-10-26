/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.singleton;

import creacionales.singleton.Singleton;

/**
 *
 * @author julian
 */
public class PruebaSingleton {

    public static void main(String[] args) {
        Singleton miSingleton = Singleton.obtenerSingleton();
        Singleton miSingletonDos = Singleton.obtenerSingleton();
        Singleton miSingletonTres = Singleton.obtenerSingleton();
        Singleton miSingletonCuatro = Singleton.obtenerSingleton();
        Singleton miSingletonCinco = Singleton.obtenerSingleton();
        Singleton miSingletonSeis = Singleton.obtenerSingleton();
        Singleton miSingletonSiete = Singleton.obtenerSingleton();
        Singleton miSingletonOcho = Singleton.obtenerSingleton();
        Singleton miSingletonNueve = Singleton.obtenerSingleton();
        Singleton.vecesLLamado();
        System.out.println("He terminado de crear los objetos");

    }

}
