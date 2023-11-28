import java.util.Timer;
import java.util.TimerTask;

public class contador {
    public static void main(String[] args) {
        int segundos = 10; // Cambia este valor al tiempo que desees
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            int contador = segundos;

            public void run() {
                if (contador >= 0) {
                    System.out.println("Segundos restantes: " + contador);
                    contador--;
                } else {
                    System.out.println("¡Tiempo terminado!");
                    timer.cancel(); // Detener el temporizador
                }
            }
        }, 0, 1000); // Ejecutar cada 1000ms (1 segundo)
    }
}
