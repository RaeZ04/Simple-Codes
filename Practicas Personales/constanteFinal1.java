public class constanteFinal1 {

    public static void main(String[] args) {

        Empleados trabajador1 = new Empleados("Raul");
        Empleados trabajador2 = new Empleados("Sara");

        trabajador1.Seccion_set("RRHH");

        System.out.println(trabajador1.Datos_get());
        System.out.println(trabajador2.Datos_get());
        

    }

}

class Empleados {

    public Empleados(String nom) {

        nombre = nom;

        seccion = "Administración";

    }

    public void Seccion_set(String seccion) { // Setter

        this.seccion = seccion;

    }


    public String Datos_get() { // Getter

        return "El nombre es: " + nombre + " y la sección es " + seccion;

    }

    private final String nombre;  // No se le puede hacer un setter
    private String seccion;

}