package Chapter_6_Qestions;
import java.util.Scanner;

public class Soru_6_2_Basamak_Degeri {
	
public static void main(String[] args) {
	toplamyazd�r();
	
}
private static void toplamyazd�r() {
	Scanner input = new Scanner(System.in);
	System.out.println(" Basamak say� de�eri toplama : ");
	int say� = input.nextInt();
	System.out.println(basamakDegeriBulma(say�));
}
public static int basamakDegeriBulma(int say�){
	
	int uzunluk = String.valueOf(say�).length();
		
	int sum = 0;
	for (int i = 1; i <= uzunluk; i++) {
		int bd = say� % 10;
		sum = sum + bd;
		say� = say�/10;
	
}return sum;
	
		
	
	
	
	
	
}
}
