import java.util.Scanner;

public class ejercicioBucle {

    public static void main(String[] args) {

        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
                27, 28, 29, 30 };

        Scanner input = new Scanner(System.in);

        System.out.println("Elige una de las 4 opciones");
        System.out.println("1. Bucle While");
        System.out.println("2. Bucle Do-While");
        System.out.println("3. Bucle For");
        System.out.println("4. Terminar programa");
        System.out.print("Elige la opcion: ");

    int eleccion = input.nextInt();

        while (eleccion != 4) {

            eleccion = input.nextInt();

            if (eleccion == 1) {

                int i = 0;

                while (i < 30) {

                    int impares = numeros[i];

                    i++;

                    if (impares % 2 == 1) {

                        System.out.println(impares);

                    }

                }
            }

            else if (eleccion == 2) {

                int z = 0;

                do {

                    int impares = numeros[z];

                    z++;

                    if (impares % 2 == 1) {

                        System.out.println(impares);

                    }

                } while (z < 30);

            }

            else if (eleccion == 3) {

                for (int j = 0; j < 30; j++) {

                    int impares = numeros[j];

                    if (impares % 2 == 1) {

                        System.out.println(impares);

                    }

                }
            }

            else if (eleccion == 4) {

                System.out.println("Se ha terminado el programa");
                System.exit(0);

            }
        }
    }

}
