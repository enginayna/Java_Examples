package Chapter_2_Questions;
import java.util.Scanner;

public class Soru_2_1_Santigrat_Fahrenayt {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Fahrenayta çevirmek istediðiniz santigratý giriniz : ");
	double santigrat = input.nextDouble();
	System.out.println(santigrat + "santigrat " + (9.0/5*santigrat+32) + "fahrenayt eder.");
	}
	}

