import java.util.*;

public class practicaclase {

    public static void main(String[] args) {

        // System.out.print("Introduce el numero: ");
        // Scanner input = new Scanner(System.in);

        // long numero = input.nextLong();

        // long raiz = (long) Math.sqrt(numero);
        // long pow = (long) Math.pow(numero, 2);

        // System.out.println("La raiz es " + raiz + " y la potencia es " + pow);

        int uno = 0;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;
        int seis = 0;

        for (int i = 0; i <= 49; i++) {

            int rand = (int) (Math.random() * 6 + 1);
            System.out.println("En la tirada " + (i + 1) + " has sacado un " + rand);

            if (rand == 1) {
                uno++;
                
            }else if (rand == 2){
                dos++;

            }else if (rand == 3){
                tres++;

            }else if (rand == 4){
                cuatro++;

            }else if (rand == 5){
                cinco++;

            }else if (rand == 6){
                seis++;

            }
        }

        System.out.println("\nHa salido el uno " + uno + " veces." + "\nHa salido el dos " + dos + " veces."
            + "\nHa salido el tres " + tres + " veces." + "\nHa salido el cuatro " + cuatro + " veces. " + "\nHa salido el cinco " + cinco + " veces."
            + "\nHa salido el seis " + seis + " veces.");

    }

}
