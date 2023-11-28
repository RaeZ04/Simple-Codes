import java.util.Scanner;

public class peticion {

    private static double base;
    private static double altura;

    public static void peticiones() {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduce la base: ");
        base = input.nextDouble();
        System.out.print("Introduce la altura: ");
        altura = input.nextDouble();

    }

    public static double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public static double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
