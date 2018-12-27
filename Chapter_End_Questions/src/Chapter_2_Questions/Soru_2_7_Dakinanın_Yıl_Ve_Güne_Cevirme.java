package Chapter_2_Questions;
import java.util.Scanner;

public class Soru_2_7_Dakinanýn_Yýl_Ve_Güne_Cevirme {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Yýl ve güne çevirmek istediðiniz dakikayý giriniz : ");
	int dakika = input.nextInt();
	int yýl = 60*24*365;
	int gun = 60*24;
	System.out.println("Sonuç : " + (dakika/yýl) + " yýl " + ((dakika % yýl)/gun)+ " gün eder");
}
}
