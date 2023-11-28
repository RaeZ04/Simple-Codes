public class calcular {

    public static void calc(){

        double area = peticion.getBase() * peticion.getAltura();
        System.out.println("El area es " + area);
        double perimetro = peticion.getBase() * 2 + peticion.getAltura() * 2;
        System.out.println("El perimetro es " + perimetro);

    }
    
}
