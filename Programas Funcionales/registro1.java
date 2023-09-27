import javax.swing.*;

public class registro1 {

    public static void main(String[] args) {

        String clave = JOptionPane.showInputDialog("Registre una contraseña");

        if (!clave.equals("")) {

            System.out.println("Registro completado");

        }

        else {

            while (clave.equals("") == true) {

                clave = JOptionPane.showInputDialog("La contraseña no puede estar en blanco, intentelo de nuevo");

            }

            System.out.println("Registro completado");

        }

        String pass = "";

        pass = JOptionPane.showInputDialog("Introduzca la contraseña");

        while (clave.equals(pass) == false) {

            pass = JOptionPane.showInputDialog("Contraseña incorrecta, introduzcala de nuevo");

        }

        if (clave.equals(pass)) {

            System.out.println("La contraseña es correcta");

        }

    }

}
