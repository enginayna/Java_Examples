import java.util.Scanner;

public class loop_subtraction_process {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int say�1 = (int)(Math.random()*10);
	int say�2 = (int)(Math.random()*10);
	
	if(say�1<say�2) {
		int yenisay� = say�1;
		say�1 = say�2;
		say�2 = yenisay�;
	}
	System.out.println(say�1 + "-" + say�2 + " =");
	int sonuc = input.nextInt();
	
	int pin = 0;
	
	while((say�1-say�2) != sonuc && pin<2) {
		System.out.println("Yanl�� Cevap Verdiniz.");
		System.out.println(say�1 + "-" + say�2 + " =");
		sonuc = input.nextInt();		
		pin++;
	}
	if(say�1-say�2 == sonuc) {
		System.out.println("Do�ru cevap verdiniz.");
	}else {
		System.out.println("Malesef 3 hakk�n�z doldu.");
	}
}
}
