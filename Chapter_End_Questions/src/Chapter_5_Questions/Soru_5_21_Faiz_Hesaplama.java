package Chapter_5_Questions;
import java.util.Scanner;

public class Soru_5_21_Faiz_Hesaplama {
public static void main(String[] args) {
	double ayl�k_�deme;
	Scanner input = new Scanner(System.in);
	System.out.println("Kredi miktar�n� giriniz : ");
	int kredi_miktar� = input.nextInt();
	System.out.println("�deme vadesini giriniz : ");
	int vade = input.nextInt();
	System.out.println("Faiz oran�\t\tAyl�k �deme\t\tToplam �deme");
	
	for (double faiz_oran� = 5.000; faiz_oran� <= 8.000; faiz_oran� += 0.125) {
		System.out.print(faiz_oran� + "%");
		ayl�k_�deme = kredi_miktar�*(faiz_oran�/1200)/(1-1/Math.pow(1+(faiz_oran�/1200), vade*12));
		System.out.printf("\t\t\t%5.2f" , ayl�k_�deme);
		System.out.printf("\t\t\t%5.2f" , ayl�k_�deme*(vade*12));
		System.out.println();
	}

				
	
	
}
}
