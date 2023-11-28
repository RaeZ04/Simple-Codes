import javax.swing.*;

public class practicaEntrada3 {

    public static void main (String[] args){

        // Acota un numero a los decimales que quieras, 2 en este caso.

        // double x = 10000.0;

        // System.out.printf("%1.2f", x/3);

        String num1 = JOptionPane.showInputDialog("Introduce un número");

        double num2 = Double.parseDouble(num1);

        System.out.print("La raiz de " + num2 + " es ");

        System.out.printf("%1.2f", Math.sqrt(num2));

    }

    
}
