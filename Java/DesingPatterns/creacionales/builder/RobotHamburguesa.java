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
public class RobotHamburguesa implements Robot {

    // Lista de aciones a realizar
    List<Integer> acciones;

    // Contructor vacio
    public RobotHamburguesa() {
    }

    // Inicia el proceso
    private void iniciar() {
        System.out.println("Iniciando Hamburguesa");
    }

    // Busca ingredientes
    private void getIngredientes() {
        System.out.println("Buscando: Pan, Ensalada, Tocineta, Pepino, Salsas");
    }

    // Arma la hamburguesa.
    private void armar() {
        System.out.println("Armando la hamburguesa");
    }

    // Revisar el proceso
    private void revisar() {
        System.out.println("Revisando el proceso");
    }

    // Terminando el proceso
    private void terminar() {
        System.out.println("Proceso Terminado\nlleve");
    }

    /* Metodo encargado de cargar las acciones solictadas
     * por el builder en tiempo de ejecucion.
     */
    @Override
    public void cargarAcciones(List<Integer> accion) {
        this.acciones = accion;
    }

    /* Metodo encargado de procesar las acciones solictadas
     * por el builder en tiempo de ejecucion.
     */
    @Override
    public void trabajar() {
        iniciar();
        for (Integer i : acciones) {
            switch (i) {
                case 1:
                    getIngredientes();
                    break;
                case 2:
                    armar();
                    break;
                case 3:
                    revisar();
                    break;
                default:
                    System.out.println("Esa accion no la puedo realziar");
            }
        }
        terminar();
    }
}
