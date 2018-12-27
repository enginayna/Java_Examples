package Chapter_2_Questions;
import java.util.Scanner;

public class Soru_2_15_Geometri_Ýki_Nokta_Arasýndaki_Mesafe {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("x1 ve y1'i giriniz: ");
	double x1= input.nextDouble();
	double y1= input.nextDouble();
	System.out.println("x2 ve y2'i giriniz : ");
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	double a = Math.pow((x2 - x1), 2);
	double b = Math.pow((y2 - y1), 2);
	System.out.println("Sonuc : "+ Math.pow((a+b), 0.5));
	
}
}
