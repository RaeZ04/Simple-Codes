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
            int CartaRandomInt3 = random.nextInt(cartas.length);
            String CartaRandom1 = cartas[CartaRandomInt1];
            String CartaRandom2 = cartas[CartaRandomInt2];
            String CartaRandom3 = cartas[CartaRandomInt3];

            int CartaRandomInt1IA = random.nextInt(cartas.length);
            int CartaRandomInt2IA = random.nextInt(cartas.length);
            int CartaRandomInt3IA = random.nextInt(cartas.length);
            int CartaRandomInt4IA = random.nextInt(cartas.length);
            int CartaRandomInt5IA = random.nextInt(cartas.length);
            String CartaRandom1IA = cartas[CartaRandomInt1IA];
            String CartaRandom2IA = cartas[CartaRandomInt2IA];
            String CartaRandom3IA = cartas[CartaRandomInt3IA];
            String CartaRandom4IA = cartas[CartaRandomInt4IA];
            String CartaRandom5IA = cartas[CartaRandomInt5IA];

            if (CartaRandom1 == cartas[0]) {

                valorCartaPlayer = valorCartaPlayer + 1;

            }

            if (CartaRandom1 == cartas[1]) {

                valorCartaPlayer = valorCartaPlayer + 2;

            }

            if (CartaRandom1 == cartas[2]) {

                valorCartaPlayer = valorCartaPlayer + 3;

            }

            if (CartaRandom1 == cartas[3]) {

                valorCartaPlayer = valorCartaPlayer + 4;

            }

            if (CartaRandom1 == cartas[4]) {

                valorCartaPlayer = valorCartaPlayer + 5;

            }

            if (CartaRandom1 == cartas[5]) {

                valorCartaPlayer = valorCartaPlayer + 6;

            }

            if (CartaRandom1 == cartas[6]) {

                valorCartaPlayer = valorCartaPlayer + 7;

            }

            if (CartaRandom1 == cartas[7]) {

                valorCartaPlayer = valorCartaPlayer + 8;

            }

            if (CartaRandom1 == cartas[8]) {

                valorCartaPlayer = valorCartaPlayer + 9;

            }

            if (CartaRandom1 == cartas[9]) {

                valorCartaPlayer = valorCartaPlayer + 10;

            }

            if (CartaRandom1 == cartas[10]) {

                valorCartaPlayer = valorCartaPlayer + 10;

            }

            if (CartaRandom1 == cartas[11]) {

                valorCartaPlayer = valorCartaPlayer + 10;

            }

            if (CartaRandom1 == cartas[12]) {

                valorCartaPlayer = valorCartaPlayer + 10;

            }

            if (CartaRandom2 == cartas[0]) {

                valorCartaPlayer = valorCartaPlayer + 1;

            }

            if (CartaRandom2 == cartas[1]) {

                valorCartaPlayer = valorCartaPlayer + 2;

            }

            if (CartaRandom2 == cartas[2]) {

                valorCartaPlayer = valorCartaPlayer + 3;

            }

            if (CartaRandom2 == cartas[3]) {

                valorCartaPlayer = valorCartaPlayer + 4;

            }

            if (CartaRandom2 == cartas[4]) {

                valorCartaPlayer = valorCartaPlayer + 5;

            }

            if (CartaRandom2 == cartas[5]) {

                valorCartaPlayer = valorCartaPlayer + 6;

            }

            if (CartaRandom2 == cartas[6]) {

                valorCartaPlayer = valorCartaPlayer + 7;

            }

            if (CartaRandom2 == cartas[7]) {

                valorCartaPlayer = valorCartaPlayer + 8;

            }

            if (CartaRandom2 == cartas[8]) {

                valorCartaPlayer = valorCartaPlayer + 9;

            }

            if (CartaRandom2 == cartas[9]) {

                valorCartaPlayer = valorCartaPlayer + 10;

            }

            if (CartaRandom2 == cartas[10]) {

                valorCartaPlayer = valorCartaPlayer + 10;

            }

            if (CartaRandom2 == cartas[11]) {

                valorCartaPlayer = valorCartaPlayer + 10;

            }

            if (CartaRandom2 == cartas[12]) {

                valorCartaPlayer = valorCartaPlayer + 10;

            }

            if (CartaRandom1IA.equals("As")) {

                valorCartaIA = valorCartaIA + 1;

            }

            if (CartaRandom1IA.equals("2")) {

                valorCartaIA = valorCartaIA + 2;

            }

            if (CartaRandom1IA.equals("3")) {

                valorCartaIA = valorCartaIA + 3;

            }

            if (CartaRandom1IA.equals("4")) {

                valorCartaIA = valorCartaIA + 4;

            }

            if (CartaRandom1IA.equals("5")) {

                valorCartaIA = valorCartaIA + 5;

            }

            if (CartaRandom1IA.equals("6")) {

                valorCartaIA = valorCartaIA + 6;

            }

            if (CartaRandom1IA.equals("7")) {

                valorCartaIA = valorCartaIA + 7;

            }

            if (CartaRandom1IA.equals("8")) {

                valorCartaIA = valorCartaIA + 8;

            }

            if (CartaRandom1IA.equals("9")) {

                valorCartaIA = valorCartaIA + 9;

            }

            if (CartaRandom1IA.equals("10")) {

                valorCartaIA = valorCartaIA + 10;

            }

            if (CartaRandom1IA.equals("Q")) {

                valorCartaIA = valorCartaIA + 10;

            }

            if (CartaRandom1IA.equals("J")) {

                valorCartaIA = valorCartaIA + 10;

            }

            if (CartaRandom1IA.equals("K")) {

                valorCartaIA = valorCartaIA + 10;

            }

            if (CartaRandom2IA == cartas[0]) {

                valorCartaIA = valorCartaIA + 1;

            }

            if (CartaRandom2IA == cartas[1]) {

                valorCartaIA = valorCartaIA + 2;

            }

            if (CartaRandom2IA == cartas[2]) {

                valorCartaIA = valorCartaIA + 3;

            }

            if (CartaRandom2IA == cartas[3]) {

                valorCartaIA = valorCartaIA + 4;

            }

            if (CartaRandom2IA == cartas[4]) {

                valorCartaIA = valorCartaIA + 5;

            }

            if (CartaRandom2IA == cartas[5]) {

                valorCartaIA = valorCartaIA + 6;

            }

            if (CartaRandom2IA == cartas[6]) {

                valorCartaIA = valorCartaIA + 7;

            }

            if (CartaRandom2IA == cartas[7]) {

                valorCartaIA = valorCartaIA + 8;

            }

            if (CartaRandom2IA == cartas[8]) {

                valorCartaIA = valorCartaIA + 9;

            }

            if (CartaRandom2IA == cartas[9]) {

                valorCartaIA = valorCartaIA + 10;

            }

            if (CartaRandom2IA == cartas[10]) {

                valorCartaIA = valorCartaIA + 10;

            }

            if (CartaRandom2IA == cartas[11]) {

                valorCartaIA = valorCartaIA + 10;

            }

            if (CartaRandom2IA == cartas[12]) {

                valorCartaIA = valorCartaIA + 10;

            }

            System.out.println("---------------------");
            System.out.println("Bienvenido al Blackjack");
            System.out.println("---------------------");

            System.out.println("Tus cartas son: " + CartaRandom1 + " y " + CartaRandom2);
            System.out.println("Valor Cartas: " + valorCartaPlayer);

            System.out.println("---------------------");

            System.out.println("Las cartas de la IA son: " + CartaRandom1IA + " y " + CartaRandom2IA);
            System.out.println("Valor Cartas: " + valorCartaIA);

            System.out.println("---------------------");

            System.out.print("1. Plantarte  |  2. Pedir : ");
            System.out.println("");

            Scanner input = new Scanner(System.in);

            int eleccion1 = input.nextInt();

            if (eleccion1 == 1 && valorCartaIA < valorCartaPlayer) {

                System.out.println("La IA saca la carta " + CartaRandom3IA);

                // IF

                if (CartaRandom3IA == cartas[0]) {

                    valorCartaIA = valorCartaIA + 1;

                }
                if (CartaRandom3IA == cartas[1]) {

                    valorCartaIA = valorCartaIA + 2;

                }
                if (CartaRandom3IA == cartas[2]) {

                    valorCartaIA = valorCartaIA + 3;

                }
                if (CartaRandom3IA == cartas[3]) {

                    valorCartaIA = valorCartaIA + 4;

                }
                if (CartaRandom3IA == cartas[4]) {

                    valorCartaIA = valorCartaIA + 5;

                }
                if (CartaRandom3IA == cartas[5]) {

                    valorCartaIA = valorCartaIA + 6;

                }
                if (CartaRandom3IA == cartas[6]) {

                    valorCartaIA = valorCartaIA + 7;

                }
                if (CartaRandom3IA == cartas[7]) {

                    valorCartaIA = valorCartaIA + 8;

                }
                if (CartaRandom3IA == cartas[8]) {

                    valorCartaIA = valorCartaIA + 9;

                }
                if (CartaRandom3IA == cartas[9]) {

                    valorCartaIA = valorCartaIA + 10;

                }
                if (CartaRandom3IA == cartas[10]) {

                    valorCartaIA = valorCartaIA + 10;

                }
                if (CartaRandom3IA == cartas[11]) {

                    valorCartaIA = valorCartaIA + 10;

                }
                if (CartaRandom3IA == cartas[12]) {

                    valorCartaIA = valorCartaIA + 10;

                }

                System.out.println("Valor Cartas: " + valorCartaIA);

                if (valorCartaIA > 21) {

                    JOptionPane.showMessageDialog(null, "La IA ha sacado mas de 21, has ganado");
                    System.exit(0);

                }
                if (valorCartaIA < 21 && valorCartaIA > valorCartaPlayer) {

                    JOptionPane.showMessageDialog(null, "La IA ha ganado al sacar mas que tu");
                    System.exit(0);

                }
                if (valorCartaPlayer > valorCartaIA) {

                    JOptionPane.showMessageDialog(null, "Has ganado al sacar mas que la IA");
                    System.exit(0);

                }

                System.exit(0);

            }



            if (eleccion1 == 2) {

                System.out.println("Sacas la carta: " + CartaRandom3);

                if (CartaRandom3 == cartas[0]) {

                    valorCartaPlayer = valorCartaPlayer + 1;

                }

                if (CartaRandom3 == cartas[1]) {

                    valorCartaPlayer = valorCartaPlayer + 2;

                }

                if (CartaRandom3 == cartas[2]) {

                    valorCartaPlayer = valorCartaPlayer + 3;

                }

                if (CartaRandom3 == cartas[3]) {

                    valorCartaPlayer = valorCartaPlayer + 4;

                }

                if (CartaRandom3 == cartas[4]) {

                    valorCartaPlayer = valorCartaPlayer + 5;

                }

                if (CartaRandom3 == cartas[5]) {

                    valorCartaPlayer = valorCartaPlayer + 6;

                }

                if (CartaRandom3 == cartas[6]) {

                    valorCartaPlayer = valorCartaPlayer + 7;

                }

                if (CartaRandom3 == cartas[7]) {

                    valorCartaPlayer = valorCartaPlayer + 8;

                }

                if (CartaRandom3 == cartas[8]) {

                    valorCartaPlayer = valorCartaPlayer + 9;

                }

                if (CartaRandom3 == cartas[9]) {

                    valorCartaPlayer = valorCartaPlayer + 10;

                }

                if (CartaRandom3 == cartas[10]) {

                    valorCartaPlayer = valorCartaPlayer + 10;

                }

                if (CartaRandom3 == cartas[11]) {

                    valorCartaPlayer = valorCartaPlayer + 10;

                }

                if (CartaRandom3 == cartas[12]) {

                    valorCartaPlayer = valorCartaPlayer + 10;

                }

                System.out.println("Valor Cartas: " + valorCartaPlayer);

                if (valorCartaPlayer > 21) {

                    JOptionPane.showMessageDialog(null, "Te has pasado de 21, la IA gana");
                    System.exit(0);

                }

                if (valorCartaPlayer == 21 && valorCartaIA == 21){

                    JOptionPane.showMessageDialog(null, "Empate, ambos habeis sacado 21");
                    System.exit(0);

                }
                else if (valorCartaPlayer == 21){

                    if (CartaRandom4IA == cartas[0]) {

                        valorCartaIA = valorCartaIA + 1;

                    }
                    if (CartaRandom4IA == cartas[1]) {

                        valorCartaIA = valorCartaIA + 2;

                    }
                    if (CartaRandom4IA == cartas[2]) {

                        valorCartaIA = valorCartaIA + 3;

                    }
                    if (CartaRandom4IA == cartas[3]) {

                        valorCartaIA = valorCartaIA + 4;

                    }
                    if (CartaRandom4IA == cartas[4]) {

                        valorCartaIA = valorCartaIA + 5;

                    }
                    if (CartaRandom4IA == cartas[5]) {

                        valorCartaIA = valorCartaIA + 6;

                    }
                    if (CartaRandom4IA == cartas[6]) {

                        valorCartaIA = valorCartaIA + 7;

                    }
                    if (CartaRandom4IA == cartas[7]) {

                        valorCartaIA = valorCartaIA + 8;

                    }
                    if (CartaRandom4IA == cartas[8]) {

                        valorCartaIA = valorCartaIA + 9;

                    }
                    if (CartaRandom4IA == cartas[9]) {

                        valorCartaIA = valorCartaIA + 10;

                    }
                    if (CartaRandom4IA == cartas[10]) {

                        valorCartaIA = valorCartaIA + 10;

                    }
                    if (CartaRandom4IA == cartas[11]) {

                        valorCartaIA = valorCartaIA + 10;

                    }
                    if (CartaRandom4IA == cartas[12]) {

                        valorCartaIA = valorCartaIA + 10;

                    }

                    System.out.println("La IA ha sacado " + CartaRandom5IA);
                    System.out.println("Valor Cartas: " + valorCartaIA);

                    if (valorCartaIA == 21){

                        System.out.println("Habeis empatado");
                        System.exit(0);

                    }

                    if (valorCartaIA < 21 || valorCartaIA > 21){

                        System.out.println("Has ganado");
                        System.exit(0);

                    }



                }

                if (valorCartaPlayer < 21){

                    if (CartaRandom5IA == cartas[0]) {

                        valorCartaIA = valorCartaIA + 1;

                    }
                    if (CartaRandom5IA == cartas[1]) {

                        valorCartaIA = valorCartaIA + 2;

                    }
                    if (CartaRandom5IA == cartas[2]) {

                        valorCartaIA = valorCartaIA + 3;

                    }
                    if (CartaRandom5IA == cartas[3]) {

                        valorCartaIA = valorCartaIA + 4;

                    }
                    if (CartaRandom5IA == cartas[4]) {

                        valorCartaIA = valorCartaIA + 5;

                    }
                    if (CartaRandom5IA == cartas[5]) {

                        valorCartaIA = valorCartaIA + 6;

                    }
                    if (CartaRandom5IA == cartas[6]) {

                        valorCartaIA = valorCartaIA + 7;

                    }
                    if (CartaRandom5IA == cartas[7]) {

                        valorCartaIA = valorCartaIA + 8;

                    }
                    if (CartaRandom5IA == cartas[8]) {

                        valorCartaIA = valorCartaIA + 9;

                    }
                    if (CartaRandom5IA == cartas[9]) {

                        valorCartaIA = valorCartaIA + 10;

                    }
                    if (CartaRandom5IA == cartas[10]) {

                        valorCartaIA = valorCartaIA + 10;

                    }
                    if (CartaRandom5IA == cartas[11]) {

                        valorCartaIA = valorCartaIA + 10;

                    }
                    if (CartaRandom5IA == cartas[12]) {

                        valorCartaIA = valorCartaIA + 10;

                    }

                    System.out.println("La IA saca la carta " + CartaRandom3IA);
                    System.out.println("Valor Cartas: " + valorCartaIA);


                }

                System.exit(0);

            }

        }

    }

}
