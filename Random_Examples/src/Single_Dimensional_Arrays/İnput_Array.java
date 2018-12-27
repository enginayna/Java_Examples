package Single_Dimensional_Arrays;

import java.util.Scanner;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class Ýnput_Array {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int[] new_array = new int[5];
	System.out.println("Lütfen " +new_array.length + " tane sayý giriniz : ");
	for (int i =0; i < new_array.length; i++) {
		new_array[i]= input.nextInt();
	}
	array_input(10);
}
public static void array_input(int a) {
	int sum = 0;
	int highest_number = 0;
	int smallest_index= -1;
	int[] array = new int[a];
	for (int i = 0; i < array.length; i++) {
		array[i] = (int)(Math.random()*100);
	}
	for (int i = 0; i < array.length; i++) {
		System.out.printf("%3d" , array[i]);
		if((i+1) %10 == 0) {
			System.out.println();
		}
	}
	for (int j = 0; j < array.length; j++) {
		sum += array[j];
	}
	System.out.println("Dizi uzunlugu : " + sum);
	for (int i = 0; i < array.length; i++) {
		if(array[i]>highest_number) { 
			highest_number = array[i];
			smallest_index = i;
		}
	}
	System.out.println("Highest number is : " + highest_number + " smallest index is " + smallest_index);
	
	for (int i = 0; i < array.length; i++) {
		int randomindex = (int)(Math.random()*array.length);
		int gecici = array[i];
		array[i] = array[randomindex];
		array[randomindex] = gecici;
		
	}
	for (int i = 0; i < array.length; i++) {
		System.out.printf("%3d" , array[i]);
		if((i+1) %10 == 0) {
			System.out.println();
		}
	
   }
	int singlenumber = array[0];
	for (int i = 0; i < array.length - 1; i++) {
		array[i] = array[i+1];
		
	}
	array[array.length-1] = singlenumber;
	
	for (int i = 0; i < array.length; i++) {
		System.out.printf("%3d" , array[i]);
		if((i+1) %10 == 0) {
			System.out.println();
		}
	
}
}
}

