package Chapter_3_Questions;
import java.util.Scanner;

public class Swich_Examples {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Bir g�n giriniz : (L�tfen T�rk�e karakter girmeyiniz) ");
	String g�n =input.nextLine();
	switch (g�n) {
	case "pazartesi" :
	case "sal�" :
	case "carsamba" :
	case "persembe" :
	case "cuma" :
		System.out.println("Hafta i�i");
		break;
	case "cumartesi" :
	case "pazar" :
		System.out.println("Hafta Sonu");
		break;
		default:
		System.out.println("Yanl�� giri� yapt�n�z!");
		break;
	}
	System.out.println("Do�ru cevap verdim mi : ");
	String answer = input.next();
	switch (answer.charAt(0)) {
	case  'E':
	case  'e':
	System.out.println("Ne sand�n yappram");
		break;
	case  'H':
	case  'h':
	System.out.println("Vay amk neyse hatas�z kul olmaz");
		break;
	default:
		System.out.println("Anlamad�m!");
	
	}
	
}
}
