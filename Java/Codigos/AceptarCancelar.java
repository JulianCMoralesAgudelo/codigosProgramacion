/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A1_U2_Taller_Mensajes_Dialogo;

import javax.swing.JOptionPane;

/**
 *
 * @author El_Hogar
 */
public class AceptarCancelar {

    public static void main(String[] args) {

        String nombre;

        do {

            JOptionPane.showMessageDialog(null, "Por favor introduzca su nombre..");

            nombre = JOptionPane.showInputDialog(null, "Haga clic en aceptar ó en cancelar");

            //Ni siquiera introdujo nada
            if (nombre == null) {

                System.out.println("Dio Clic en Cancelar o Cerrar y no introdujo su nombre...");

                //else if//Especifica
            } else if (nombre.equals("")) {

                System.out.println("No introdujo su nombre y dio clic en aceptar");

                //nombre  != ("")
            } else {

                JOptionPane.showMessageDialog(null, "Hola " + nombre);
            }

            // "" (!=) null true
            //1 if (nombre != null && nombre!="") {
            // "" (=) a un espacio en blanco
            // null (=) a nada ni siquiera un espacio en blanco
            // "" (!=) null true
            //if (3==3)
            //else (3!=3) inverso de (==) es (!=)
            //Ni if (3==3) ni else (3!=3) entonces...
            //else if especificación de usuario (3>5)
            //2 JOptionPane.showMessageDialog(null, "Hola sin nombre ");
            //3} else if (nombre==nombre && nombre==nombre){
            //4 JOptionPane.showMessageDialog(null, "Hola "+nombre);
        } while (nombre != "" && nombre != null);
    }
}
