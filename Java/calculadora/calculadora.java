import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Opciones:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

        Scanner input = new Scanner(System.in);
        boolean seguir = true;

        while (seguir == true) {

            System.out.println();
            System.out.print("Elige la opcion: ");
            int eleccion = input.nextInt();

            if (eleccion == 1) {

                System.out.println();
                System.out.print("Introduce el primer numero: ");
                double a = input.nextInt();
                System.out.print("Introduce el segundo numero: ");
                double b = input.nextInt();

                cal2.suma(a, b);

            }

            else if (eleccion == 2) {

                System.out.println();
                System.out.print("Introduce el primer numero: ");
                double a = input.nextInt();
                System.out.print("Introduce el segundo numero: ");
                double b = input.nextInt();

                cal2.resta(a, b);

            }

            else if (eleccion == 3) {

                System.out.println();
                System.out.print("Introduce el primer numero: ");
                double a = input.nextInt();
                System.out.print("Introduce el segundo numero: ");
                double b = input.nextInt();

                cal2.multiplicacion(a, b);

            }

            else if (eleccion == 4) {

                System.out.println();
                System.out.print("Introduce el primer numero: ");
                double a = input.nextInt();
                System.out.print("Introduce el segundo numero: ");
                double b = input.nextInt();

                cal2.division(a, b);

            }
            else if (eleccion == 5){

                System.out.println();
                System.out.println("Has salido del programa correctamente");
                seguir = false;

            }
            else{

                System.out.println();
                System.out.println("Has elegido una opcion incorrecta, elige del 1-4");

            }

        }
    }

}
