import javax.swing.JOptionPane;

public class practicaBucles5 {

        public static void main (String[] args){

        int arroba = 0;
        boolean punto = false;

        String mail = JOptionPane.showInputDialog("Introduce el correo");

        for (int i=0; i<mail.length(); i++){

            if(mail.charAt(i)=='@'){

                arroba++;

            }

            if(mail.charAt(i)=='.'){

                punto = true;

            }
            
        }

        if(arroba==1 && punto==true){

            System.out.println("El correo es correcto");

        }
        else{

            System.out.println("El correo es incorrecto");

        }

    }
    
}
