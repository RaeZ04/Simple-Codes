import java.util.*;
import javax.swing.JOptionPane;

public class miniJuegoCalculos {
    
    public static void main (String [] args){
        

        int random3 = (int) (Math.random()*20);

        int aciertosRestantes = 10;


        

        System.out.println("Tienes 100 de vida, ¿quieres empezar a jugar?");

        Scanner entrada = new Scanner (System.in); 

        System.out.println("Elige entre S/N");

        String SiNo = entrada.next();

        while (aciertosRestantes>0){

            int random1 = (int) (Math.random()*100);
            int random2 = (int) (Math.random()*100);

            
            

            int resultado = random1 + random2;
            int vida = 100;

            int pregunta = Integer.parseInt(JOptionPane.showInputDialog("Cuánto es " + random1 + "+" + random2));

            if (pregunta==resultado) {

                aciertosRestantes--;
                System.out.println("Has acertado, te quedan " + aciertosRestantes + " intentos.");

            }

            else{

                vida = vida-random3;
                System.out.println("Has fallado, te queda " + vida + " de vida.");

            }

            if (vida==0){

                System.out.println("Tu vida ha llegado a 0, has perdido");
                break;

            }

            }


        }

        
        
    }



