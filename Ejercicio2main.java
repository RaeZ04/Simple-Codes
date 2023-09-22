public class Ejercicio2main {
    
    public static void main(String[] args){

        hablarSinDevolver persona1 = new hablarSinDevolver("Pepito");
        hablarConDevolver persona2 = new hablarConDevolver("Jose");

        persona1.hablarSinDevolverFuncion();
        
        System.out.println(persona2.hablarConDevolverFuncion());

    }
}
