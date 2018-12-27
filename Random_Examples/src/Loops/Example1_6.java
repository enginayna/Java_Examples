package Loops;

import java.util.Scanner;

public class Example1_6 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int sum =0;
	int data = -1;
	while(data != 0) {
	System.out.println("Enter an integer (the input ends if it is 0) : ");
		data = input.nextInt();
		sum +=data;
	}
	System.out.println("The sum is : " + sum);
}
}
