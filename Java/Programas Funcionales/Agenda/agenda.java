public class agenda {

    private String nombre;
    private int telefono;
    private String mail;

    public agenda(String nombre, int     telefono, String mail) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }

}
