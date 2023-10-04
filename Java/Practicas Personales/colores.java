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

        if (color.equalsIgnoreCase("rojo") && color2.equalsIgnoreCase("amarillo") || color.equalsIgnoreCase("amarillo") && color2.equalsIgnoreCase("rojo")){

            JOptionPane.showMessageDialog(null, "La mezcla de colores es naranja");

        }

       else {

            JOptionPane.showMessageDialog(null, "La mezcla de colores no es naranja");

        }

    }

}
