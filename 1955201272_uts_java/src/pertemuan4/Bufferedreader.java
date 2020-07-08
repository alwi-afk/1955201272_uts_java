package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bufferedreader {
    public static void main(String[] args) throws IOException {
        String nama ;
        String umur ;
        String hobi ;
        int one, two, jumlah = 0;
        
        
        // membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input =
        new BufferedReader(new InputStreamReader(System.in));
    
        // membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);
        BufferedReader sr = new BufferedReader(isr);

    
        // mengisi variabel dengan bufferreader
        System.out.println("Isi dengan benar");
        System.out.print("Nama: ");
        nama = br.readLine();
        
        System.out.print("Usia: ");
        umur = br.readLine();
        
        System.out.print("Hobi: ");
        hobi = sr.readLine();
        
        System.out.println("masukkan angka kesukan anda nanti akan di jumlahkan");
        System.out.print("masukan angka yg pertama: ");
        one = Integer.parseInt(input.readLine());
        System.out.print("masukkan angka yg ke dua: ");
        two = Integer.parseInt(input.readLine());
        jumlah = one+two;
        
        
        // tampilkn output isi variabel
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("Namamu adalah " + nama);
        System.out.println("Usiamu ternyata " + umur + " Tahun");
        System.out.println("Hobimu ternyata " + hobi);
        System.out.println("Jumlahnya: "+jumlah + " cie bener cie");

    }
    
}
