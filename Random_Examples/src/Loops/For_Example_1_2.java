package Loops;

import java.util.Scanner;

public class For_Example_1_2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int data = input.nextInt();
	int count;
	int sum = 0;
	for (count = 0; count < 5; count++) {
		data = input.nextInt();
		sum += data; 
	}
	System.out.println("The sum is : " + sum);
	System.out.println("The count is : " + count);
}
}
