import java.util.*;

import javax.swing.*;

public class generadorPass {

    public static void main(String[] args) {

        int numerorep = Integer.parseInt(JOptionPane.showInputDialog("Introduce cuantas contraseñas quieres generear"));

        int z = 0;


        int complejidad;
        int longitud2;

        do {

            complejidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la complejidad de la contraseña (1-3)."));

            if (complejidad == 1) {

                longitud2 = 6;

            }

            else if (complejidad == 2) {

                longitud2 = 9;

            } else if (complejidad == 3) {

                longitud2 = 12;

            } else if (complejidad > 3 || complejidad < 1) {

                JOptionPane.showMessageDialog(null, "Tienes que elegir una opción valida (1-3)");
                longitud2 = 0;
                System.exit(0);

            }

            else {

                longitud2 = 0;
                System.exit(0);

            }

        } while (complejidad == 1 && complejidad == 2 && complejidad == 3);

        System.out.println("Las contraseñas son: ");

        do {

            int longitud = longitud2;

            String caracteresValidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

            StringBuilder stringBuilder = new StringBuilder();

            Random random = new Random();

            for (int i = 0; i < longitud; i++) {

                int indiceAleatorio = random.nextInt(caracteresValidos.length()); 

                char caracterAleatorio = caracteresValidos.charAt(indiceAleatorio);

                stringBuilder.append(caracterAleatorio);
            }

            String stringAleatorio = stringBuilder.toString();

            System.out.print(stringAleatorio + " | ");

            z++;

        } while (z != numerorep);

    }
}
