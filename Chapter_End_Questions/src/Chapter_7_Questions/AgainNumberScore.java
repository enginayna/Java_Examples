package Chapter_7_Questions;

import java.util.Scanner;

public class AgainNumberScore {
	public static void main(String[] args) {
		
		int [] array = getNumber();
		
		int[] arra1 = againNumber(array);
		printAgainnumber(arra1);
 	}

	public static int[] getNumber() {
		Scanner input = new Scanner(System.in);
		int[] array = new int[100];
		int count = 0;
		int i = 0;
		while (count < 1) {
			if (count != 0) {
				System.out.println("sayı girin : ");
				int number = input.nextInt();

				array[i] = number;
				i++;
			} else {
				count++;
			}

		}
		int[] arrays = new int[array.length];
		for (int j = 0; j < arrays.length; j++) {
			arrays[j] = array[j];
		}
		return arrays;
	}

	public static int[] againNumber(int[]array) {
		int [] count = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			count[array[i]]++;
		}
		return count;
	}
	public static void printAgainnumber(int[]array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
