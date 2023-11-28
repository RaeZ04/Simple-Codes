import javax.swing.*;

public class practicaBucles {

    public static void main (String [] args){

        String clave = "Sergio";

        String pass = "";

        while (clave.equals(pass)==false){

            pass = JOptionPane.showInputDialog("Introduzca la contraseña");

            if  (clave.equals(pass)==false){

                System.out.println("La contraseña es incorrecta, intentelo de nuevo");

            }

            else{

                System.out.println("Contraseña correcta");

            }

        }

    }
    
}
