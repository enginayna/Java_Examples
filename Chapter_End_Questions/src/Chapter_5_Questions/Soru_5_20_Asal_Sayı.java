package Chapter_5_Questions;

public class Soru_5_20_Asal_Say� {
public static void main(String[] args) {
	int say�;
	int count=1;
	for (int number = 2; number <=1000; number++) {
		say� = 0;
		for (int i = 1; i < number; i++) {
			if(number % i == 0 ) {
				say� = say� +1;
		}
		}
		if(say� ==1) {
			System.out.printf("%3d" , number);
			System.out.print(" ");
			count++;
			if(count ==8) {
				System.out.print("\n");
				count =1;
			}
			
		}
	}
   }
}