package method_Examples;

import java.util.Scanner;

public class Random_Character {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Y�l� giriniz : ");
	int y�l = input.nextInt();
	
	System.out.print("Ay'� say� ile giriniz : ");
	int ay = input.nextInt();
	
	ay�Yazd�r(y�l , ay);
}

private static void ay�Yazd�r(int y�l , int ay){
	
	ay�nBasl�g�n�Yazd�r(y�l , ay);
	
	ay�nGunleriniYazd�r(y�l , ay);
	}


private static void ay�nBasl�g�n�Yazd�r(int y�l , int ay){
	System.out.println("           " + ay�nAd�n�Al(ay) + " " + y�l );
	System.out.println("------------------------------------------");
	System.out.println(" Pzt Sal Car Per Cum Cts Pzr");
	
	}
private static String ay�nAd�n�Al(int ay) {
	String ayAd� = "";
switch (ay){
	case 1: ayAd� = "Ocak"; break;
	case 2: ayAd� = "�ubat"; break; 
	case 3: ayAd� ="Mart"; break; 
	case 4: ayAd� ="Nisan"; break; 
	case 5: ayAd� ="May�s"; break; 
	case 6: ayAd� ="Haziran"; break; 
	case 7: ayAd� ="Temmuz"; break; 
	case 8: ayAd� ="A�ustos"; break; 
	case 9: ayAd� ="Eyl�l"; break; 
	case 10: ayAd� ="Ekim"; break; 
	case 11: ayAd� ="Kas�m"; break; 
	case 12: ayAd� ="Aral�k"; 
	}
	return ayAd�;
}

private static void ay�nGunleriniYazd�r(int y�l, int ay) {
	int baslang�cGunu = baslang�cGununuAl(y�l, ay);
	
	int ay�nGunler�n�nSay�s� = ay�nGunler�n�nSay�s�n�Al(y�l, ay);
	
	int i = 0;
	for (i = 0; i < baslang�cGunu; i++) {
	System.out.print("    ");
	  }
	  for (i = 1; i <= ay�nGunler�n�nSay�s�; i++) {
		  System.out.printf("%4d", i);
	 
	  if ((i + baslang�cGunu) % 7 == 0)
		  System.out.println();
	  }
	 
	  System.out.println();
	  }

private static int baslang�cGununuAl(int y�l, int ay) {
	final int START_DAY_FOR_JAN_1_1800 = 2;
	int toplamGunSay�s� = toplamGunSay�s�n�Al(y�l, ay);
	return (toplamGunSay�s� + START_DAY_FOR_JAN_1_1800) % 7;
}
private static int toplamGunSay�s�n�Al(int y�l, int ay) {
	int toplam = 0;
	for (int i = 1800; i < y�l; i++)
		 if (art�kY�lM�(i))
		 toplam = toplam + 366;
		 else
		 toplam = toplam + 365;
	
	for (int i = 1; i < ay; i++)
		toplam= toplam + ay�nGunler�n�nSay�s�n�Al(y�l, i);

	return toplam;
}

private static int ay�nGunler�n�nSay�s�n�Al(int y�l, int ay) {
		if (ay == 1 || ay == 3 || ay == 5 || ay == 7 ||
		ay == 8 || ay == 10 || ay == 12)
		 return 31;
		
		 if (ay == 4 || ay == 6 || ay == 9 || ay == 11)
		 return 30;
		
		 if (ay == 2) return art�kY�lM�(y�l) ? 29 : 28;
	return 0;
}

private static boolean art�kY�lM�(int y�l) {
	return y�l % 400 == 0 || (y�l % 4 == 0 && y�l % 100 != 0);
	
}




}
