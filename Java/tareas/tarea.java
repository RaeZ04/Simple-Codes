class tarea {
    private String descripcion;
    private boolean completada;
    private int prioridad;

    public tarea (String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.completada = false;
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean getCompletada() {
        return completada;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void marcarComoCompletada() {
        completada = true;
    }
}