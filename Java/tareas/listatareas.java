import java.util.ArrayList;

public class listatareas {
    private ArrayList<tarea> tareas;

    public listatareas() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(tarea tarea) {
        tareas.add(tarea);
    }

    public void marcarTareaCompletada(int indice){
        indice = indice -1;

        if (indice >= 0 && indice < tareas.size()) {
            tareas.get(indice).marcarComoCompletada();
        }
    }

    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.remove(indice);
        }
    }

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas en la lista.");
        } else {
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println("Tarea " + Integer.toString(i) + ": " + tareas.get(i).getDescripcion() + ". Completada: " + tareas.get(i).getCompletada());
                System.out.println("\n");
            }
        }
    }
}