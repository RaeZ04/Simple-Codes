public class practicaString3 {

    public static void main (String [] args){

        // Comprueba si dos Strings son iguales, Diferencia mayusculas tambien

        String nombre1, nombre2;

        nombre1 = "Sergio";
        nombre2 = "Sergio";

        System.out.println(nombre1.equals(nombre2));

        nombre1 = "Sergio";
        nombre2 = "sergio";

        System.out.println(nombre1.equals(nombre2));

        // Comprueba si dos Strings son iguales, pero ignora mayusculas

        System.out.println(nombre1.equalsIgnoreCase(nombre2));

    }
    
}
