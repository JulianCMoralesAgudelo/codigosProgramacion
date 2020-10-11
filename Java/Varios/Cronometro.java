
package cronometro;

import javax.swing.JOptionPane;


public class Cronometro {

    public static void main(String[] args) {
        
        int minutos = 30;
        int segundos;
        
        for(minutos = minutos - 1; minutos >= 0; minutos-- ){
            for(segundos = 59; segundos >= 0; segundos--){
                JOptionPane.showOptionDialog(null,minutos +":"+segundos,"Empty?",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,new Object[]{},null);
            delaySegundos();
            }
        }
    }
    public static void delaySegundos(){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){}
    }
    
}
