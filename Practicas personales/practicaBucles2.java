import java.util.*;

public class practicaBucles2 {

    public static void main (String [] args ){

        int random = (int) (Math.random()*100);

        Scanner entrada = new Scanner(System.in);

        int num = 0;

        int intentos = 0;

        do{

            intentos++;

            System.out.println("Introduce un número");

            num = entrada.nextInt();

            if (random<num){

                System.out.println("\nMás bajo \n");

            }

            else if (random>num){

                System.out.println("\nMás alto \n");

            }

        }while(num!=random);

        System.out.println("Correcto!, has acertado en " + intentos + " intentos!");

    }
    
}
