package Chapter_6_Qestions;

public class Soru_6_9_Metre_Return {
public static void main(String[] args) {
	System.out.println("Feet\t\t" + "Metre" + "\t|\t" + "Metre\t\t" + "Feet");
	System.out.println("------------------------------------------------------");
	System.out.println();
	printReturn(10);
	
}
public static double footToMeter(double foot) {
	double meter = 0.305 * foot;
	return meter;
}
public static double meterToFoot(double meter) {
	double foot = 3.279 * meter;
	return foot;
}
public static void printReturn(int number) {
	int a = 1;
	double foot= 1;
	double meter = 20;
	while(a <= number) {
		System.out.printf(foot + "\t\t%6.3f" , footToMeter(foot));
		System.out.print("\t|\t");
		System.out.printf(meter + "\t\t%6.3f" , meterToFoot(meter));
		System.out.println();
		foot++;
		meter += 5;
		a++;
	}
}
}
