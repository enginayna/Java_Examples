package Chapter_7_Questions;

import java.util.Scanner;

public class Soru_7_8_Arithmetic_Average {
	public static void main(String[] args) {
		/*int[]array = getIntNumber();
		int avarege = avaregeNumber(array);
		System.out.println("Avarege is : " + avarege);
		*/
		double[] arrays = getDoubleNumber();
		double avarege1 = avaregeNumber(arrays);
		System.out.println("Avarege is : " + avarege1);
	}

	public static int[] getIntNumber() {

		Scanner input = new Scanner(System.in);
		int number = 10;
		int[] array = new int[10];
		System.out.println("Enter ten numbers : ");
		for (int i = 0; i < number; i++) {
			System.out.println((i + 1) + ". number : ");
			array[i] = input.nextInt();
		}
		return array;

	}
	public static double[] getDoubleNumber() {

		Scanner input = new Scanner(System.in);
		int number = 10;
		double[] array = new double[10];
		System.out.println("Enter ten numbers : ");
		for (int i = 0; i < number; i++) {
			System.out.println((i + 1) + ". number : ");
			array[i] = input.nextDouble();
		}
		return array;
	}		
	public static int avaregeNumber(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i]; 
		}
		int avarege = sum/array.length;
		return avarege;
	}
	public static double avaregeNumber(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i]; 
		}
		double average = (double)(sum/array.length);
		return average;
	}
	
}
