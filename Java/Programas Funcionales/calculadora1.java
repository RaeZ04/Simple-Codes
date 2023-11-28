import javax.swing.*;

public class calculadora1 {

    public static void main(String[] args) {

        int eleccion;

        do {

            String input = JOptionPane.showInputDialog("Elige una opción: 1: Suma | 2: Resta | 3: Multiplicación | 4: División | 5: Raíz Cuadrada | 6: Potencia | 7: Factorial");

            if (input.trim().isEmpty()){

                eleccion = 0;

            } else{
 
                eleccion = Integer.parseInt(input);

            }

            if (eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4 & eleccion != 5 && eleccion != 6 && eleccion != 7){

                JOptionPane.showMessageDialog(null, "Debes ingresar una opción válida.");
                eleccion = 0;

            }else{

                eleccion = Integer.parseInt(input);

            }

        } while (eleccion <= 0);

        switch (eleccion) {

            case 1:

                double num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número"));
                double num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número"));

                System.out.println("El resultado de la suma es " + (num1 + num2));

                break;

            case 2:

                num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número"));

                System.out.println("El resultado de la suma es " + (num1 - num2));

                break;

            case 3:

                num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número"));

                System.out.println("El resultado de la multiplicación es " + (num1 * num2));

                break;

            case 4:

                num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número"));

                if (num2 == 0){

                    JOptionPane.showMessageDialog(null, "No se puede divir entre 0, ingresa otro número.");
                    break;
                    
                }

                System.out.println("El resultado de la división es " + (num1 / num2));


                break;

            case 5:

                double numRaiz = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número"));

                System.out.println("La raíz es " + (Math.sqrt(numRaiz)));

                break;

            case 6:

                double base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base"));
                double exponente = Double.parseDouble(JOptionPane.showInputDialog("Introduce el exponente"));

                System.out.println("El resultado de la potencia es " + (Math.pow(base, exponente)));

                break;

            case 7:

                double resultado = 1;
                double numFact = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero"));

                for (double i = numFact; i > 0; i--) {

                    resultado = resultado * i;

                }

                Double resultadoFact = resultado;

                System.out.print("El factorial de " + numFact + " es ");
                System.out.printf("%1.2f", resultadoFact);

                break;

        }

    }

}
