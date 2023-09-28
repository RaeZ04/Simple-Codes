import javax.swing.JOptionPane;
import java.util.*;

public class piedrapapeltijera {
    
    public static void main(String [] args){

        System.out.println("Juego de Piedra, Papel o Tijera");
        System.out.println("--------------------------------");

        String eleccion = JOptionPane.showInputDialog("Elige: Piedra, Papel o Tijera");

        Random random = new Random();
        int opciones = random.nextInt(3) + 1  ;

        String maquina = "nada";
        

        if (opciones == 1){

            maquina = "Piedra";

        }

        if (opciones == 2){

            maquina = "Tijera";

        }

        if (opciones == 3){

            maquina = "Papel";

        }

        int valorTijera = 0;
        int valorPapel = 0;
        int valorPiedra = 0;

        if(maquina.equalsIgnoreCase("tijera")){

            valorTijera = 1;

        }

        if(maquina.equalsIgnoreCase("papel")){

            valorPapel = 1;

        }

        if(maquina.equalsIgnoreCase("piedra")){

            valorPiedra = 1;

        }

        int valorEleccion = 0;

        if(eleccion.equalsIgnoreCase("tijera")){

            valorEleccion = 4;

        }

        if(eleccion.equalsIgnoreCase("papel")){

            valorEleccion = 5;

        }

        if(eleccion.equalsIgnoreCase("piedra")){

            valorEleccion = 6;

        }
        

        if(maquina.equalsIgnoreCase(eleccion)){

            System.out.print("Elijo: " + maquina);
            System.out.println(" | Hemos empatado.");

        }

        if(valorTijera == 1 && valorEleccion == 5){

            System.out.print("Elijo: " + maquina);
            System.out.println(" | Has perdido");

        }
        
        if(valorTijera == 1 && valorEleccion == 6){

            System.out.print("Elijo: " + maquina);
            System.out.println(" | Has ganado");

        }

        if(valorPapel == 1 && valorEleccion == 6){

            System.out.print("Elijo: " + maquina);
            System.out.println(" | Has perdido");

        }

        if(valorPapel == 1 && valorEleccion == 4){

            System.out.print("Elijo: " + maquina);
            System.out.println(" | Has ganado");

        }

        if(valorPiedra == 1 && valorEleccion == 4){

            System.out.print("Elijo: " + maquina);
            System.out.println(" | Has perdido");

        }

        if(valorPiedra == 1 && valorEleccion == 5){

            System.out.print("Elijo: " + maquina);
            System.out.println(" | Has ganado");

        }




    }

}


// Creditos a miguel angel como Co-Creador