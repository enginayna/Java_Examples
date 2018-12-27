package Chapter_6_Qestions;
import java.util.Scanner;

public class Soru_6_4_Palindrom {
public static void main(String[] args) {
print�sPalindrome();

}
private static void print�sPalindrome() {
	Scanner input = new Scanner(System.in);
	System.out.println("L�tfen bir say� giriniz : ");
	int number = input.nextInt();
	isPalindrome(number);
}
public static boolean isPalindrome(int number) {
	int reverse = reverse(number);
	if(number != reverse) {
		System.out.println(number + " != " + reverse + "\nPalindrome de�ildir.");
		return false;
	}
	System.out.println(number + " = " + reverse + "\nPalindrome say�d�r.");
	return true;
}
public static int reverse(int number) {
	int sum = 0;
	int count = basamakSay�s�(number);
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
public static int basamakSay�s�(int say�){
	int count  = 0;
	while(say� >9) {
		say� = say�/10;
		count++;
	}return count;
	
}
}
