import java.util.*;

public class ejercicio4 {

    public static void main(String[] args) {

        boolean salir = true;
        while (salir == true) {

            try {

                System.out.print("Elije una hora (0-23): ");

                Scanner input = new Scanner(System.in);
                int hora = input.nextInt();

                if (hora >= 0 && hora <= 12) {

                    System.out.println("--------------");
                    System.out.println("Buenos dias");
                    System.out.println("--------------");

                } else if (hora >= 13 && hora <= 21) {

                    System.out.println("--------------");
                    System.out.println("Buenas tardes");
                    System.out.println("--------------");

                } else if (hora >= 22 && hora <= 23) {

                    System.out.println("--------------");
                    System.out.println("Buenas noches");
                    System.out.println("--------------");

                } else {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("No has indicado una hora correcta (0-23)");
                    System.out.println("-----------------------------------------------------------");

                }

            }

            catch (InputMismatchException e) {

                System.out.println("--------------------------------------------------------");
                System.out.println("No puedes insertar letras, prueba poniendo del 0-23");
                System.out.println("--------------------------------------------------------");

            }
        }

    }

}
