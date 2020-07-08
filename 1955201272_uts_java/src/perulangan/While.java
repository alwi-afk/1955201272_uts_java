package perulangan;

import javax.swing.JOptionPane;

public class While {


    public static void main(String[] args) {
        boolean running = true;
        int counter = -1;
        String jawab;
        

        while( running ) {
            JOptionPane.showMessageDialog(null,"ANDA MAU  MEROKOK ? ");
            jawab = JOptionPane.showInputDialog(null, "Jawab [ya/tidak]");

            // cek jawabnnya, kalau ya maka berhenti mengulang
            if( jawab.equalsIgnoreCase("tidak") ){
                running = false;
            }

            counter++;
        }

        System.out.println("Mengurang nyawa kamu sebanyak " + counter + " kali");

    }
}