package Chapter_6_Qestions;
import java.util.Scanner;

public class Soru_6_2_Basamak_Degeri {
	
public static void main(String[] args) {
	toplamyazdýr();
	
}
private static void toplamyazdýr() {
	Scanner input = new Scanner(System.in);
	System.out.println(" Basamak sayý deðeri toplama : ");
	int sayý = input.nextInt();
	System.out.println(basamakDegeriBulma(sayý));
}
public static int basamakDegeriBulma(int sayý){
	
	int uzunluk = String.valueOf(sayý).length();
		
	int sum = 0;
	for (int i = 1; i <= uzunluk; i++) {
		int bd = sayý % 10;
		sum = sum + bd;
		sayý = sayý/10;
	
}return sum;
	
		
	
	
	
	
	
}
}
