package POO.poo1;


import javax.swing.*;

public class vehiculo_main {

    public static void main(String[] args) {

        coche coche1 = new coche();

        coche1.color_set("Rojo");

        FurgonetaHerencia furgoneta1 = new FurgonetaHerencia(7, 580);

        furgoneta1.color_set("Azul");
        furgoneta1.asientos_cfg("Si");
        furgoneta1.climatizador_cfg("Si");

        System.out.println(coche1.datos_default() + " " + coche1.color_get());

        System.out.println(furgoneta1.datos_default() + " " + furgoneta1.datosFurgoneta_get());


    }

}
