import javax.swing.*;

public class practicaEntrada2 {
    
    public static void main (String [] args) {

        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        String edad = JOptionPane.showInputDialog("Introduce la edad");

        int edadInt = Integer.parseInt(edad);  // pasar un string a int

        System.out.println("Hola " + nombre + ", el año que viene tendrás " + (edadInt+1) + " años");

    }


}
