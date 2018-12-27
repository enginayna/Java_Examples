package Chapter_5_Questions;

import java.util.Scanner;

public class Soru_5_29_Takvim {
public static void main(String[] args) {
	inputAlma();
}
public static void inputAlma() {
	Scanner input = new Scanner(System.in);
	System.out.println(" Yýl, Ay ve Günü sayý olarak giriniz : ");
	int yýl = input.nextInt();
	int ay = input.nextInt();
	int gun = input.nextInt();
	input.nextLine();
	takvimYazdýr(ay, gun, yýl); 
}	
public static void takvimYazdýr(int ay , int gun , int yýl){
	
	for(int j= ay; j <=12; j++) {
		
		System.out.println("         " + ayIsmiYazdir(j) +" " + yýl + "      ");
		System.out.println("----------------------------");
		System.out.println("Pzt Sal Car Per Cum Cts Pzr");
	for (int i = gun; i > 1 ; i--) {
		
		System.out.print("    ");
	}
	for (int k = 1; k <= gunSayýsý(j); k++) {
		
		int hafta = k + (gun-1);
		System.out.printf("%2d" , k);
		System.out.print("  ");
		
		if(hafta % 7 == 0 && hafta !=0) {
			
			System.out.println("\n");
		
		}
		
	}
	gun =(gunSayýsý(j) + gun) % 7;
	if(gun == 0 ) {
		gun = 7;
	}
	System.out.println("\n");
	
}
}


public static String ayIsmiYazdir(int sayý){
	if(sayý == 1) {
		return "Ocak";
	}
	if(sayý == 2) {
		return "Þubat";
	}
	if(sayý == 3) {
		return "Mart";
	}
	if(sayý == 4) {
		return "Nisan";
	}
	if(sayý == 5) {
		return "Mayýs";
	}
	if(sayý == 6) {
		return "Haziran";
	}
	if(sayý == 7) {
		return "Temmuz";
	}
	if(sayý == 8) {
		return "Aðustos";
	}
	if(sayý == 9) {
		return "Eylül";
	}
	if(sayý == 10) {
		return "Ekim";
	}
	if(sayý == 11) {
		return "Kasým";
	}
	if(sayý == 12) {
		return "Aralýk";
	}
	else {
		return null;
	}

}

public static int gunSayýsý(int sayý) {
	switch (sayý) {
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
