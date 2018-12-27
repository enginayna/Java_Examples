import java.util.Scanner;

public class Sıcak_soguk {
public static void main(String[] args) {
	int sayı = (int)(Math.random()*100);
	
	Scanner input = new Scanner(System.in);
	System.out.println("0 ile 100 arasında bir sayı giriniz.");
	int tahmin = input.nextInt();
	int tahmin1 = tahmin;
	int tahmin2 = tahmin;
		

	while(tahmin != sayı) {
		
		if(tahmin>sayı && tahmin1>sayı && tahmin2>sayı) {
			System.out.println("aşağı");
			System.out.println("0 ile "+ tahmin + " arasında bir sayı giriniz.");
		}	
		else if(tahmin>sayı && tahmin2<sayı) {
			System.out.println("aşağı");
			System.out.println(tahmin2 + " ile " + tahmin + "arasında bir sayı giriniz.");
		}
		else if(tahmin<sayı && tahmin1>sayı){
			System.out.println("yukarı");
			System.out.println(tahmin+" ile "+ tahmin1 + " arasında bir sayı giriniz");
		}
		else if(tahmin<sayı && tahmin2<sayı && tahmin1<sayı) {
			System.out.println("yukarı");
			System.out.println(tahmin + " ile " + " 100 arasında bir sayı giriniz");
		}
		if(tahmin>sayı) {
			tahmin1 = tahmin;
		}
		if(tahmin<sayı) {
			tahmin2 = tahmin;
		}
		tahmin = input.nextInt();
	
	}
	System.out.println("Bildiniz");
}
}
