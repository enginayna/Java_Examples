package Chapter_3_Questions;
import java.util.Scanner;

public class Soru3_2 {
public static void main(String[] args) {
	int say�1 = (int)(Math.random()*25);
	int say�2 = (int)(Math.random()*25);
	int say�3 = (int)(Math.random()*25);
	Scanner input = new Scanner(System.in);
	System.out.println("Toplama i�leminin sonucu nedir?");
	System.out.println( + say�1 + "+" + say�2 + "+" + say�3 + "=");
	int sonuc = input.nextInt();
	if(say�1+say�2+say�3 == sonuc) {
		System.out.println("Do�ru cevap");
	}
	else {
		System.out.println("3 say�y� toplamay� beceremedin amk.");
	}
	
}
}
