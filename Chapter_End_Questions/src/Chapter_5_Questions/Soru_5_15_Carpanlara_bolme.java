package Chapter_5_Questions;
import java.util.Scanner;

public class Soru_5_15_Carpanlara_bolme {
public static void main(String[] args) {
	String result = "";
	Scanner input= new Scanner(System.in);
	System.out.println("Asal carpanlarý bulunacak sayýyý giriniz : ");
	int number = input.nextInt();
	int i = 2;
	while(i <=7) {
		if(number % i ==0) {
			result += i + " ";    
			number = number/i;
			i--;
		}
		i++;
	}
	System.out.println("Sonuç : " + result + number);
	
	
}
}
