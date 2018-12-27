package method_Examples;

public class Number_Pyramid_Method {
public static void main(String[] args) {
	 int result = pyramid(6);
	System.out.println(result);
}
	public static int pyramid(int number) {
		for (int i = 1; i <=number; i++) {
			for (int j = number; j > i ; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= (i*2)-1; k++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}
		return number;
	}
}
