import java.util.Scanner;

public class S�cak_soguk {
public static void main(String[] args) {
	int say� = (int)(Math.random()*100);
	
	Scanner input = new Scanner(System.in);
	System.out.println("0 ile 100 aras�nda bir say� giriniz.");
	int tahmin = input.nextInt();
	int tahmin1 = tahmin;
	int tahmin2 = tahmin;
		

	while(tahmin != say�) {
		
		if(tahmin>say� && tahmin1>say� && tahmin2>say�) {
			System.out.println("a�a��");
			System.out.println("0 ile "+ tahmin + " aras�nda bir say� giriniz.");
		}	
		else if(tahmin>say� && tahmin2<say�) {
			System.out.println("a�a��");
			System.out.println(tahmin2 + " ile " + tahmin + "aras�nda bir say� giriniz.");
		}
		else if(tahmin<say� && tahmin1>say�){
			System.out.println("yukar�");
			System.out.println(tahmin+" ile "+ tahmin1 + " aras�nda bir say� giriniz");
		}
		else if(tahmin<say� && tahmin2<say� && tahmin1<say�) {
			System.out.println("yukar�");
			System.out.println(tahmin + " ile " + " 100 aras�nda bir say� giriniz");
		}
		if(tahmin>say�) {
			tahmin1 = tahmin;
		}
		if(tahmin<say�) {
			tahmin2 = tahmin;
		}
		tahmin = input.nextInt();
	
	}
	System.out.println("Bildiniz");
}
}
