package Single_Dimensional_Arrays;

import java.util.Scanner;

public class WeekOfDays {
public static void main(String[] args) {
	/*String[]days = {"Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday" , "Sunday"};
	
	Scanner input = new Scanner(System.in);
	System.out.println("1 ile 7 aras�nda bir say� giriniz : ");
	int selection = input.nextInt();
	System.out.println("Se�ti�iniz say�ya denk gelen g�n : " + days[selection-1]);
	*/
	printArray();
}
public static void printArray() {
	String[]months = {"engin" , "feyyaz" , "serhat", "sefa","g�khan", "halid", "sar�", "cemal" , "o�uz" ,"naz�m", "fatih"};
	int number = (int)(Math.random()*11);
	System.out.println(months[number]);
}
}