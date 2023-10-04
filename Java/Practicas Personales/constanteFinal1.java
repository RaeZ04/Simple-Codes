public class constanteFinal1 {

    public static void main(String[] args) {

        Empleados trabajador1 = new Empleados("Raul");
        Empleados trabajador2 = new Empleados("Sara");
        Empleados trabajador3 = new Empleados("Jose");

        trabajador1.Seccion_set("RRHH");

        System.out.println(trabajador1.Datos_get() + "\n" + trabajador2.Datos_get() + "\n" + trabajador3.Datos_get());

        System.out.println(Empleados.id_get());

        
    }

}

class Empleados {

    public Empleados(String nom) {

        nombre = nom;

        seccion = "Administración";

        id = id2;

        id2++;

    }

    public void Seccion_set(String seccion) { // Setter

        this.seccion = seccion;

    }


    public String Datos_get() { // Getter

        return "El nombre es: " + nombre + " y la sección es " + seccion + " y el ID es el " + id;

    }

    public static String id_get(){

        return "El id siguiente es: " + id2;

    }

    private final String nombre;  // No se le puede hacer un setter
    private String seccion;
    private int id;
    private static int id2 = 1;

}