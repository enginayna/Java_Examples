package Chapter_1_Questions;
import java.util.Scanner;

public class Soru_16_Alt�gen_Alan_Hesaplama {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Alt�genin kenar uzunlu�unu giriniz : ");
	double kenaruzunlugu = input.nextDouble();
	double formul = (Math.sqrt(27)/2)*Math.pow(kenaruzunlugu, 2);
	System.out.println("Alt�genin Alan� : " + formul);
}
}
