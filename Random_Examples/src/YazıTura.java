import java.util.Scanner;

public class Yaz�Tura {
public static void main(String[] args) {
	int y =1;
	int t =0;
    int sonuc =(int)(Math.random()*2);
    System.out.println("Yaz� i�in 1, Tura i�in 0 giriniz : ");
    Scanner input = new Scanner(System.in);
    int girdi = input.nextInt();
    
    if(sonuc ==t) {
    	System.out.println("tura");
    	System.out.println("Kazand�n�z...");
    }
    if(sonuc==y) {
    	System.out.println("yaz�");
    	System.err.println("Kaybettiniz...");
    }
}
}
