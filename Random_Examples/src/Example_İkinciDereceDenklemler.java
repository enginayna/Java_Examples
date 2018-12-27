import java.util.Scanner;

public class Example_ÝkinciDereceDenklemler {
public static void main(String[] args) {
	System.out.println("ax2 + bx + c = 0 Denklemininin diskriminantýný hesaplamak için"
			+ "a, b, c, deðerlerini giriniz.");
	Scanner input = new Scanner(System.in);
	System.out.println("a deðeri : ");
	double a = input.nextDouble();
	System.out.println("b deðeri : ");
	double b =input.nextDouble(); 
	System.out.println("c deðeri : ");
	double c = input.nextDouble();
	
	double kök1 = ((-b) + Math.pow((b*b)-4*a*c, 0.5))/(2*a);
	double kök2 = ((-b) - Math.pow((b*b)-4*a*c, 0.5))/(2*a);
	
	double diskriminant = b*b-4*a*c;
	if(diskriminant == 0) {
		System.out.println("Denklemin bir kökü vardýr : "+kök1);
	}
	else if(diskriminant > 0) {
		System.out.println("Denklemin iki ayrý kökü vardýr : "+kök1+" ve "+kök2);
	}
	else if(diskriminant < 0) {
		System.out.println("Denklemin gerçek bir kökü yoktur.");
	}
}
}
