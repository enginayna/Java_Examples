package method_Examples;

import java.util.Scanner;

public class Random_Character {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Yılı giriniz : ");
	int yıl = input.nextInt();
	
	System.out.print("Ay'ı sayı ile giriniz : ");
	int ay = input.nextInt();
	
	ayıYazdır(yıl , ay);
}

private static void ayıYazdır(int yıl , int ay){
	
	ayınBaslıgınıYazdır(yıl , ay);
	
	ayınGunleriniYazdır(yıl , ay);
	}


private static void ayınBaslıgınıYazdır(int yıl , int ay){
	System.out.println("           " + ayınAdınıAl(ay) + " " + yıl );
	System.out.println("------------------------------------------");
	System.out.println(" Pzt Sal Car Per Cum Cts Pzr");
	
	}
private static String ayınAdınıAl(int ay) {
	String ayAdı = "";
switch (ay){
	case 1: ayAdı = "Ocak"; break;
	case 2: ayAdı = "Şubat"; break; 
	case 3: ayAdı ="Mart"; break; 
	case 4: ayAdı ="Nisan"; break; 
	case 5: ayAdı ="Mayıs"; break; 
	case 6: ayAdı ="Haziran"; break; 
	case 7: ayAdı ="Temmuz"; break; 
	case 8: ayAdı ="Ağustos"; break; 
	case 9: ayAdı ="Eylül"; break; 
	case 10: ayAdı ="Ekim"; break; 
	case 11: ayAdı ="Kasım"; break; 
	case 12: ayAdı ="Aralık"; 
	}
	return ayAdı;
}

private static void ayınGunleriniYazdır(int yıl, int ay) {
	int baslangıcGunu = baslangıcGununuAl(yıl, ay);
	
	int ayınGunlerınınSayısı = ayınGunlerınınSayısınıAl(yıl, ay);
	
	int i = 0;
	for (i = 0; i < baslangıcGunu; i++) {
	System.out.print("    ");
	  }
	  for (i = 1; i <= ayınGunlerınınSayısı; i++) {
		  System.out.printf("%4d", i);
	 
	  if ((i + baslangıcGunu) % 7 == 0)
		  System.out.println();
	  }
	 
	  System.out.println();
	  }

private static int baslangıcGununuAl(int yıl, int ay) {
	final int START_DAY_FOR_JAN_1_1800 = 2;
	int toplamGunSayısı = toplamGunSayısınıAl(yıl, ay);
	return (toplamGunSayısı + START_DAY_FOR_JAN_1_1800) % 7;
}
private static int toplamGunSayısınıAl(int yıl, int ay) {
	int toplam = 0;
	for (int i = 1800; i < yıl; i++)
		 if (artıkYılMı(i))
		 toplam = toplam + 366;
		 else
		 toplam = toplam + 365;
	
	for (int i = 1; i < ay; i++)
		toplam= toplam + ayınGunlerınınSayısınıAl(yıl, i);

	return toplam;
}

private static int ayınGunlerınınSayısınıAl(int yıl, int ay) {
		if (ay == 1 || ay == 3 || ay == 5 || ay == 7 ||
		ay == 8 || ay == 10 || ay == 12)
		 return 31;
		
		 if (ay == 4 || ay == 6 || ay == 9 || ay == 11)
		 return 30;
		
		 if (ay == 2) return artıkYılMı(yıl) ? 29 : 28;
	return 0;
}

private static boolean artıkYılMı(int yıl) {
	return yıl % 400 == 0 || (yıl % 4 == 0 && yıl % 100 != 0);
	
}




}
