package Chapter_6_Qestions;
import java.util.Scanner;

public class Soru_6_1_Besgensel_Say� {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Besgensel Say� Adetini Giriniz : ");
	int say� = input.nextInt();
    besgenselSay�Yazd�r(say�);
	
	
	
}
public static void besgenselSay�Yazd�r(int say�) {
	
	for (int i = 1; i <= say�  ; i++){
		if(i % 10 == 0) {
			System.out.printf("%5d " , besgenselSay�Bul(i) );
			System.out.println();
		}
		
		else {
			System.out.printf("%5d " , besgenselSay�Bul(i) );
		}
		
	}
}

public static int besgenselSay�Bul(int n) {
	
	int result = n*(3*n-1)/2;
	return result;
	}
}


