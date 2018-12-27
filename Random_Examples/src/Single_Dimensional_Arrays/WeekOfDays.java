package Single_Dimensional_Arrays;

import java.util.Scanner;

public class WeekOfDays {
public static void main(String[] args) {
	/*String[]days = {"Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday" , "Sunday"};
	
	Scanner input = new Scanner(System.in);
	System.out.println("1 ile 7 arasýnda bir sayý giriniz : ");
	int selection = input.nextInt();
	System.out.println("Seçtiðiniz sayýya denk gelen gün : " + days[selection-1]);
	*/
	printArray();
}
public static void printArray() {
	String[]months = {"engin" , "feyyaz" , "serhat", "sefa","gökhan", "halid", "sarý", "cemal" , "oðuz" ,"nazým", "fatih"};
	int number = (int)(Math.random()*11);
	System.out.println(months[number]);
}
}