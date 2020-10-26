/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julian
 */
public class Builder {

    // Robot a construir
    Robot robot;
    // Lista de aciones a realizar
    List<Integer> acciones;

    // Constructor que inicializar las acciones (vacias)
    public Builder() {
        acciones = new ArrayList<Integer>();
    }

    // Metodod que crea el robot
    // dependiendo de los solcitado por el cliente
    public void setRobot(int i) {
        if (i == 1) {
            robot = new RobotHamburguesa();
        } else {
            robot = new RobotHotDog();
        }
    }

    /* Metodos que pueden solictar los clientes
     * en tiempo de ejecucion y que organizaran los
     * procesos a realizar por el robot.
     */
    public void addGetIngredientes() {
        acciones.add(1);
    }

    public void addArmar() {
        acciones.add(2);
    }

    public void addRevisar() {
        acciones.add(3);
    }

    public void addNoHayFormaMono() {
        acciones.add(100);
    }

    public Robot getRobot() {
        robot.cargarAcciones(acciones);
        return robot;
    }

}
