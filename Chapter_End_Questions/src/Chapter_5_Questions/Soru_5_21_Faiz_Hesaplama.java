package Chapter_5_Questions;
import java.util.Scanner;

public class Soru_5_21_Faiz_Hesaplama {
public static void main(String[] args) {
	double aylýk_ödeme;
	Scanner input = new Scanner(System.in);
	System.out.println("Kredi miktarýný giriniz : ");
	int kredi_miktarý = input.nextInt();
	System.out.println("Ödeme vadesini giriniz : ");
	int vade = input.nextInt();
	System.out.println("Faiz oraný\t\tAylýk ödeme\t\tToplam ödeme");
	
	for (double faiz_oraný = 5.000; faiz_oraný <= 8.000; faiz_oraný += 0.125) {
		System.out.print(faiz_oraný + "%");
		aylýk_ödeme = kredi_miktarý*(faiz_oraný/1200)/(1-1/Math.pow(1+(faiz_oraný/1200), vade*12));
		System.out.printf("\t\t\t%5.2f" , aylýk_ödeme);
		System.out.printf("\t\t\t%5.2f" , aylýk_ödeme*(vade*12));
		System.out.println();
	}

				
	
	
}
}
