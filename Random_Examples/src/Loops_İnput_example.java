import java.util.Scanner;

public class Loops_Ýnput_example {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int sayý1 = (int)(Math.random()*10);
	int sayý2 = (int)(Math.random()*10);
	
	System.out.println(sayý1 + "+" + sayý2 + "=");
	int sonuc = input.nextInt();
	int sayac =0;
	while(sayý1+sayý2 != sonuc && sayac<2) {
		sayac ++ ;
		System.out.println("Yanlýþ Cevap");
		System.out.println(sayý1 + "+" + sayý2 + "=");
		sonuc = input.nextInt();
	}
	if(sayý1+sayý2 == sonuc) {
	System.out.println("Doðru Cevap");
}
	else {
		System.out.println("3 kez yanlýþ cevap verdiniz!");
	}
}

}
