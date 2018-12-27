package Chapter_5_Questions;

public class Soru_5_5 {
public static void main(String[] args) {
	System.out.println("Kilogram\t" + "Pound\t" + "|\t" + "Pound\t" + "Kilogram");
	int kg = 1;
	int pound1 = 20;
	double pound = kg*2.2;
	double kg1 = pound1/2.2;
	
	while (kg<101) {
		pound = kg*2.2;
		kg1 = pound1/2.2;
		
		System.out.println(kg + "\t\t" + (int)(pound*100)/100.0 + "\t|\t" + pound1 + "\t" + (int)(kg1*100)/100.0);
		
		kg++;
		pound1 += 5;
	}
	
		kg = 101;
	while(kg<200) {
		pound = kg*2.2;
		
		System.out.println(kg + "\t\t" + (int)(pound*100)/100.0 + "\t|\t");
		
		kg++;
	}
}
}
