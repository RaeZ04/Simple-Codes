import javax.swing.JOptionPane;
import java.util.*;

public class piedrapapeltijera {

    public static void main(String[] args) {

        System.out.println("Juego de Piedra, Papel o Tijera");
        System.out.println("--------------------------------");

        Random random = new Random();
        int opciones = random.nextInt(3) + 1;

        String maquina = "nada";

        if (opciones == 1) {

            maquina = "Piedra";

        }

        if (opciones == 2) {

            maquina = "Tijera";

        }

        if (opciones == 3) {

            maquina = "Papel";

        }

        int valorTijera = 0;
        int valorPapel = 0;
        int valorPiedra = 0;

        if (maquina.equalsIgnoreCase("tijera")) {

            valorTijera = 1;

        }

        if (maquina.equalsIgnoreCase("papel")) {

            valorPapel = 1;

        }

        if (maquina.equalsIgnoreCase("piedra")) {

            valorPiedra = 1;

        }

        boolean fallo = true;
        int valorEleccion = 0;
        String eleccion = "";

        while (fallo == true) {

            eleccion = JOptionPane.showInputDialog("Elige: Piedra, Papel o Tijera");

            

            if (eleccion.equalsIgnoreCase("tijera")) {

                valorEleccion = 4;
                fallo = false;

            }

            else if (eleccion.equalsIgnoreCase("papel")) {

                valorEleccion = 5;
                fallo = false;

            }

            else if (eleccion.equalsIgnoreCase("piedra")) {

                valorEleccion = 6;
                fallo = false;

            }

            else if (eleccion.trim().isEmpty()) {

                System.out.println("No puedes dejar el texto en blanco, elija entre 'Piedra', 'Papel' o 'Tijera'");
                fallo = true;

            }

            else {

                System.out.println("La opcion indicada no existe, elija entre 'Piedra','Papel' o 'Tijera'");
                fallo = true;

            }

        }

        if (maquina.equalsIgnoreCase(eleccion)) {

            System.out.print("Elijo: " + maquina);
            System.out.println(" | Hemos empatado.");

        }

        if (valorTijera == 1 && valorEleccion == 5) {

            System.out.print("Elijo: " + maquina);
            System.out.println(" | Has perdido");

        }

        if (valorTijera == 1 && valorEleccion == 6) {

            System.out.print("Elijo: " + maquina);
            System.out.println(" | Has ganado");

        }

        if (valorPapel == 1 && valorEleccion == 6) {

            System.out.print("Elijo: " + maquina);
            System.out.println(" | Has perdido");

        }

        if (valorPapel == 1 && valorEleccion == 4) {

            System.out.print("Elijo: " + maquina);
            System.out.println(" | Has ganado");

        }

        if (valorPiedra == 1 && valorEleccion == 4) {

            System.out.print("Elijo: " + maquina);
            System.out.println(" | Has perdido");

        }

        if (valorPiedra == 1 && valorEleccion == 5) {

            System.out.print("Elijo: " + maquina);
            System.out.println(" | Has ganado");

        }

    }

}
