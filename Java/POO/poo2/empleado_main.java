package POO.poo2;

import java.util.*;

public class empleado_main {

    public static void main(String[] args) {

        // Empleado empleado1 = new Empleado("Raul Guijon", 60000, 1990, 12, 17);
        // Empleado empleado2 = new Empleado("Sofia Marques", 75000, 1996, 06, 04);
        // Empleado empleado3 = new Empleado("Toni Gonzalez", 93000, 2001, 03, 15);

        // empleado1.sueldo_set(5);
        // empleado2.sueldo_set(8);
        // empleado3.sueldo_set(12);

        // System.out.println("Nombre: " + empleado1.nombre_get() + ", Sueldo: " +
        // empleado1.sueldo_get() + ", Fecha de alta: " +
        // empleado1.fechaContrato_get());
        // System.out.println("Nombre: " + empleado2.nombre_get() + ", Sueldo: " +
        // empleado2.sueldo_get() + ", Fecha de alta: " +
        // empleado2.fechaContrato_get());
        // System.out.println("Nombre: " + empleado3.nombre_get() + ", Sueldo: " +
        // empleado3.sueldo_get() + ", Fecha de alta: " +
        // empleado3.fechaContrato_get());

        Empleado[] misEmpleados = new Empleado[3];

        misEmpleados[0] = new Empleado("Raul Guijon", 60000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Sofia Marques", 75000, 1996, 06, 04);
        misEmpleados[2] = new Empleado("Toni Gonzalez", 93000, 2001, 03, 15);

        for (Empleado e : misEmpleados) { // For Each

            e.sueldo_set(5);

        }

        for (Empleado e : misEmpleados) {

            System.out.println("Nombre: " + e.nombre_get() + ", Sueldo: " + e.sueldo_get() + ", Fecha de alta: "
                    + e.fechaContrato_get());

        }

        // for (int i = 0 ; i<3 ; i++){

        // misEmpleados[i].sueldo_set(5);

        // }

        

        // for (int i = 0; i < 3; i++) {

        // System.out.println("Nombre: " + misEmpleados[i].nombre_get() + ", Sueldo: " +
        // misEmpleados[i].sueldo_get()
        // + ", Fecha de alta: " + misEmpleados[i].fechaContrato_get());

        // }

    }

}

class Empleado {

    public Empleado(String nom, double sue, int agno, int mes, int dia) {

        nombre = nom;
        sueldo = sue;

        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);

        altaContrato = calendario.getTime();

    }

    public String nombre_get() { // GETTER

        return nombre;

    }

    public double sueldo_get() { // GETTER

        return sueldo;

    }

    public Date fechaContrato_get() { // GETTER

        return altaContrato;

    }

    public void sueldo_set(double porcentaje) {

        double aumento = sueldo * porcentaje / 100;

        sueldo += aumento;

    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;

}