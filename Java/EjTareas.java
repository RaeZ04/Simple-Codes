import java.util.*;

public class index {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> listaTareas = new ArrayList<String>();
        ArrayList<String> listaTareasCompletado = new ArrayList<String>();

        

        String nombre;
        String descripcion;
        boolean status;

        // String nombre = input.next();
        // String descripcion = input.next();
        // boolean status = input.nextBoolean();

        boolean loop = true;

        while (loop = true) {

            System.out.println("Elija una opcion: ");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Marcar como completada");
            System.out.println("4. Mostrar tareas");
            System.out.println("5. Salir");
            System.out.println("");

            int eleccion = input.nextInt();

            if (eleccion == 1) {

                System.out.print("Ingrese el nombre de la tarea: ");
                nombre = input.next();
                listaTareas.add(nombre);
                listaTareasCompletado.add(nombre);
                System.out.println("");

                System.out.print("Ingrese la descripción de la tarea: ");
                descripcion = input.next();
                System.out.println("");

                status = false;

                String nombreMostrar = nombre;

            } else if (eleccion == 2) {

                System.out.println(listaTareas);
                int eliminar = input.nextInt();
                System.out.print("Elige la tarea a eliminar : ");
                listaTareas.remove(eliminar - 1);
                System.out.println("");

            }

            else if (eleccion == 3) {

                

                System.out.println("Las tareas sin completar son: " + listaTareasCompletado);
                System.out.println("");

                System.out.print("Marca la que quieras completar: ");
                System.out.println("");
                int eliminarTarea = input.nextInt();

                listaTareasCompletado.remove(eliminarTarea - 1);

                System.out.println("Las tareas restantes sin completar son: " + listaTareasCompletado);
                System.out.println("");

            }

            else if (eleccion == 4) {

                System.out.println(listaTareas);
                System.out.println("");

            }

            else if (eleccion == 5) {

                loop = false;

            }

        }

        // tareas tarea = new tareas(nombre, descripcion, status);

    }

}
