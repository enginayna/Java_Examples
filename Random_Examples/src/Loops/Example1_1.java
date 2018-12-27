package Loops;

public class Example1_1 {
public static void main(String[] args) {
	int number = 1;
	int sum=0;
	while(number<10) {
		sum += number;
		System.out.println(sum);
		number++;
	}
	System.out.println("1 den 10 a kadar sayýlarýn toplamý : "+sum);
}
}
