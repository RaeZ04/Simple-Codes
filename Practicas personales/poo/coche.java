package poo;

public class coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero;
    private boolean climatizador;

    public coche() {

        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;

    }

    public String datos_default() {  // GETTER

        return "La plataforma del coche tiene " + ruedas + " ruedas." + " Mide " + largo / 1000
                + " metros con un ancho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kg.";

    }

    public void color_set(String color_coche) {  // SETTER

        color = color_coche;

    }

    public String color_get() {  // GETTER

        return "El color del coche es " + color;

    }

    public void asientos_cfg(String asientos_cuero) {   // SETTER

        if (asientos_cuero.equalsIgnoreCase("si")) {

            this.asientos_cuero = true;

        } else {

            this.asientos_cuero = false;

        }

    }

    public String asientos_get(){   // GETTER

        if (asientos_cuero == true){

            return "El coche tiene asientos de cuero";

        } else {

            return "El coche no tiene asientos de cuero";

        }

    }

}
