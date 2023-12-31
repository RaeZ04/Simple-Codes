import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

public class miniJuegoCalculos {

    public static void main(String[] args) {

        int aciertosRestantes = 10;

        int vida = 100;

        String SiNo = JOptionPane.showInputDialog("¿Quieres empezar a jugar? (Elije entre S/N)");

        if (SiNo.equalsIgnoreCase("S")) {

            System.out.println("Empiezas con 100 de vida, buena suerte.");

            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                int tiempoRestante = 60;

                public void run() {
                    if (tiempoRestante > 0) {
                        System.out.println("Tiempo restante: " + tiempoRestante + " segundos");
                        tiempoRestante--;
                    } else {
                        System.out.println("¡Se te ha acabado el tiempo!");
                        timer.cancel(); // Detener el contador de tiempo
                        System.exit(0); // Terminar el programa
                    }
                }
            }, 0, 1000); // Ejecutar cada 1000ms (1 segundo)

            while (aciertosRestantes > 0) {

                int random1 = (int) (Math.random() * 100);
                int random2 = (int) (Math.random() * 100);
                int random3 = (int) ((Math.random() * 20) + 1);

                int resultado = random1 + random2;

                int pregunta = Integer.parseInt(JOptionPane.showInputDialog("Cuánto es " + random1 + "+" + random2));

                if (pregunta == resultado) {

                    aciertosRestantes--;

                    if (aciertosRestantes != 0) {

                        System.out.println("Has acertado, te quedan " + aciertosRestantes + " intentos.");

                    }

                    else if (aciertosRestantes == 0) {

                        System.out.println("¡ENHORABUENA, has ganado!!!");

                    }

                }

                else {

                    vida = vida - random3;

                    if (vida > 0) {

                        System.out.println("Has fallado, te queda " + vida + " de vida.");

                    }

                }

                if (vida <= 0) {

                    System.out.println("Tu vida ha llegado a 0, has perdido.");
                    break;

                }

            }

        }

        else if (SiNo.equalsIgnoreCase("n")) {

            System.out.println("Has decidio no jugar :(");

        }

        else {

            System.out.println("La opción que has elegido no es valida, tienes que ingresar una 'S' o una 'N'.");

        }

    }

}
