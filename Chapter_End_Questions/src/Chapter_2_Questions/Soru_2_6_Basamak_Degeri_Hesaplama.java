package Chapter_2_Questions;
import java.util.Scanner;

public class Soru_2_6_Basamak_Degeri_Hesaplama {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("0 ile 1000 aras�nda bir say� giriniz : ");
	int say� = input.nextInt();
	int say�1 = say� % 10;
	int say�10 = (say� % 100)/10;
	int say�100 = say�/100;
	System.out.println("Girdi�iniz say�n�n basamaklar�n�n toplam� : " + (say�1+say�10+say�100));
}
}
