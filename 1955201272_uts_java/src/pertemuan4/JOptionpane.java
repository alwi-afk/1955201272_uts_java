package pertemuan4;
import javax.swing.JOptionPane;

public class JOptionpane {

    public static void main(String[] args) {
        
        String nama = JOptionPane.showInputDialog("Nama: ");
        JOptionPane.showMessageDialog(null,"Salam kenal dari saya"+ nama);
        String usia = JOptionPane.showInputDialog("Umur: ");
        String status = JOptionPane.showInputDialog("Status : ");
        String tb = JOptionPane.showInputDialog("Tinggi Badan: ");
        String bb = JOptionPane.showInputDialog("Berat Badan: ");
        
        
        System.out.println("Nama Anda Adalah " + nama);
        System.out.println("Umur Anda " + usia + " Tahun");
        System.out.println("Status " + status +" cie");
        System.out.println("Tinggi Bandan Anda " + tb);
        System.out.println("Berat Badan Anda " + bb );
        
    }
}
