import java.util.Scanner;

public class Example_�kinciDereceDenklemler {
public static void main(String[] args) {
	System.out.println("ax2 + bx + c = 0 Denklemininin diskriminant�n� hesaplamak i�in"
			+ "a, b, c, de�erlerini giriniz.");
	Scanner input = new Scanner(System.in);
	System.out.println("a de�eri : ");
	double a = input.nextDouble();
	System.out.println("b de�eri : ");
	double b =input.nextDouble(); 
	System.out.println("c de�eri : ");
	double c = input.nextDouble();
	
	double k�k1 = ((-b) + Math.pow((b*b)-4*a*c, 0.5))/(2*a);
	double k�k2 = ((-b) - Math.pow((b*b)-4*a*c, 0.5))/(2*a);
	
	double diskriminant = b*b-4*a*c;
	if(diskriminant == 0) {
		System.out.println("Denklemin bir k�k� vard�r : "+k�k1);
	}
	else if(diskriminant > 0) {
		System.out.println("Denklemin iki ayr� k�k� vard�r : "+k�k1+" ve "+k�k2);
	}
	else if(diskriminant < 0) {
		System.out.println("Denklemin ger�ek bir k�k� yoktur.");
	}
}
}
