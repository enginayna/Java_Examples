package Chapter_6_Qestions;
import java.util.Scanner;

public class Soru_6_1_Besgensel_Sayı {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Besgensel Sayı Adetini Giriniz : ");
	int sayı = input.nextInt();
    besgenselSayıYazdır(sayı);
	
	
	
}
public static void besgenselSayıYazdır(int sayı) {
	
	for (int i = 1; i <= sayı  ; i++){
		if(i % 10 == 0) {
			System.out.printf("%5d " , besgenselSayıBul(i) );
			System.out.println();
		}
		
		else {
			System.out.printf("%5d " , besgenselSayıBul(i) );
		}
		
	}
}

public static int besgenselSayıBul(int n) {
	
	int result = n*(3*n-1)/2;
	return result;
	}
}


