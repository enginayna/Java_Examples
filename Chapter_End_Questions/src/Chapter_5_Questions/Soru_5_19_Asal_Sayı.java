package Chapter_5_Questions;

public class Soru_5_19_Asal_Say� {
public static void main(String[] args) {
	
	for (int sat�r = 1; sat�r <= 8; sat�r++) {
		for (int bosluk = 8; bosluk >= sat�r; bosluk--) {
			System.out.print("    ");
		}
		for (int number = 0; number < sat�r; number++) {
			int result = (int)Math.pow(2, number);
			
				System.out.printf("%3d" , result);
				System.out.print(" ");
		}
		for (int i =sat�r; i > 1; i--) {
			int result1 = (int)Math.pow(2 ,i-2);
			System.out.printf("%3d" , result1 );
			System.out.print(" ");
			
		}
		System.out.println();
	}
}
}
