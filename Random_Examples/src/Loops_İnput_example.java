import java.util.Scanner;

public class Loops_�nput_example {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int say�1 = (int)(Math.random()*10);
	int say�2 = (int)(Math.random()*10);
	
	System.out.println(say�1 + "+" + say�2 + "=");
	int sonuc = input.nextInt();
	int sayac =0;
	while(say�1+say�2 != sonuc && sayac<2) {
		sayac ++ ;
		System.out.println("Yanl�� Cevap");
		System.out.println(say�1 + "+" + say�2 + "=");
		sonuc = input.nextInt();
	}
	if(say�1+say�2 == sonuc) {
	System.out.println("Do�ru Cevap");
}
	else {
		System.out.println("3 kez yanl�� cevap verdiniz!");
	}
}

}
