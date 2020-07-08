package percabangan;
import java.util.Scanner;
public class Percabangan_IF {

    public static void main(String[] args) {
       
        int battre;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("                selamat datang                 ");
        System.out.println("silakan masikan sisa battre hp kamu dibawah ini");
        System.out.print("→ ");
        battre = scan.nextInt();
        
        if(battre <= 20){
            System.out.println("!!! WAKTUNYA CHARGER !!!");
        }
        
        System.out.println("triakasi telah datang");
        
        
        
        
    }
    
}
