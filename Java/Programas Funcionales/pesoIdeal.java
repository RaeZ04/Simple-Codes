import javax.swing.*;

public class pesoIdeal {

    public static void main(String[] args) {

        String genero = "";

        do {

            genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");

        } while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));

        if (genero.equalsIgnoreCase("H")) {

            System.out.println("Tu peso ideal es " + (altura - 110));

        }

        else {

            System.out.println("Tu peso ideal es " + (altura - 120));

        }

    }

}
