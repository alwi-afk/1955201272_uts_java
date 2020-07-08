package percabangan;

import javax.swing.JOptionPane;


public class Percabangan_SWITCH_CASE {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "TES KEPRIBADIAN ");
       String nama = JOptionPane.showInputDialog( "Masukan Nama Anda");
       JOptionPane.showMessageDialog(null,"HELLO, "+nama);
       JOptionPane.showMessageDialog(null,"MASUKAN 1 Tipe Musik Dibawah Ini ");
       String musik = JOptionPane.showInputDialog( " POP | ROCK | KLASIK ");
       
       
       switch(musik){
           case"POP":
               JOptionPane.showMessageDialog(null," Mau Tau Hasilnya ");
               JOptionPane.showMessageDialog(null, " Ternyata Kamu : Pekerja Keras, Suka Bersosialisasi, Lembut, Dan Tahu Cara Mencintai Diri Sendiri. ");
               break;
           case "ROCK":
               JOptionPane.showMessageDialog(null," Mau Tau Hasilnya ");
               JOptionPane.showMessageDialog(null, " Ternyata Kamu : Cukup Sensitif, Kreatif dan Selow. ");
               break;
           case "KLASIK":
               JOptionPane.showMessageDialog(null," Mau Tau Hasilnya ");
               JOptionPane.showMessageDialog(null," Ternyata Kamu : Harga Diri Tinggi, Kreatif Dan Sedikit Tertutup Kepada Lingkungan sekitar. ");
               break;
           default:
               JOptionPane.showMessageDialog(null," !!! GUNAKAN HURUF BESAR DAN MASUKAN JAWABANNYA  !!! ");
       }
    }
    
}
