package Chapter_5_Questions;

public class Soru_5_11_Bolunebilme {
public static void main(String[] args) {
	String rapor = "";
	for (int i = 100; i < 200; i++) {
		if(i % 5 ==0 || i % 6 ==0) {
			if(i % 30 != 0) {
				rapor = i + " ";
				System.out.print(rapor);
			}
		}
		
	}
}
}
