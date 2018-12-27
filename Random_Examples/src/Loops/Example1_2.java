package Loops;

import java.util.Scanner;

public class Example1_2 {
public static void main(String[] args) {
	int number1 = (int)(Math.random()*10);
	int number2 =(int)(Math.random()*10); 

	Scanner input = new Scanner(System.in);
	
	System.out.println("What is " + number1 + " + " + number2 + " = ");
	int result = input.nextInt();
	
	while(number1+number2 != result) {
		
		System.out.println("Wrong answer. Try Again." + "\n" + "\nWhat is " + number1 + " + " + number2 + " = ");
		
		result = input.nextInt();
			
	}
	System.out.println("You got it");
}
}
