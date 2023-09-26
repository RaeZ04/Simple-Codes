import java.util.*;
import javax.swing.*;

public class practicaAreas {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Elige una opción: \n1: Cuadrado \n2: Recángulo \n3: Triángulo \n4: Círculo \n");

        int eleccion = entrada.nextInt();

        switch (eleccion) {

            case 1: 

                double lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el tamaño del lado")); 

                System.out.println("El area del cuadrado es " + Math.pow(lado, 2));

                break;

            case 2: 

                double base = Double.parseDouble(JOptionPane.showInputDialog("Introduce el tamaño de la base"));

                double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce el tamaño de la altura"));

                System.out.println("El área del rectángulo es " + base*altura);
                
                break;

            case 3: 

                base = Double.parseDouble(JOptionPane.showInputDialog("Introduce el tamaño de la base"));

                altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce el tamaño de la altura"));

                System.out.println("El área del tríangulo es " + (base*altura)/2);

                break;

            case 4: 

                double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));

                System.out.print("El área del círculo es ");

                System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));

                break;

            default:
                System.out.println("La opción no es correcta.");

        }

        entrada.close();

    }
    
}
