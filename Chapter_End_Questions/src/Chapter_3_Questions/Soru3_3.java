package Chapter_3_Questions;
import java.util.Scanner;

public class Soru3_3 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("a de�erini giriniz : ");
	int a = input.nextInt();
	System.out.println("b de�erini giriniz : ");
	int b = input.nextInt();
	System.out.println("c de�erini giriniz : ");
	int c = input.nextInt();
	System.out.println("d de�erini giriniz : ");
	int d = input.nextInt();
	System.out.println("e de�erini giriniz : ");
	int e = input.nextInt();
	System.out.println("f de�erini giriniz : ");
	int f = input.nextInt();
	int sonuc = ((a*d)-(b*c));
	if (sonuc == 0) {
		
		System.out.println("Denklemin ��z�m� yoktur!");
		System.exit(0);
	}
	
	int x =((e*d)-(b*f))/((a*d)-(b*c));
	int y =((a*f)-(e*c))/((a*d)-(b*c));

	System.out.println("x = " + x + " y = " + y);
	
	
}
}
