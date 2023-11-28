public class pracicaString2 {

    public static void main(String [] args){

        // Extraer texto de una cadena

        String frase = "Hola buenas noches";

        String frase_resumen = frase.substring(5, 11);

        System.out.println(frase_resumen);

        // Ejemplo 2 extraer

        String frase2 = frase.substring(0, 12) + "tardes";

        System.out.println(frase2);

    }
    
}
