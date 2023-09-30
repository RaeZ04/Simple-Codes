import java.util.*;

public class practicaCalculadoraSuma {
    
    public static void main (String [] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");

        int num1 = entrada.nextInt();

        System.out.println("Introduce el segundo número: ");

        int num2 = entrada.nextInt();        
        
        int resultado = num1 + num2;

        if (resultado == 7){
            System.out.println("Numero maldito");

        } else {
            System.out.println("El resultado es: " + resultado);
        }

        
        // Avanzado

        //  switch(resultado){
        //      case 7 : System.out.println("numero malidito");
        //      break;
        //      default: System.out.println("El resultado es: " + resultado);
        //  }
        
        entrada.close();

    }

}
