public class practicaString {
    
    public static void main(String [] args){

        String nombre = "Sergio";

        System.out.println("Mi nombres es " + nombre);

        System.out.println("Mi nombre tiene " + nombre.length() + " letras");  // Numero caracteres

        System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));

        // Ver ultima letra de cualquier palabra

        int ultima_letra;
        ultima_letra = nombre.length();


        System.out.println("La última letra de mi nombre es " + nombre.charAt(ultima_letra-1));


    }



}
