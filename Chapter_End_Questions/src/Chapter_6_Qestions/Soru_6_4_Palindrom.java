package Chapter_6_Qestions;
import java.util.Scanner;

public class Soru_6_4_Palindrom {
public static void main(String[] args) {
printİsPalindrome();

}
private static void printİsPalindrome() {
	Scanner input = new Scanner(System.in);
	System.out.println("Lütfen bir sayı giriniz : ");
	int number = input.nextInt();
	isPalindrome(number);
}
public static boolean isPalindrome(int number) {
	int reverse = reverse(number);
	if(number != reverse) {
		System.out.println(number + " != " + reverse + "\nPalindrome değildir.");
		return false;
	}
	System.out.println(number + " = " + reverse + "\nPalindrome sayıdır.");
	return true;
}
public static int reverse(int number) {
	int sum = 0;
	int count = basamakSayısı(number);
	while(number>9) {
		int bd = number % 10;
		sum += bd*(Math.pow(10, count));
		count--;
		number = number/10;
		if(number<10) {
			sum += number; 
		}
	}
	return sum;
}
public static int basamakSayısı(int sayı){
	int count  = 0;
	while(sayı >9) {
		sayı = sayı/10;
		count++;
	}return count;
	
}
}
