package percabangan;

import javax.swing.JOptionPane;


public class Percabangan_IF_ELSE_IF {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Selamat Datang Di Ramalan Nomer HP");
        int nomer = Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah Nomer HP Kamu "));
        
        if (nomer >= 10-13 ){
            System.out.println(" Selamat Kamu Adalah Orang Pilihan ");
            JOptionPane.showMessageDialog(null, " Selamat Kamu Adalah Orang Pilihan ");  
        }else if ( nomer < 10){
            System.out.println(" Kamu Adalah Orang GILA ");
            JOptionPane.showMessageDialog(null, " Kamu Adalah Orang GILA ");
        }else if ( nomer > 14){
            System.out.println(" Kamu Adalah Orang GILA ");
            JOptionPane.showMessageDialog(null, " Kamu Adalah Orang GILA ");
        }
        JOptionPane.showMessageDialog(null," Trimakasi Telah Berkunjung :p ");
        String aku = JOptionPane.showInputDialog(" BERIKAN SAYA KRITIKAN ");
        JOptionPane.showMessageDialog(null, aku);
    }
    
}
