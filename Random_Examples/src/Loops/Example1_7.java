package Loops;

import java.util.Scanner;

public class Example1_7 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int sum = 0;
	int number;
	do {
		System.out.println("Enter an integer(the input ends if its 0) : ");
		number = input.nextInt();
		sum += number;
	}while(number != 0);
	System.out.println("The sum is : " + sum);
}
}
