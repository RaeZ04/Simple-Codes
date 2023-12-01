package DNI;

import java.util.Scanner;

public class dni {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("DNI: ");
        String dni = scanner.next();

        int numeroDNI = Integer.parseInt(dni.substring(0, dni.length() - 1));
        char letraDNI = dni.charAt(dni.length() - 1);

        if (esDNIValido(numeroDNI, letraDNI)) {
            System.out.println("El DNI es válido.");
        } else {
            System.out.println("El DNI no es válido.");
        }

        scanner.close();
    }

    public static boolean esDNIValido(int numeroDNI, char letraDNI) {

        int indiceLetra = numeroDNI % 23;

        char letraCalc = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(indiceLetra);

        return letraCalc == Character.toUpperCase(letraDNI);
    }
}
