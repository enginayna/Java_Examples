
import java.util.Scanner;

public class Hesap_Makinesi {
public static void main(String[] args) {
	double a;
	double b;
	String c;
	Scanner x= new Scanner(System.in);
	
	System.out.println("i�lem: ");
	c=x.nextLine();
	
	System.out.println("1.say�: ");
	a =x.nextDouble();
	
	System.out.println("2.say�: ");
	b=x.nextDouble();
	
	if(c.equals("+")){
		System.out.println("sonu�: "+(a+b));
	}
	if(c.equals("-")) {
		System.out.println("sonu�: "+(a-b));
	}
	
	if(c.equals("*")) {
		System.out.println("sonu�: "+(a*b));
	}
	if(c.equals("/")) {
		System.out.println("sonu�: "+(a/b));
	}
	else {
		System.out.println("ERROR!");
	}
	
}
}
