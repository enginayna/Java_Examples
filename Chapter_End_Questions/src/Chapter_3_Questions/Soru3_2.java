package Chapter_3_Questions;
import java.util.Scanner;

public class Soru3_2 {
public static void main(String[] args) {
	int sayý1 = (int)(Math.random()*25);
	int sayý2 = (int)(Math.random()*25);
	int sayý3 = (int)(Math.random()*25);
	Scanner input = new Scanner(System.in);
	System.out.println("Toplama iþleminin sonucu nedir?");
	System.out.println( + sayý1 + "+" + sayý2 + "+" + sayý3 + "=");
	int sonuc = input.nextInt();
	if(sayý1+sayý2+sayý3 == sonuc) {
		System.out.println("Doðru cevap");
	}
	else {
		System.out.println("3 sayýyý toplamayý beceremedin amk.");
	}
	
}
}
