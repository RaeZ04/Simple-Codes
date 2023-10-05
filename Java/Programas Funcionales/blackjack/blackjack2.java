package blackjack;

import java.util.Random;

public class blackjack2 {

    public static void main (String [] args){

        String[] cartas = { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Q", "J", "K" };

        Random random = new Random();

        int valorCartaPlayer = 0;
        int valorCartaIA = 0;

        while(valorCartaIA>21 || valorCartaPlayer>21){

            int CartaRandom = random.nextInt(cartas.length);

        }

    }
    
}
