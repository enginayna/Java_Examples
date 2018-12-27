package Chapter_3_Questions;
import java.util.Scanner;

public class Soru3_3 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("a deðerini giriniz : ");
	int a = input.nextInt();
	System.out.println("b deðerini giriniz : ");
	int b = input.nextInt();
	System.out.println("c deðerini giriniz : ");
	int c = input.nextInt();
	System.out.println("d deðerini giriniz : ");
	int d = input.nextInt();
	System.out.println("e deðerini giriniz : ");
	int e = input.nextInt();
	System.out.println("f deðerini giriniz : ");
	int f = input.nextInt();
	int sonuc = ((a*d)-(b*c));
	if (sonuc == 0) {
		
		System.out.println("Denklemin çözümü yoktur!");
		System.exit(0);
	}
	
	int x =((e*d)-(b*f))/((a*d)-(b*c));
	int y =((a*f)-(e*c))/((a*d)-(b*c));

	System.out.println("x = " + x + " y = " + y);
	
	
}
}
