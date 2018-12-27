package Chapter_5_Questions;

public class Soru_5_18_Desen3 {
public static void main(String[] args) {
	for (int satýr = 6; satýr >=1; satýr--) {
		for (int bosluk = satýr; bosluk <6; bosluk++) {
			System.out.print("  ");
		}
		for (int i =1; i<=satýr; i++) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		
	}
}
}
