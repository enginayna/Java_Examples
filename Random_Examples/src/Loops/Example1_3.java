package Loops;

import java.util.Scanner;

public class Example1_3 {
public static void main(String[] args) {
	int number = (int)(Math.random()*101);
	Scanner input = new Scanner(System.in);
	System.out.println("Guess a magic number between 0 and 100");
	System.out.println("\nEnter your guess : ");
	int guess = input.nextInt();
	
	while(guess != number) {
		if(guess == number) {
			System.out.println("Yes, the number is " + number);
		}
		else if(guess>number) {
			System.out.println("Your guess is too high");
		}
		else {
			System.out.println("Your guess is too low");
		}
		System.out.println("\nEnter your guess : ");
		guess = input.nextInt();
	}
	
}
}
