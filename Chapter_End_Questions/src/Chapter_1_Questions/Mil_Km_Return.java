package Chapter_1_Questions;


public class Mil_Km_Return {
public static void main(String[] args) {
	System.out.println("Mil"+ "\tKilometre");
	int mil = 1;
	int km = 1609;
	
	while(mil<=10 && km<=20000) {
		System.out.println(mil+"\t"+km);
	mil++;
	km += 1609; 
	}
}
}
