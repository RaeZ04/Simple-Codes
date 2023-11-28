package Ejercicios.Ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {

        String pepito = "Pepito";
        String jose = "Jose";
        System.out.println(hola1(pepito));
        hola2(jose);

    }

    public static String hola1(String pepito) {

        return "Hola Don " + pepito;

    }

    public static void hola2(String jose) {

        System.out.println("Hola Don " + jose);

    }

}