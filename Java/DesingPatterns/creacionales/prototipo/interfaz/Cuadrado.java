/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.prototipo.interfaz;

/**
 *
 * @author julian
 */
public class Cuadrado implements Figura {

    private String nombre;
    private int posicionX, posicionY;

    public Cuadrado() {
    }

    @Override
    public void setNombre(String n) {
        this.nombre = n;
    }

    @Override
    public String getNombre() {
        return nombre;

    }

    @Override
    public void mover(int x, int y) {
        this.posicionX = x;
        this.posicionY = y;
    }

    @Override
    public void getPosicion() {
        System.out.println("Circulo en x: " + this.posicionX);
        System.out.println("Circulo en y: " + this.posicionY);
    }

    @Override
    public Figura clonar() {
        Figura figura = new Cuadrado();
        figura.setNombre(this.nombre);
        figura.mover(this.posicionX, this.posicionY);
        return figura;
    }

}
