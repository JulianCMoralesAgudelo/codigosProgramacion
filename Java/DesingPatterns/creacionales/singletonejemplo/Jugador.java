/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.singletonejemplo;

/**
 *
 * @author julian
 */
public class Jugador {

    private Marcianos marcianos;

    public Jugador() {
        marcianos = Marcianos.getMarcianos();
    }

    public void destruirMarciano() {
        marcianos.derribaMarcianos();
    }

}
