package Chapter_5_Questions;
import java.util.Scanner;

public class Soru_5_16_Piramit_Yapma {
public static void main(String[] args) {
	int count =1;
	Scanner input = new Scanner(System.in);
	System.out.println("1 ile 15 aras�nda bir say� giriniz : ");
	int number = input.nextInt();
	for (int sat�r =1; sat�r <= number; sat�r++) {
		for (int bosluk = number; bosluk >=sat�r ; bosluk--) {
			System.out.print("  ");
		}	
		for (int j =sat�r; j >=1 ; j--) {
			System.out.print(j + " " );
		}
		for (int k = 2; k <= sat�r ; k++) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		}
		
			
	}
}


