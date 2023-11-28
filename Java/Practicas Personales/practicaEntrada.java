import java.util.Scanner;

public class practicaEntrada {
    
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Introduce tu nombre");

        String nombre_usuario = entrada.nextLine(); // Devuelve String

        System.out.println("Introduce tu edad");

        int edad = entrada.nextInt(); // Devuelve Int

        System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad+1) + " años." );

        entrada.close();

    }

}
