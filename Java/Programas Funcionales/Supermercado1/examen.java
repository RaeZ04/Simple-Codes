import java.util.*;

public class examen{

    public static void main (String [] args){

        persona Jaime = new persona("Jaime", 10);
        persona Lucas = new persona("Lucas", 19);
        persona Mario = new persona("Mario", 21);
        persona Izan = new persona("Izan", 19);
        persona Adriel = new persona("Adriel", 19);
        persona Jose = new persona("Jose", 16);
        persona Miguel = new persona("Miguel", 11);
        persona Raul = new persona("Raul", 12);
        persona Sara = new persona("Sara", 21);
        persona Pablo = new persona("Pablo", 10);

        bebida Cerveza = new bebida("Cerveza", "Heineiken", true);
        bebida VinoTinto = new bebida("Vino Tinto", "Estribillo", true);
        bebida Sangria = new bebida("Sangria", "Biomio Blanca", true);
        bebida TintoVerano = new bebida("Tinto Verano", "Maxima", true);
        bebida Vodka = new bebida("Vodka", "Absolut", true);
        bebida ZumoNaranja = new bebida("Zumo Naranja", "Zumo ESP", false);
        bebida Champin = new bebida("Champin", "Cruzada", false);
        bebida Leche = new bebida("Leche", "Asturiana", false);
        bebida CocaCola = new bebida("Coca-Cola", "Coca-Cola", false);
        bebida Fanta = new bebida("Fanta", "Fanta", false);

        // PERSONA 1

        System.out.println("\n --------------------------------");
        System.out.println(Jaime.getNombre() + " ha llevado a caja " + Sangria.getNombre() + ", " + Fanta.getNombre() + ", " + Leche.getNombre() + " y " + CocaCola.getNombre());

        if (Jaime.getEdad() < 18){

            if (Sangria.isAlcohol() == true){

                System.out.println("No se ha podido llevar " + Sangria.getNombre() + " porque lleva alcohol y es menor de edad");


            }
            if (Fanta.isAlcohol() == true){

                System.out.println("No se ha podido llevar " + Fanta.getNombre() + " porque lleva alcohol y es menor de edad");

            }
            if (Leche.isAlcohol() == true){

                System.out.println("No se ha podido llevar " + Leche.getNombre() + " porque lleva alcohol y es menor de edad");

            }
            if (CocaCola.isAlcohol() == true){

                System.out.println("No se ha podido llevar " + CocaCola.getNombre() + " porque lleva alcohol y es menor de edad");

            }

            System.out.print("Se ha podido llevar a casa: | " );

            if (Sangria.isAlcohol() == false){

                System.out.print(Sangria.getNombre() + " | ");

            }

            if (Fanta.isAlcohol() == false){

                System.out.print(Fanta.getNombre() + " | ");

            }

            if (Leche.isAlcohol() == false){

                System.out.print(Leche.getNombre() + " | ");

            }

            if (CocaCola.isAlcohol() == false){

                System.out.print(CocaCola.getNombre() + " | ");

            }

        }

        // PERSONA 2

        System.out.println("\n --------------------------------");
        System.out.println(Adriel.getNombre() + " ha llevado a caja " + VinoTinto.getNombre() + ", " + TintoVerano.getNombre() + ", " + ZumoNaranja.getNombre() + " y " + Leche.getNombre());
        

        if (Adriel.getEdad() < 18){

            if (VinoTinto.isAlcohol() == true){

                System.out.println("No se ha podido llevar " + VinoTinto.getNombre() + " porque lleva alcohol y es menor de edad");


            }
            if (TintoVerano.isAlcohol() == true){

                System.out.println("No se ha podido llevar " + TintoVerano.getNombre() + " porque lleva alcohol y es menor de edad");

            }
            if (ZumoNaranja.isAlcohol() == true){

                System.out.println("No se ha podido llevar " + ZumoNaranja.getNombre() + " porque lleva alcohol y es menor de edad");

            }
            if (Leche.isAlcohol() == true){

                System.out.println("No se ha podido llevar " + Leche.getNombre() + " porque lleva alcohol y es menor de edad");

            }

            System.out.print("Se ha podido llevar a casa: | " );

            if (VinoTinto.isAlcohol() == false){

                System.out.print(VinoTinto.getNombre() + " | ");

            }

            if (TintoVerano.isAlcohol() == false){

                System.out.print(TintoVerano.getNombre() + " | ");

            }

            if (ZumoNaranja.isAlcohol() == false){

                System.out.print(ZumoNaranja.getNombre() + " | ");

            }

            if (Leche.isAlcohol() == false){

                System.out.print(Leche.getNombre() + " | ");

            }

        }

        if (Adriel.getEdad() >= 18){

            System.out.println("Se ha llevado a casa " + VinoTinto.getNombre() + ", " + TintoVerano.getNombre() + ", " + ZumoNaranja.getNombre() + " y " + Leche.getNombre());

        }

        // PERSONA 3

        System.out.println("\n --------------------------------");
        System.out.println(Sara.getNombre() + " ha llevado a caja " + Sangria.getNombre() + ", " + Vodka.getNombre() + ", " + Champin.getNombre() + " y " + CocaCola.getNombre());
        

        if (Sara.getEdad() < 18){

            if (Sangria.isAlcohol() == true){

                System.out.println("No se ha podido llevar " + Sangria.getNombre() + " porque lleva alcohol y es menor de edad");


            }
            if (Vodka.isAlcohol() == true){

                System.out.println("No se ha podido llevar " + Vodka.getNombre() + " porque lleva alcohol y es menor de edad");

            }
            if (Champin.isAlcohol() == true){

                System.out.println("No se ha podido llevar " + Champin.getNombre() + " porque lleva alcohol y es menor de edad");

            }
            if (CocaCola.isAlcohol() == true){

                System.out.println("No se ha podido llevar " + CocaCola.getNombre() + " porque lleva alcohol y es menor de edad");

            }

            System.out.print("Se ha podido llevar a casa: | " );

            if (Sangria.isAlcohol() == false){

                System.out.print(Sangria.getNombre() + " | ");

            }

            if (Vodka.isAlcohol() == false){

                System.out.print(Vodka.getNombre() + " | ");

            }

            if (Champin.isAlcohol() == false){

                System.out.print(Champin.getNombre() + " | ");

            }

            if (CocaCola.isAlcohol() == false){

                System.out.print(CocaCola.getNombre() + " | ");

            }

        }

        if (Sara.getEdad() >= 18){

            System.out.println("Se ha llevado a casa " + Sangria.getNombre() + ", " + Vodka.getNombre() + ", " + Champin.getNombre() + " y " + CocaCola.getNombre());

        }

        // PERSONA 4

        System.out.println("\n --------------------------------");
        System.out.println(Miguel.getNombre() + " ha llevado a caja " + Cerveza.getNombre() + ", " + VinoTinto.getNombre() + ", " + Sangria.getNombre() + " y " + ZumoNaranja.getNombre());
        

        if (Miguel.getEdad() < 18){

            if (Cerveza.isAlcohol() == true){

                System.out.println("No se ha podido llevar " + Cerveza.getNombre() + " porque lleva alcohol y es menor de edad");


            }
            if (VinoTinto.isAlcohol() == true){

                System.out.println("No se ha podido llevar " + VinoTinto.getNombre() + " porque lleva alcohol y es menor de edad");

            }
            if (Sangria.isAlcohol() == true){

                System.out.println("No se ha podido llevar " + Sangria.getNombre() + " porque lleva alcohol y es menor de edad");

            }
            if (ZumoNaranja.isAlcohol() == true){

                System.out.println("No se ha podido llevar " + ZumoNaranja.getNombre() + " porque lleva alcohol y es menor de edad");

            }

            System.out.print("Se ha podido llevar a casa: | " );

            if (Cerveza.isAlcohol() == false){

                System.out.print(Cerveza.getNombre() + " | ");

            }

            if (VinoTinto.isAlcohol() == false){

                System.out.print(VinoTinto.getNombre() + " | ");

            }

            if (Sangria.isAlcohol() == false){

                System.out.print(Sangria.getNombre() + " | ");

            }

            if (ZumoNaranja.isAlcohol() == false){

                System.out.print(ZumoNaranja.getNombre() + " | ");

            }

        }

        if (Miguel.getEdad() >= 18){

            System.out.println("Se ha llevado a casa " + Cerveza.getNombre() + ", " + VinoTinto.getNombre() + ", " + Sangria.getNombre() + " y " + ZumoNaranja.getNombre());

        }

    }
}