import java.util.*;

public class examen {

    public static void main(String[] args) {

        listacontactos miLista = new listacontactos();

        boolean bucle = true;

        while (bucle == true) {

            try {

                System.out.println("---------------");
                System.out.println("    Agenda");
                System.out.println("---------------");
                System.out.println("");
                System.out.println("1. Agregar contacto");
                System.out.println("2. Mostrar contactos");
                System.out.println("3. Salir del programa");
                System.out.print("   Ingrese la opción (1-3): ");

                Scanner input = new Scanner(System.in);
                int eleccion = input.nextInt();

                System.out.println("");

                if (eleccion == 1) {

                    System.out.print("Nombre contacto: ");
                    String nombre = input.next();

                    boolean tfncorrecto = false;
                    String telefono = "";

                    while (tfncorrecto == false) {

                        System.out.print("Teléfono: ");
                        telefono = input.next();

                        if (telefono.length() != 9) {

                            System.out.println("El telefono no es correcto. (Debe contener 9 numeros)");

                        } else {

                            tfncorrecto = true;

                        }

                    }

                    int telefonoNum = Integer.parseInt(telefono);

                    int arroba = 0;
                    int punto = 0;
                    String mail = "";

                    boolean mailcorrecto = false;

                    while (mailcorrecto == false) {

                        System.out.print("Dirección de correo: ");
                        mail = input.next();

                        for (int i = 0; i < mail.length(); i++) {

                            if (mail.contains("@")) {

                                arroba = 1;

                            }

                            if (mail.contains(".")) {

                                punto++;

                            }
                        }

                        if (arroba != 1) {

                            System.out.println(
                                    "Has introducido un mail incorrecto, prueba que tenga las arrobas y puntos bien.");

                        }

                        else if (punto == 0) {

                            System.out.println(
                                    "Has introducido un mail incorrecto, prueba que tenga las arrobas y puntos bien.");

                        }
                        else if (mail.length()<5){

                            System.out.println("El mail es demasiado corto.");
                                
                        }
                        else{

                            mailcorrecto = true;

                        }

                    }

                    agenda nuevoContacto = new agenda(nombre, telefonoNum, mail);
                    miLista.agregarContacto(nuevoContacto);

                } else if (eleccion == 2) {

                    System.out.println("Lista de contactos: ");
                    miLista.mostrarContacto();

                } else if (eleccion == 3) {

                    System.out.println("Has salido del programa");
                    System.exit(0);

                } else {

                    System.out.println("Has introducido una opcion incorrecta");

                }

            } catch (Exception e) {

                System.out.println("");
                System.out.println("Has introducido un valor incorrecto.");

            }

        }

    }

}
