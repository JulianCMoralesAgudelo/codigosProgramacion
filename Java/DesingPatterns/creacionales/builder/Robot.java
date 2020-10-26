/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.builder;

import java.util.List;

/**
 *
 * @author julian
 */
public interface Robot {
    // Metodo que poena a trabajr el robot

    public void trabajar();

    /* Metodo que cargara las acciones
     * solictadas por el builder
     * en tiempo de ejecucion.
     */
    public void cargarAcciones(List<Integer> accion);

}
