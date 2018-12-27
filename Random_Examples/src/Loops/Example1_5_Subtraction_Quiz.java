package Loops;

import java.util.Scanner;

public class Example1_5_Subtraction_Quiz {
public static void main(String[] args) {
	long start_time = System.currentTimeMillis();
	int count =0;
	int correct_count = 0;
	int wrong_count = 0;
	int number_of_question = 1;

	Scanner input =new Scanner(System.in);
	int result;
	String output = "";
	while(count<5) {
		
		int number1 = (int)(Math.random()*20);
		int number2 = (int)(Math.random()*20);
		
		if(number1<number2) {
			int newnumber = number1;
			number1 = number2;
			number2 = newnumber;
	}
		
		System.out.println("\nWhat is " + number1 + " - " + number2 + " = ");
		result = input.nextInt();
		
		if(number1-number2 ==result) {
			System.out.println("You are correct");
			correct_count++;
			output += ("\n" + number_of_question + ". soru : " + number1 + " - " +number2 + " = " + result + " True");
			
		}else{
			System.out.println("You are answer is wrong");
			wrong_count++;
			output += ("\n" +number_of_question + ". soru : " + number1 + " - " +number2 + " = " + result + " False");
		}
		number_of_question++;
		count++;
	}
	long end_time = System.currentTimeMillis();
	int quiz_time =(int)(end_time-start_time)/1000;
	System.out.println("\nToplam soru sayýsý : " +(number_of_question-1));
	System.out.println("\nToplam doðru sayýsý : " + correct_count);
	System.out.println("\nToplam yanlýþ sayýsý : " + wrong_count);
	System.out.println("\nToplam sýnav süresi : " + quiz_time + " saniye");
	System.out.println("\nRAPOR " + output);
}
}
