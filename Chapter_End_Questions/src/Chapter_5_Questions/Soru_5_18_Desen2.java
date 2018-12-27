package Chapter_5_Questions;

public class Soru_5_18_Desen2 {
public static void main(String[] args) {
	for (int satýr = 1; satýr <= 6; satýr++) {
		for (int bosluk = 6 ; bosluk >satýr; bosluk--) {
			System.out.print("  ");
		}
		for (int i = satýr; i >=1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
}
