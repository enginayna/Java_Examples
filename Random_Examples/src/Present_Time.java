import java.util.Scanner;

public class Present_Time {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Gmt'ye göre hangi zaman diliminde oldugunuzu"
			+ "giriniz:");
	int gmt = input.nextInt();
	long toplam_mini_saniye =System.currentTimeMillis();
	long toplam_saniye = toplam_mini_saniye/1000;
	long toplam_dakika = toplam_saniye/60;
	long toplam_saat = toplam_dakika/60;
	long suanki_saniye = toplam_saniye % 60;
	long suanki_dakika = toplam_dakika % 60;
	long suanki_saat = toplam_saat % 24;
	System.out.println("þuanki saat :"+(suanki_saat+(gmt))+":"+suanki_dakika+":"+suanki_saniye+" GMT");
	
}
	
}
