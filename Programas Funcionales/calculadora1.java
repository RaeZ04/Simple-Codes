import java.util.*;
import javax.swing.*;

public class calculadora1 {

    public static void main (String [] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Elige una opción: \n1: Suma \n2: Resta \n3: Multiplicación \n4: División \n5: Raíz Cuadrada \n6: Potencia \n7: Factorial");

        int eleccion = entrada.nextInt();

        switch (eleccion) {

            case 1: 

                double num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número")); 
                double num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número")); 

                System.out.println("El resultado de la suma es " + (num1+num2));

                break;

            case 2: 

                num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número")); 
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número")); 

                System.out.println("El resultado de la suma es " + (num1-num2));

                break;

            case 3: 

                num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número")); 
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número")); 

                System.out.println("El resultado de la multiplicación es " + (num1*num2));

                break;

            case 4: 

                num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número")); 
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número")); 

                System.out.println("El resultado de la división es " + (num1/num2));

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

                Long resultadoFact = 1L;
                int numFact = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número a realizar el factorial"));
                for (int i=numFact; i>0; i--){

                    resultadoFact = resultadoFact * i;

                }

                System.out.println("El factorial de " + numFact + " es " + resultadoFact);

            default:
                System.out.println("La opción no es correcta.");

        }


    }
    
}
