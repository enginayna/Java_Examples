package Chapter_7_Questions;

import java.util.Scanner;

public class Soru_7_9_Smallest_Number {
	public static void main(String[] args) {
		double[] array = getNumber();
		findSmallesNumber(array);
	}

	public static double[] getNumber() {
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		System.out.println("Enter ten numbers : ");
		for (int i = 0; i < array.length; i++) {
			System.out.println((i + 1) + ". number : ");
			array[i] = input.nextDouble();
		}
		return array;
	}
	public static void findSmallesNumber(double[]array) {
		double min = array[0];
		for (int i = 0; i < array.length; i++) {
			if(min>array[i]) {
				min = array[i];
			}
		}
		System.out.println("Smallest number is : " + min);
	}

}
