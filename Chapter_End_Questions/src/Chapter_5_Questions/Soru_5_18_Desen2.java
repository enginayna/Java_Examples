package Chapter_5_Questions;

public class Soru_5_18_Desen2 {
public static void main(String[] args) {
	for (int sat�r = 1; sat�r <= 6; sat�r++) {
		for (int bosluk = 6 ; bosluk >sat�r; bosluk--) {
			System.out.print("  ");
		}
		for (int i = sat�r; i >=1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
}
