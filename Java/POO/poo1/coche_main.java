package POO.poo1;


import javax.swing.*;

public class coche_main {

    public static void main(String[] args) {

        coche micoche = new coche();

        micoche.color_set(JOptionPane.showInputDialog("Introduce el color del coche"));
    

        System.out.println(micoche.color_get());
        System.out.println(micoche.datos_default());

        micoche.asientos_cfg(JOptionPane.showInputDialog("¿El coche tiene asientos de cuero? (Si/No)"));

        System.out.println(micoche.asientos_get());

        micoche.climatizador_cfg(JOptionPane.showInputDialog("¿El coche tiene climatizador? (Si/No)"));
        System.out.println(micoche.climatizador_get());

        System.out.println(micoche.pesocoche_get());

        System.out.println("El precio final del coche es: " + micoche.precio_coche() + ".");


    }

}
