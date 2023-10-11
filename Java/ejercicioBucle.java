import java.util.*;

public class ejercicioBucle {

    public static void imprimirInverso(ArrayList<Integer> lista) {

        int lon = lista.size();

        System.out.println("\n");

        for (int i = lon - 1; i >= 0; i--) {

            System.out.print(lista.get(i) + " | ");

        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
                27, 28, 29, 30 };

        boolean seguir = true;

        while (seguir) {

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

                    int i = 0;
                    ArrayList<Integer> impares = new ArrayList<Integer>();

                    while (i < 30) {

                        int num = numeros[i];
                        i++;

                        if (num % 2 != 0) {

                            System.out.print(num + " | ");
                            impares.add(num);

                        }
                    }

                    imprimirInverso(impares);
                    System.out.println("----------------------------------------------------------------------");

                } else if (eleccion == 2) {

                    int z = 0;
                    ArrayList<Integer> impares = new ArrayList<Integer>();

                    do {

                        int num = numeros[z];
                        z++;

                        if (num % 2 != 0) {

                            System.out.print(num + " | ");
                            impares.add(num);

                        }

                    } while (z < 30);

                    imprimirInverso(impares);
                    System.out.println("----------------------------------------------------------------------");

                } else if (eleccion == 3) {

                    ArrayList<Integer> impares = new ArrayList<Integer>();
                    for (int j = 0; j < 30; j++) {

                        int num = numeros[j];

                        if (num % 2 != 0) {

                            System.out.print(num + " | ");
                            impares.add(num);

                        }
                    }

                    imprimirInverso(impares);
                    System.out.println("----------------------------------------------------------------------");

                } else if (eleccion == 4) {

                    System.out.println("Se ha terminado el programa");
                    seguir = false;

                } else {

                    System.out.println("No has elegido la opción correcta, elige del 1 al 4");
                    System.out.println("----------------------------------------------------------------------");

                    input.close();

                }

            } catch (InputMismatchException e) {

                System.out.println("-----------------------------------------");
                System.out.println("No puedes ingresar letras, elige del 1-4");
                System.out.println("-----------------------------------------");

            }

        }
    }
}
