public class practicaMath {
    
    public static void main(String[] args){

        // Raiz

        double raiz = Math.sqrt(9.54);

        System.out.println(raiz);
        
        // Redondear

        long resultadoround = Math.round(raiz);

        System.out.println(resultadoround);

        // Potencia

        double base = 7;
        double exponente = 3;

        int resultadoPotencia = (int)Math.pow(base, exponente);
        System.out.println(resultadoPotencia);

    }

}
