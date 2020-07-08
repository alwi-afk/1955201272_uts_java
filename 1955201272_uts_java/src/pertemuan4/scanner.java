package pertemuan4;
import java.util.Scanner;

public class scanner {

    public static void main(String[] args) { 
        String nama;
        String alamat;
        String hobi;
        double usia;
        int iq;
        
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        
        System.out.println("---SELAMAT DATANG DI PENDAFTARAN---");
        System.out.println(" ");
        System.out.println("    ---PENDAFTARAN APA NI YEEE---");
        System.out.println(" ");
        System.out.println("SILAKAN DI ISI YA");
        System.out.print("Nama : ");
        
        nama = keyboard.nextLine();
        
        System.out.print("Alamat : ");
        alamat = keyboard.nextLine();
        
        System.out.print("Hobi : ");
        hobi = keyboard.nextLine();
        
        System.out.print("Usia : ");
        usia = keyboard.nextDouble();
        
        System.out.print("IQ :  ");
        iq = keyboard.nextInt();
        
        //menamppilkan yg sudan di simpan di variabel
        System.out.println("----------------------------");
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Hobi : " + hobi);
        System.out.println("Usia : " + usia + " tahun");
        System.out.println("IQ : " + iq +" cie IQ cie");
    }
    
}
