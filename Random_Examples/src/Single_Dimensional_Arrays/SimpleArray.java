package Single_Dimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArray {
public static void main(String[] args) {
	int[] a  = new int[5];
	String[] b = new String[5];
	int[] c = {1,2,3,4,5};
	String[] str = {"a", "b", "c", "d", "e"};
	a[3] = 45;
	System.out.print(a[3]);
	System.out.println("\n" + b[0] + "\n" + c[3]);
	//printArray(c);
	//printArray(str);
	//System.out.println(average((arraydoldurma(getNumber()))));
	arraySort(arraydoldurma(getNumber()));
	
	
	
}
public static void printArray(int[] array) {
	for (int i = 0; i < array.length; i++) {
		System.out.println((i+1) + ". index : " + array[i]);
	}
}
public static void printArray(String[] array) {
	for (int i = 0; i < array.length; i++) {
		System.out.println((i+1) + ". index : " + array[i]);
	}
}
public static double average(int[] array) {
	double sum = 0;
	for (int i = 0; i < array.length; i++) {
		sum += array[i]; 
	}
	double average = sum/array.length;
	return average;
}
public static int[] arraydoldurma(int number) {
	int[] array = new int[number];
	for (int i = 0; i < array.length; i++) {
		Scanner input = new Scanner(System.in);
		System.out.println(i + ". index'i girin : ");
		array[i] = input.nextInt();
	}
	return array;
}
public static int getNumber() {
	Scanner input = new Scanner(System.in);
	System.out.println("dizi uzunluðunu giriniz : ");
	int number = input.nextInt();
	return number;
}
public static void arraySort(int[]array) {
	Arrays.sort(array);
	printArray(array);
}
}
