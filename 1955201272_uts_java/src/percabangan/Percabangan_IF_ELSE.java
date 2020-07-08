package percabangan;
import java.util.Scanner;

public class Percabangan_IF_ELSE {

    public static void main(String[] args) {
        
        int jam;
        Scanner scan = new Scanner(System.in);

        
        System.out.println(" selamat datang orang unik atau tidak ");
        System.out.println(" Kamu setiap hari bangun jam berapa ");
        System.out.print("masukkan jam bangun tidur kamu (1-24): ");
        jam = scan.nextInt();
        
        if (jam <= 4){
        System.out.println("|------------------------|");
        System.out.println("| kamu adalah orang unik |");
        System.out.println("|------------------------|");
        }
        else {
        System.out.println("|-------------------------|");
        System.out.println("| kamu adalah orang biasa |");
        System.out.println("|-------------------------|"); 
        }
        
        System.out.println("sehat selalu ya");
        
          
    }

}   
