package Chapter_7_Questions;

import java.util.Scanner;

public class Soru_7_2_Number_Reverse {
public static void main(String[] args) {
	
	
	int number = howManyReverse();
	int[]array = getNumber(number);
	int[]reverseArray = reverseNumber(array);
	printReverseNumber(reverseArray);
	
}
public static int howManyReverse() {
	Scanner input = new Scanner(System.in);
	System.out.println("Kaç tane sayı gireceksiniz : ");
	int number = input.nextInt();
	return number;
}
public static int[] getNumber(int number) {
	Scanner input = new Scanner(System.in);
	int array[] = new int[number];
	for (int i = 0; i < array.length; i++) {
		System.out.println((i+1) + ". number : ");
		array[i] = input.nextInt();
	}
	return array;
}
public static int[] reverseNumber(int[]array) {
	int[]reverse = new int[array.length];
	for (int i = 0; i < array.length; i++) {
		reverse[reverse.length-1-i] = array[i];
	}
	return reverse;
}
public static void printReverseNumber(int[] array) {
	for (int i = 0; i < array.length; i++) {
		System.out.println((i+1) + ". number is : " + array[i]);
	}
}
}
