package method_Examples;

import java.util.Scanner;

public class Factorial_Method {
public static void main(String[] args) {
	factorial(); // parametre dahildir.
	faktoriyel(5);
	faktoriyel(6);
}
	public static void factorial(){
		Scanner input = new Scanner(System.in);
		System.out.println("Factoriyeli hesaplanacak sayýyý giriniz : ");
		int number1 = input.nextInt();
		
		int fact = 1;
	for (int i = 1; i <= number1 ; i++) {
		fact *= i;
		
	}
	System.out.println("Factorial result : " + fact);
	
}
	public static int faktoriyel(int number1) {
		int result = 1;
		for (int i = 1; i <=number1; i++) {
			result *= i;
		}
		System.out.println("\nResult : " + result);
		return result;
	}
}
