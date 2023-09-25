import javax.swing.JOptionPane;

public class practicaBucles4 {

    public static void main (String[] args){

        boolean arroba = false;

        String mail = JOptionPane.showInputDialog("Introduce el correo");

        for (int i=0; i<mail.length(); i++){

            if(mail.charAt(i)=='@'){

                arroba = true;

            }
            
        }

        if(arroba==true){

            System.out.println("El correo contiene una arroba");

        }
        else{

            System.out.println("El correo no contiene una arroba");

        }

    }
    
}
