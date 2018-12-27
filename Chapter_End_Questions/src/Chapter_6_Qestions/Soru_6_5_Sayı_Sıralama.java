package Chapter_6_Qestions;

public class Soru_6_5_Sayý_Sýralama {
public static void main(String[] args) {
	displaySortedNumbers(25, 451, -5451);
	displaySortedNumbers(24.45, -84, 265.85);
}
public static void displaySortedNumbers(int a, int b, int c) {
	if(a < b) {
		int yeni = a;
		a = b;
		b = yeni;
	}
	if(a < c) {
		int yeni = a;
		a = c;
		c = yeni;
	}
	if(b<c) {
		int yeni = b;
		b = c;
		c = yeni;
	}
	System.out.println(c + " > " + b + " > " + a);
}

public static void displaySortedNumbers(double a, double b, double c) {
	if(a < b) {
		double yeni = a;
		a = b;
		b = yeni;
	}
	if(a < c) {
		double yeni = a;
		a = c;
		c = yeni;
	}
	if(b<c) {
		double yeni = b;
		b = c;
		c = yeni;
	}
	System.out.println(c + " > " + b + " > " + a);
}
}