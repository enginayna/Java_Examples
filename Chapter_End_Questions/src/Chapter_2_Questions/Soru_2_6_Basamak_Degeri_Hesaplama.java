package Chapter_2_Questions;
import java.util.Scanner;

public class Soru_2_6_Basamak_Degeri_Hesaplama {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("0 ile 1000 arasýnda bir sayý giriniz : ");
	int sayý = input.nextInt();
	int sayý1 = sayý % 10;
	int sayý10 = (sayý % 100)/10;
	int sayý100 = sayý/100;
	System.out.println("Girdiðiniz sayýnýn basamaklarýnýn toplamý : " + (sayý1+sayý10+sayý100));
}
}
