import java.util.Scanner;

public class Ebob {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Bir sayý giriniz: ");
	int sayý = input.nextInt();
	System.out.println("Bir sayý giriniz: ");
	int sayý1 = input.nextInt();
	int ebob = 1;
	int bolen = 2;
	while(bolen<=sayý && bolen<=sayý1) {
		if(sayý%bolen ==0 && sayý1%bolen == 0) {
			ebob = bolen;
	}
		bolen++;
	}
	System.out.println(sayý + " ve " + sayý1 + " obeb'i : " + ebob + " dir" );
}
}
