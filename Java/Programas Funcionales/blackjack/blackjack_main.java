package blackjack;

import java.util.*;
import javax.swing.JOptionPane;

public class blackjack_main {

    public static void main(String[] args) {

        String[] cartas = { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Q", "J", "K" };

        Random random = new Random();

        int valorCartaPlayer = 0;
        int valorCartaIA = 0;

        while (valorCartaIA <= 21 && valorCartaPlayer <= 21) {

            int CartaRandomInt1 = random.nextInt(cartas.length);
            int CartaRandomInt2 = random.nextInt(cartas.length);
            String CartaRandom1 = cartas[CartaRandomInt1];
            String CartaRandom2 = cartas[CartaRandomInt2];

            if (CartaRandom1 == cartas[0] || CartaRandom2 == cartas [0]) {

                valorCartaPlayer = valorCartaPlayer + 1;

            } 
            
            if (CartaRandom1 == cartas[1] || CartaRandom2 == cartas [1]) {

                valorCartaPlayer = valorCartaPlayer + 2;

            } 
            
            if (CartaRandom1 == cartas[2] || CartaRandom2 == cartas [2]) {

                valorCartaPlayer = valorCartaPlayer + 3;

            } 
            
            if (CartaRandom1 == cartas[3] || CartaRandom2 == cartas [3]) {

                valorCartaPlayer = valorCartaPlayer + 4;

            } 
            
            if (CartaRandom1 == cartas[4] || CartaRandom2 == cartas [4]) {

                valorCartaPlayer = valorCartaPlayer + 5;

            } 
            
            if (CartaRandom1 == cartas[5] || CartaRandom2 == cartas [5]) {

                valorCartaPlayer = valorCartaPlayer + 6;

            } 
            
            if (CartaRandom1 == cartas[6] || CartaRandom2 == cartas [6]) {

                valorCartaPlayer = valorCartaPlayer + 7;

            } 
            
            if (CartaRandom1 == cartas[7] || CartaRandom2 == cartas [7]) {

                valorCartaPlayer = valorCartaPlayer + 8;

            } 
            
            if (CartaRandom1 == cartas[8] || CartaRandom2 == cartas [8]) {

                valorCartaPlayer = valorCartaPlayer + 9;

            } 
            
            if (CartaRandom1 == cartas[9] || CartaRandom2 == cartas [9]) {

                valorCartaPlayer = valorCartaPlayer + 10;

            } 
            
            if (CartaRandom1 == cartas[10] || CartaRandom2 == cartas [10]) {

                valorCartaPlayer = valorCartaPlayer + 10;

            } 
            
            if (CartaRandom1 == cartas[11] || CartaRandom2 == cartas [11]) {

                valorCartaPlayer = valorCartaPlayer + 10;

            } 
            
            if (CartaRandom1 == cartas[12] || CartaRandom2 == cartas [12]) {

                valorCartaPlayer = valorCartaPlayer + 10;

            }

            if (CartaRandom1.equals("As") || CartaRandom2.equals("As")) {

                valorCartaIA = valorCartaIA + 1;

            } else if (CartaRandom1.equals("2") || CartaRandom2.equals("2")) {

                valorCartaIA = valorCartaIA + 2;

            } else if (CartaRandom1.equals("3") || CartaRandom2.equals("3")) {

                valorCartaIA = valorCartaIA + 3;

            } else if (CartaRandom1.equals("4") || CartaRandom2.equals("4")) {

                valorCartaIA = valorCartaIA + 4;

            } else if (CartaRandom1.equals("5") || CartaRandom2.equals("5")) {

                valorCartaIA = valorCartaIA + 5;

            } else if (CartaRandom1.equals("6") || CartaRandom2.equals("6")) {

                valorCartaIA = valorCartaIA + 6;

            } else if (CartaRandom1.equals("7") || CartaRandom2.equals("7")) {

                valorCartaIA = valorCartaIA + 7;

            } else if (CartaRandom1.equals("8") || CartaRandom2.equals("8")) {

                valorCartaIA = valorCartaIA + 8;

            } else if (CartaRandom1.equals("9") || CartaRandom2.equals("9")) {

                valorCartaIA = valorCartaIA + 9;

            } else if (CartaRandom1.equals("10") || CartaRandom2.equals("10")) {

                valorCartaIA = valorCartaIA + 10;

            } else if (CartaRandom1.equals("Q") || CartaRandom2.equals("Q")) {

                valorCartaIA = valorCartaIA + 10;

            } else if (CartaRandom1.equals("J") || CartaRandom2.equals("J")) {

                valorCartaIA = valorCartaIA + 10;

            } else if (CartaRandom1.equals("K") || CartaRandom2.equals("K")) {

                valorCartaIA = valorCartaIA + 10;

            }
            

            System.out.println("---------------------");
            System.out.println("Bienvenido al Blackjack");
            System.out.println("---------------------");

            System.out.println("Tus cartas son: " + CartaRandom1 + " y " + CartaRandom2);
            System.out.println("Valor Cartas: " + valorCartaPlayer);

            break;

        }

    }
}
