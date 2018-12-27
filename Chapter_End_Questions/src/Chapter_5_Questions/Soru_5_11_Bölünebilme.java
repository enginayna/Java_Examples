package Chapter_5_Questions;

public class Soru_5_11_Bölünebilme {
public static void main(String[] args) {
	int count = 0;
	String rapor ="";
	for (int i = 100; i < 1000; i++) {
		if(i % 5 ==0 && i % 6 == 0) {
			if(count % 10 == 0 && count != 0) {
			System.out.println();	
			}
			rapor = i + " ";
			System.out.print(rapor);
			count++;
		}
		
	}
	

}
}