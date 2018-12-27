package Chapter_5_Questions;

import java.util.Scanner;

public class Soru_5_29_Takvim {
public static void main(String[] args) {
	inputAlma();
}
public static void inputAlma() {
	Scanner input = new Scanner(System.in);
	System.out.println(" Y�l, Ay ve G�n� say� olarak giriniz : ");
	int y�l = input.nextInt();
	int ay = input.nextInt();
	int gun = input.nextInt();
	input.nextLine();
	takvimYazd�r(ay, gun, y�l); 
}	
public static void takvimYazd�r(int ay , int gun , int y�l){
	
	for(int j= ay; j <=12; j++) {
		
		System.out.println("         " + ayIsmiYazdir(j) +" " + y�l + "      ");
		System.out.println("----------------------------");
		System.out.println("Pzt Sal Car Per Cum Cts Pzr");
	for (int i = gun; i > 1 ; i--) {
		
		System.out.print("    ");
	}
	for (int k = 1; k <= gunSay�s�(j); k++) {
		
		int hafta = k + (gun-1);
		System.out.printf("%2d" , k);
		System.out.print("  ");
		
		if(hafta % 7 == 0 && hafta !=0) {
			
			System.out.println("\n");
		
		}
		
	}
	gun =(gunSay�s�(j) + gun) % 7;
	if(gun == 0 ) {
		gun = 7;
	}
	System.out.println("\n");
	
}
}


public static String ayIsmiYazdir(int say�){
	if(say� == 1) {
		return "Ocak";
	}
	if(say� == 2) {
		return "�ubat";
	}
	if(say� == 3) {
		return "Mart";
	}
	if(say� == 4) {
		return "Nisan";
	}
	if(say� == 5) {
		return "May�s";
	}
	if(say� == 6) {
		return "Haziran";
	}
	if(say� == 7) {
		return "Temmuz";
	}
	if(say� == 8) {
		return "A�ustos";
	}
	if(say� == 9) {
		return "Eyl�l";
	}
	if(say� == 10) {
		return "Ekim";
	}
	if(say� == 11) {
		return "Kas�m";
	}
	if(say� == 12) {
		return "Aral�k";
	}
	else {
		return null;
	}

}

public static int gunSay�s�(int say�) {
	switch (say�) {
	case 1: return 31;
	case 2: return 28;
	case 3: return 31;
	case 4: return 30;
	case 5: return 31;
	case 6: return 30;
	case 7: return 31;
	case 8: return 31;
	case 9: return 30;
	case 10: return 31;
	case 11: return 30;
	case 12: return 31;
	default: return 0; 
	}
}
}
