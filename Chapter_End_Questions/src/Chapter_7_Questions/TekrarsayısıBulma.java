package Chapter_7_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Tekrarsay�s�Bulma {
	public static void main(String[] args) {
		int[] array = say�lar�Al();
		
		printAgain(array);
	}

	public static int[] say�lar�Al() {
		Scanner input = new Scanner(System.in);
		int count = 100;
		int sum = 0;
		int[] array = new int[count];
		for (int i = 0; i < count; i++) {

			System.out.print("say� girin ��k�� i�in 0 girin : ");
			array[i] = input.nextInt();
			count++;
			if (array[i] == 0) {
				count = 0;

			}
			sum++;
		}
		int[] arrays = new int[sum - 1];
		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = array[i];
		}
		return arrays;
	}

	
	
	public static void printAgain(int[] array) {
		Arrays.sort(array);
		int[] count =new int[array.length]; 
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[i] ==array[j]) {
					count[i]++;
				}
				
			}
		}
		
		for (int i = 0; i < count.length; i++) {
			
			if(count[i]>1){
			System.out.println(array[i] + " say�s�ndan " + count[i] + " tane vard�r");
			i+=count[i]-1; 
			}
			else {
				System.out.println(array[i] + " say�s�ndan " + count[i] + " tane vard�r");
			}
		}
		
	}
	
}
