import java.util.ArrayList;

public class ejprueba {
    
    public static void main(String[] args) {
        
        ArrayList <Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(4);
        numeros.add(8);

        int miarray [] = new int [10];

        for (int i = 0; i<=miarray.length; i++){

            boolean contiene = miarray.equals(numeros);

            if (contiene) {
                
                miarray[i] = i;

            }else{

                miarray[i] = 10;

            }

        }

    }

}
