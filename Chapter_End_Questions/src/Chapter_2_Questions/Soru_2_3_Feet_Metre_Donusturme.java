package Chapter_2_Questions;
import java.util.Scanner;

public class Soru_2_3_Feet_Metre_Donusturme {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Metreye çevirmek istediðiniz feet'i Giriniz : ");
	double feet = input.nextDouble();
	System.out.println(feet + " feet " + (feet*0.305) + " metre eder.");
}
}
