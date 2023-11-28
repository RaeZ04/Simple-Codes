import java.util.*;

public class persona {

    private String nombre;
    private int edad;
    private ArrayList <bebida> carrito = new ArrayList<bebida>();
    

    public persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



        

}
