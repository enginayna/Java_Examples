import java.util.Scanner;

public class loop_subtraction_process {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int sayý1 = (int)(Math.random()*10);
	int sayý2 = (int)(Math.random()*10);
	
	if(sayý1<sayý2) {
		int yenisayý = sayý1;
		sayý1 = sayý2;
		sayý2 = yenisayý;
	}
	System.out.println(sayý1 + "-" + sayý2 + " =");
	int sonuc = input.nextInt();
	
	int pin = 0;
	
	while((sayý1-sayý2) != sonuc && pin<2) {
		System.out.println("Yanlýþ Cevap Verdiniz.");
		System.out.println(sayý1 + "-" + sayý2 + " =");
		sonuc = input.nextInt();		
		pin++;
	}
	if(sayý1-sayý2 == sonuc) {
		System.out.println("Doðru cevap verdiniz.");
	}else {
		System.out.println("Malesef 3 hakkýnýz doldu.");
	}
}
}
