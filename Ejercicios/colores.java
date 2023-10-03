package Ejercicios;
import javax.swing.JOptionPane;

public class colores {
    
    public static void main(String [] args){

        String color = JOptionPane.showInputDialog("Introduce el primer color");
        String color2 = JOptionPane.showInputDialog("Introduce el segundo color");



        if (color.equalsIgnoreCase("azul") && color2.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("rojo") && color2.equalsIgnoreCase("azul")){

            JOptionPane.showMessageDialog(null, "La mezcla de colores es morado");

        }

       else {

            JOptionPane.showMessageDialog(null, "La mezcla de colores no es morado");

        }

    }

}
