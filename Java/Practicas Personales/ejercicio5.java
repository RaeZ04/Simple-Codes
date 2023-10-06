import java.util.*;

public class ejercicio5 {

    public static void imprimirInverso(int[] array, int longitud) {

        for (int i = longitud - 1; i >= 0; i--) {

            System.out.print(array[i] + " | ");

        }

        System.out.println("");
        System.out.println("----------------------------------------------------------------------");

    }

    public static void main(String[] args) {

        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
                27, 28, 29, 30 };

        boolean seguir = true;

        while (seguir == true) {

            try {

                Scanner input = new Scanner(System.in);

                System.out.println("Elige una de las 4 opciones");
                System.out.println("1. Bucle While");
                System.out.println("2. Bucle Do-While");
                System.out.println("3. Bucle For");
                System.out.println("4. Terminar programa");
                System.out.println("");
                System.out.print("Elige la opción: ");

                int eleccion = input.nextInt();

                System.out.println("----------------------------------------------------------------------");

                if (eleccion == 1) {

                    int[] impares = new int[numeros.length];

                    int contador = 0;

                    int i = 0;

                    while (i < 30) {

                        int num = numeros[i];

                        if (num % 2 == 1) {

                            impares[contador] = num;

                            contador++;
                        }

                        i++;
                    }

                    imprimirInverso(impares, contador);

                } else if (eleccion == 2) {

                    int[] impares = new int[numeros.length];

                    int contador = 0;

                    int z = 0;

                    do {

                        int num = numeros[z];

                        if (num % 2 == 1) {

                            impares[contador] = num;

                            contador++;

                        }

                        z++;

                    } while (z < numeros.length);

                    imprimirInverso(impares, contador);

                } else if (eleccion == 3) {

                    int[] impares = new int[numeros.length];

                    int contador = 0;

                    for (int j = 0; j < numeros.length; j++) {

                        int num = numeros[j];

                        if (num % 2 == 1) {

                            impares[contador] = num;
                            contador++;

                        }
                    }

                    imprimirInverso(impares, contador);

                } else if (eleccion == 4) {

                    System.out.println("Se ha terminado el programa");

                    seguir = false;

                } else {

                    System.out.println("No has elegido la opción correcta, elige del 1 al 4");
                    System.out.println("----------------------------------------------------------------------");

                }

                
            }

            catch (InputMismatchException e) {

                System.out.println("--------------------------------------------------------");
                System.out.println("No puedes insertar letras, prueba poniendo del 1-4");
                System.out.println("--------------------------------------------------------");

            }

        }

        

    }

}
