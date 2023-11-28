public class bebida {

    private String nombre = "Cerveza";
    private String marca = "Heineken";
    private boolean alcohol = true;

    public bebida(String nombre, String marca, boolean alcohol) {
        this.nombre = nombre;
        this.marca = marca;
        this.alcohol = alcohol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

}
