package poo;

public class coche_main {

    public static void main(String[] args) {

        coche micoche = new coche();

        micoche.color_set("amarillo");
    

        System.out.println(micoche.color_get());
        System.out.println(micoche.datos_default());

        micoche.asientos_cfg("si");

        System.out.println(micoche.asientos_get());


    }

}
