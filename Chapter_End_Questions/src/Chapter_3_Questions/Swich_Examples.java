package Chapter_3_Questions;
import java.util.Scanner;

public class Swich_Examples {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Bir gün giriniz : (Lütfen Türkçe karakter girmeyiniz) ");
	String gün =input.nextLine();
	switch (gün) {
	case "pazartesi" :
	case "salý" :
	case "carsamba" :
	case "persembe" :
	case "cuma" :
		System.out.println("Hafta içi");
		break;
	case "cumartesi" :
	case "pazar" :
		System.out.println("Hafta Sonu");
		break;
		default:
		System.out.println("Yanlýþ giriþ yaptýnýz!");
		break;
	}
	System.out.println("Doðru cevap verdim mi : ");
	String answer = input.next();
	switch (answer.charAt(0)) {
	case  'E':
	case  'e':
	System.out.println("Ne sandýn yappram");
		break;
	case  'H':
	case  'h':
	System.out.println("Vay amk neyse hatasýz kul olmaz");
		break;
	default:
		System.out.println("Anlamadým!");
	
	}
	
}
}
