package Chapter_7_Questions;

import java.util.Scanner;

public class Soru_7_5_Different_Number_Show {
public static void main(String[] args) {
	int[] array = getNumber();
	printDifferentNumber(array);
}
public static int[] getNumber() {
	Scanner input = new Scanner(System.in);
	int[] array = new int[10];	
	final int sumNumber= 10;
	int number = 0;
	int count = 0;
	System.out.println("Enter ten numbers are : ");
	for (int i = 0; i < sumNumber; i++) {
		int counter = 0;
		number = input.nextInt();
		for (int j = 0; j < array.length; j++) {
			if(array[j] == number) {
				counter++;
			}
		}
		if(counter<1) {
			array[count] = number;
			count++;
		}
	}
	int arrays[] = new int [count];
	for (int i = 0; i < count; i++) {
		arrays[i] = array[i];
	}
	return arrays;
}
public static void printDifferentNumber(int[] array) {
	String number = "";
	for (int i = 0; i < array.length; i++) {
		number +=  array[i] + " ";
	}
	System.out.print(number);
}
}
