package Chapter_5_Questions;
import java.util.Scanner;

public class Soru_5_2_Rassal_Toplama {
public static void main(String[] args) {
	int questionnumber = 0;
	Scanner input = new Scanner(System.in);
	long timestart = System.currentTimeMillis();
	int dogrusayýsý = 0;
	int yanlýssayýsý = 0;
	String rapor="";
	
	while(questionnumber<10) {
		int sayý  = (int)(Math.random()*14+1);
		int sayý2 = (int)(Math.random()*14+1);
		System.out.println(sayý + "+" + sayý2 + " = ");
		int answer = input.nextInt();
		
		if(sayý+sayý2 ==answer) {
			System.out.println("Doðru Cevap");
			dogrusayýsý++;
			rapor +=(sayý+" + "+sayý2+" = "+answer+" Doðru\n");
			
		}
		else {
			System.out.println("Yanlýþ cevap");
			yanlýssayýsý++;
			rapor +=(sayý+" + "+sayý2+" = "+answer+" Yanlýþ\n");
		}
		questionnumber++;
		
	}
	long timefinish = System.currentTimeMillis();
	int time = (int)(timefinish-timestart)/1000;
	System.out.println("Toplam süre : "+time);
	System.out.println("Toplam soru sayýsý : "+ questionnumber);
	System.out.println("Toplam doðru sayýsý : "+ dogrusayýsý);
	System.out.println("Toplam yanlýþ sayýsý : "+ yanlýssayýsý);
	System.out.println("RAPOR\n"+rapor);
	
}
}
