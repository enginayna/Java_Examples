package Chapter_5_Questions;
import java.util.Scanner;

public class Soru_5_2_Rassal_Toplama {
public static void main(String[] args) {
	int questionnumber = 0;
	Scanner input = new Scanner(System.in);
	long timestart = System.currentTimeMillis();
	int dogrusay�s� = 0;
	int yanl�ssay�s� = 0;
	String rapor="";
	
	while(questionnumber<10) {
		int say�  = (int)(Math.random()*14+1);
		int say�2 = (int)(Math.random()*14+1);
		System.out.println(say� + "+" + say�2 + " = ");
		int answer = input.nextInt();
		
		if(say�+say�2 ==answer) {
			System.out.println("Do�ru Cevap");
			dogrusay�s�++;
			rapor +=(say�+" + "+say�2+" = "+answer+" Do�ru\n");
			
		}
		else {
			System.out.println("Yanl�� cevap");
			yanl�ssay�s�++;
			rapor +=(say�+" + "+say�2+" = "+answer+" Yanl��\n");
		}
		questionnumber++;
		
	}
	long timefinish = System.currentTimeMillis();
	int time = (int)(timefinish-timestart)/1000;
	System.out.println("Toplam s�re : "+time);
	System.out.println("Toplam soru say�s� : "+ questionnumber);
	System.out.println("Toplam do�ru say�s� : "+ dogrusay�s�);
	System.out.println("Toplam yanl�� say�s� : "+ yanl�ssay�s�);
	System.out.println("RAPOR\n"+rapor);
	
}
}
