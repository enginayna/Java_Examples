package Chapter_5_Questions;

public class Soru_5_3_Kg_Pont_Return {
public static void main(String[] args) {
	System.out.println("Kilogram"+"\tPound");
	int kg = 1;
	double pound =2.2;
	
	while(kg<200) {
		
		System.out.println(kg+"\t\t"+(int)(pound*100)/100.0);
		kg +=2;
		pound = kg*2.2;
	}
}
}

