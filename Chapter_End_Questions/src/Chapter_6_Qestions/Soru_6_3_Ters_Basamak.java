package Chapter_6_Qestions;
import java.util.Scanner;

public class Soru_6_3_Ters_Basamak {
public static void main(String[] args) {
	basamakYazd�r();
}
public static void basamakYazd�r() {
	Scanner input = new Scanner(System.in);
	System.out.println("L�tfen bir say� giriniz : ");
	int number = input.nextInt();
	System.out.println("Say�n�n Tersten Yaz�m� : " + reverse(number) + "\n" + terscevir(number));
}
public static String reverse(int say�) {
		String sum = "";
		int uzunluk = String.valueOf(say�).length();
		//String.valueOf methodunu bilmedi�im i�in a�a��da bildiklerim ile ayn� i�lemi method olarak yazd�m.  
		for (int i = 1; i <= uzunluk; i++) {
			
			int bd = say� % 10;
			sum += "" + bd;
			say� = say�/10;
		}return sum;
	}
public static String terscevir(int say�) {
			String sum ="";
			while(say�>10){
				int bd = say� % 10;
				sum += ""+ bd;
				say� = say� /10;
				if(say�< 10) {
					sum = sum + say� ;
				}
			}
			
			return sum;
		}
}
