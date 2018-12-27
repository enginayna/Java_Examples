package Chapter_2_Questions;
import java.util.Scanner;

public class Soru_2_8_Saati_Bulma {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Bulundugunuz saat Dilimini GMT olarak giriniz : ");
	int gmt = input.nextInt();
	long toplammilisaniye = System.currentTimeMillis();
	long toplamsaniye = toplammilisaniye/1000;
	long toplamdakika = toplamsaniye/60;
	int toplamsaat = (int)toplamdakika/60;
	int saniye =(int)toplamsaniye % 60;
	int dakika =(int)toplamdakika % 60;
	int saat = (toplamsaat+gmt) % 24;
	System.out.println("Þuan ki saat : " +(saat)+":"+(dakika)+":"+(saniye));
	
}
}
