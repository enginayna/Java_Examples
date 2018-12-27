package Chapter_6_Qestions;
import java.util.Scanner;

public class Soru_6_3_Ters_Basamak {
public static void main(String[] args) {
	basamakYazdýr();
}
public static void basamakYazdýr() {
	Scanner input = new Scanner(System.in);
	System.out.println("Lütfen bir sayý giriniz : ");
	int number = input.nextInt();
	System.out.println("Sayýnýn Tersten Yazýmý : " + reverse(number) + "\n" + terscevir(number));
}
public static String reverse(int sayý) {
		String sum = "";
		int uzunluk = String.valueOf(sayý).length();
		//String.valueOf methodunu bilmediðim için aþaðýda bildiklerim ile ayný iþlemi method olarak yazdým.  
		for (int i = 1; i <= uzunluk; i++) {
			
			int bd = sayý % 10;
			sum += "" + bd;
			sayý = sayý/10;
		}return sum;
	}
public static String terscevir(int sayý) {
			String sum ="";
			while(sayý>10){
				int bd = sayý % 10;
				sum += ""+ bd;
				sayý = sayý /10;
				if(sayý< 10) {
					sum = sum + sayý ;
				}
			}
			
			return sum;
		}
}
