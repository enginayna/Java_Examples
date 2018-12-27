package Chapter_6_Qestions;

public class Soru_6_8_Fahrenayt_Celcius {
public static void main(String[] args) {
	System.out.println("Santigrat\t\t" + "Fahrenhayt\t" + "|" + "\tFahrenhayt\t\t" + "Santigrat");
	System.out.println("----------------------------------------------------------------------------------");
	printReturn(10);
}
public static void printReturn(int number) {
	int a = 0;
	double celsius = 40;
	double fahrenheit= 120;
	while(a<number) {
		System.out.printf(celsius + "\t\t\t%4.2f" , celsiusToFahrenheit(celsius));
		System.out.print( "\t\t|");
		System.out.printf("\t" + fahrenheit + "\t\t\t%4.2f" , fahrenheitToCelsius(fahrenheit));
		System.out.println();
		celsius--;
		fahrenheit -= 10;
		a++;
	}
}

public static double celsiusToFahrenheit(double celsius) {
	
		double fahrenheit = (9.0/5)*celsius+32;
		return fahrenheit;
}
	public static double fahrenheitToCelsius(double fahrenheit) {
		
		double celsius = (5.0/9) * (fahrenheit - 32);
		return celsius;
	}
}

