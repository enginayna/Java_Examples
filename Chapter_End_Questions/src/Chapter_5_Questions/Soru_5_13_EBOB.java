package Chapter_5_Questions;
import java.util.Scanner;

public class Soru_5_13_EBOB {
public static void main(String[] args) {
	String result = "";
	Scanner input = new Scanner(System.in);
	System.out.println("EBOB'unu bulmak istediğiniz sayıları giriniz.");
	System.out.println("\nBirinci sayı : " );
	int number1 = input.nextInt();
	System.out.println("İkinci sayı : ");
	int number2 = input.nextInt();
	if(number2>number1) {
		int newnumber = number1;
		number1 = number2;
		number2 = newnumber;
	}
	for (int ebob = 1; ebob <= number2; ebob++) {
		if(number1 % ebob == 0 && number2 % ebob == 0) {
			result ="EBOB : " + ebob;
		}
	}
	System.out.println(result);
}
}
