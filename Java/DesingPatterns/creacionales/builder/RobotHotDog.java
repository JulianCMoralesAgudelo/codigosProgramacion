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
public class RobotHotDog implements Robot {

    // Lista de aciones a realizar
    List<Integer> acciones;

    public RobotHotDog() {
    }

    // Inicia el proceso
    private void start() {
        System.out.println("Iniciando el HotDog");
    }

    // Busca ingredientes
    private void getParts() {
        System.out.println("Buscando: Pan, salchicha, Tocineta, Salsas");
    }

    // Arma la hamburguesa.
    private void build() {
        System.out.println("Armando el HotDog");
    }

    // Revisar el proceso
    private void check() {
        System.out.println("Revisando el proceso");
    }

    // Terminando el proceso
    private void finish() {
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
        start();
        for (Integer i : acciones) {
            switch (i) {
                case 1:
                    getParts();
                    break;
                case 2:
                    build();
                    break;
                case 3:
                    check();
                    break;
                default:
                    System.out.println("Esa accion no la puedo realziar");
            }
        }
        finish();
    }
}
