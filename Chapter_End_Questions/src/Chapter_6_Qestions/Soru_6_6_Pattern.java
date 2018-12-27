package Chapter_6_Qestions;

public class Soru_6_6_Pattern {
public static void main(String[] args) {
	displayPattern(2);
	displayPattern(3);
	displayPattern(4);
	displayPattern(5);
	displayPattern(6);
	displayPattern(7);
	displayPattern(8);
	
}
public static void displayPattern(int number) {
	for (int i = 1; i <= number; i++) {
		for (int j = number; j > i ; j--) {
			System.out.print("  ");
		}
		for (int k = i; k > 0; k--) {
			System.out.print(k + " ");
		}
		System.out.println();
	}
}
}
