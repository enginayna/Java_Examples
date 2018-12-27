package Chapter_5_Questions;

public class Soru_5_6_KM_MIL {
public static void main(String[] args) {
	int mil = 1;
	double km = mil*1.609;
	int km1 = 20;
	double mil1 = km1/1.609;
	System.out.println("Mil\t" + "Kilometre\t" + "|\t" + "Kilometre\t" + "Mil");
	while(mil<11) {
		km = mil*1.609;
		mil1 = km1/1.609;
		System.out.println(mil + "\t" + (int)(km*1000)/1000.0 + "\t\t" + "|\t" + km1 + "\t\t" + (int)(mil1*100)/100.0);
		km1 += 5; 
		mil++;
	}
}
}
