import java.util.Scanner;

public class Cýkarma_Ýslemi {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int sayac =0; 
	int dogrusayacý = 0;
	int yanlýssayacý = 0;
	long baslangýczamaný = System.currentTimeMillis();
	String rapor = "";
	
	while(sayac < 5) {
		int sayý1 = (int)(Math.random()*10);
		int sayý2 = (int)(Math.random()*10);
		
		if(sayý1<sayý2) {
		int yenisayý = sayý1;
		sayý1 = sayý2;
		sayý2 = yenisayý;
		}
		System.out.println(sayý1 + "-" + sayý2 + " =");
		int sonuc = input.nextInt();
	
		if(sayý1-sayý2 == sonuc) {
		System.out.println("Doðru cevap verdiniz");
		dogrusayacý++;
		rapor += sayý1 + "-" + sayý2 + " =" + sonuc + "doðru\n";
	}else { System.out.println("Yanlýþ cevap verdiniz");
	yanlýssayacý++;
	rapor += sayý1 + "-" + sayý2 + " =" + sonuc + "yanlýs\n";
	}
		sayac++;
	}
	long bitiszamaný = System.currentTimeMillis();
	System.out.println("Toplam Süre : "+(bitiszamaný-baslangýczamaný)/1000 + "sn");
	System.out.println("Toplam soru sayýsý : "+ sayac);
	System.out.println("Toplam dogru sayýsý : " + dogrusayacý);
	System.out.println("Toplam yanlýþ sayýsý : "+ yanlýssayacý);
	System.out.println(rapor);
}
}