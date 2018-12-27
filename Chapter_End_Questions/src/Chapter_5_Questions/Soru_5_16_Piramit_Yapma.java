package Chapter_5_Questions;
import java.util.Scanner;

public class Soru_5_16_Piramit_Yapma {
public static void main(String[] args) {
	int count =1;
	Scanner input = new Scanner(System.in);
	System.out.println("1 ile 15 arasýnda bir sayý giriniz : ");
	int number = input.nextInt();
	for (int satýr =1; satýr <= number; satýr++) {
		for (int bosluk = number; bosluk >=satýr ; bosluk--) {
			System.out.print("  ");
		}	
		for (int j =satýr; j >=1 ; j--) {
			System.out.print(j + " " );
		}
		for (int k = 2; k <= satýr ; k++) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		}
		
			
	}
}


