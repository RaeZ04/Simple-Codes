import java.util.ArrayList;

public class prueba {
    
    public static void main(String[] args) {
        
        ArrayList <Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(4);
        numeros.add(8);

        int miarray [] = new int [10];

        for (int i = 0; i<miarray.length; i++){
            
            if (numeros.contains(i)) {
                
                miarray[i] = 10;

            } else {

                miarray[i] = i;

            }

        }

        for (int i = 0; i<miarray.length; i++){

            System.out.println("El contenido de la posicion " + i + " es " + miarray[i]);

        }

    }

}

