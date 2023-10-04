package blackjack;

import java.util.*;
import javax.swing.JOptionPane;

public class blackjack_main {

    public static void main(String [] args){

        System.out.println("-------------------------");
        System.out.println(" Bienvenido al blackjack");
        System.out.println("-------------------------");

        Scanner input = new Scanner(System.in);

        Random random = new Random();

        int cartaplayer1 = random.nextInt(10) + 1;
        int cartaplayer2 = random.nextInt(10) + 1;
        int cartaplayer3 = 0;
        int cartaplayer4 = 0;
        int cartaplayer5 = 0;
        int cartaplayer6 = 0;

        int cartaIA1 = random.nextInt(10) + 1;
        int cartaIA2 = random.nextInt(10) + 1;
        int cartaIA3 = 0;
        int cartaIA4 = 0;
        int cartaIA5 = 0;
        int cartaIA6 = 0;

        int blackjacktotal = 21;
        int blackjackplayer = 0;
        int blackjackIA = 0;

        int sumacartasplayer = cartaplayer1 + cartaplayer2 + cartaplayer3 + cartaplayer4 + cartaplayer5 + cartaplayer6;
        int sumacartasIA = cartaIA1 + cartaIA2 + cartaIA3 + cartaIA4 + cartaIA5 + cartaIA6;

        System.out.println("Empiezas con " + cartaplayer1 + " y " + cartaplayer2);
        System.out.println("La IA ha empezado con " + cartaIA1 + " y " + cartaIA2);

        while (blackjackplayer <= 21 && blackjackIA <= 21){

            System.out.println("1. Pedir  |  2. Plantar");

            while (input != 1 || input != 2){

                System.out.println("Tienes que ingresar 1 para pedir o 2 para plantarte");

            }


        }


    }
    
}
