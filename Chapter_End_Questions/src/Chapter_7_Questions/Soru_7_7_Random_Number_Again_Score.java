package Chapter_7_Questions;

public class Soru_7_7_Random_Number_Again_Score {
public static void main(String[] args) {
	int [] array = findRandomNumber();
	printAgainNumber(array);
}
public static int[] findRandomNumber() {
	int[] array = new int[100];
	for (int i = 0; i < array.length; i++) {
		array[i] = (int)(Math.random()*10);
	}
	return array;
}
public static void printAgainNumber(int[] array) {
	int[] numbers = new int [10];
	for (int i = 0; i < array.length; i++) {
		numbers[array[i]]++;
	}
	for (int i = 0; i < numbers.length; i++) {
		System.out.println(i + " repetition number is " +numbers[i]);
	}
	
}
}
