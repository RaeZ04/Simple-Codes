package POO.poo1;

public class FurgonetaHerencia extends coche {
    
    private int capacidad_carga;
    private int plazas_extra;

    public FurgonetaHerencia(int plazas_extra, int capacidad_carga){  // Constructor

        super();  // Llamar al constructor de la clase padre (coche)

        this.capacidad_carga = capacidad_carga;
        this.plazas_extra = plazas_extra;

    }

    public String datosFurgoneta_get(){  // Getter

        return "La capacidad de carga es " + capacidad_carga + ". Y las plazas son " + plazas_extra + ".";

    }


}
