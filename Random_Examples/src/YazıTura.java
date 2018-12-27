import java.util.Scanner;

public class YazýTura {
public static void main(String[] args) {
	int y =1;
	int t =0;
    int sonuc =(int)(Math.random()*2);
    System.out.println("Yazý için 1, Tura için 0 giriniz : ");
    Scanner input = new Scanner(System.in);
    int girdi = input.nextInt();
    
    if(sonuc ==t) {
    	System.out.println("tura");
    	System.out.println("Kazandýnýz...");
    }
    if(sonuc==y) {
    	System.out.println("yazý");
    	System.err.println("Kaybettiniz...");
    }
}
}
