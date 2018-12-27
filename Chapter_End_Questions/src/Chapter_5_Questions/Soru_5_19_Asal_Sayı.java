package Chapter_5_Questions;

public class Soru_5_19_Asal_Sayý {
public static void main(String[] args) {
	
	for (int satýr = 1; satýr <= 8; satýr++) {
		for (int bosluk = 8; bosluk >= satýr; bosluk--) {
			System.out.print("    ");
		}
		for (int number = 0; number < satýr; number++) {
			int result = (int)Math.pow(2, number);
			
				System.out.printf("%3d" , result);
				System.out.print(" ");
		}
		for (int i =satýr; i > 1; i--) {
			int result1 = (int)Math.pow(2 ,i-2);
			System.out.printf("%3d" , result1 );
			System.out.print(" ");
			
		}
		System.out.println();
	}
}
}
