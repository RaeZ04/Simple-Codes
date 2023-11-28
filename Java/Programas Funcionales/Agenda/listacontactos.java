import java.util.ArrayList;

public class listacontactos {

    private ArrayList<agenda> contacto;

    public listacontactos() {
        contacto = new ArrayList<>();
    }

    public void agregarContacto(agenda agenda) {
        contacto.add(agenda);
    }

    public void mostrarContacto(){

        for (int i = 0; i<contacto.size(); i++){

            System.out.println("Contacto " + Integer.toString(i+1)+ " | " + "Nombre: " + contacto.get(i).getNombre() + ", Teléfono: " + contacto.get(i).getTelefono() + ", Mail: " + contacto.get(i).getMail() + ".");
            System.out.println();

        }

    }

}
