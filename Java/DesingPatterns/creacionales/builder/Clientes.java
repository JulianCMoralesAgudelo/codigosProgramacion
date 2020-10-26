/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.builder;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class Clientes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Builder constructor = new Builder();
        Robot robot;
        int tipoRobot;

        System.out.print("Digite el tipo de robot que desea: ");
        tipoRobot = sc.nextInt();

        constructor.setRobot(tipoRobot);
        constructor.addRevisar();
        constructor.addNoHayFormaMono();
        constructor.addGetIngredientes();
        constructor.addArmar();
        constructor.addRevisar();

        robot = constructor.getRobot();
        robot.trabajar();

    }

}
