
public class CarpýmTablosu {
public static void main(String[] args) {
	System.out.println("\t\t\tCarpým Tablosu");
	for (int i = 1; i <10; i++) {
		System.out.print("\t" + i);
	}
	System.out.println("\n--------------------------------------------------------------------------");
	for (int i = 1; i <10; i++) {
		System.out.print(i + " | ");
		for (int c = 1; c < 10; c++) {
			System.out.printf("\t%2d", i*c);
		}
		System.out.println();
	}
}
}
