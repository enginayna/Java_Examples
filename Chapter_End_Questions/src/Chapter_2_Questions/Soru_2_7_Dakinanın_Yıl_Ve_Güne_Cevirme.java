package Chapter_2_Questions;
import java.util.Scanner;

public class Soru_2_7_Dakinan�n_Y�l_Ve_G�ne_Cevirme {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Y�l ve g�ne �evirmek istedi�iniz dakikay� giriniz : ");
	int dakika = input.nextInt();
	int y�l = 60*24*365;
	int gun = 60*24;
	System.out.println("Sonu� : " + (dakika/y�l) + " y�l " + ((dakika % y�l)/gun)+ " g�n eder");
}
}
