import java.util.Scanner;

public class PiyangoOyunu {
public static void main(String[] args) {
	int piyango = (int)(Math.random()*41)+10;
	int birler_basamag� = piyango%10;
	int onlar_basamag� = piyango/10;
	System.out.println("---------Piyango Sistemine Ho�geldiniz.----------");
	System.out.println("");
	System.out.println("Sistem 10 ile 50 aras�ndaki say�lardan olu�ur.\n" +
	"\n" +
	"Do�ru tahmin ederseniz. 1000TL\n" +
	"\n" +
	"Say�y� tersten bilirsiniz. 500TL\n" +
	"\n" +
	"Say�n�n onlar basama��n� do�ru tahmin ederseniz. 200TL\n " +
	"\n" +
	"Say�n�n birler basama��n� do�ru tahmin ederseniz. 100TL\n" +
	"\n" +
	"KAZANIRSINIZ\n" +
	"\n" +
	"10 ve 50 dahil olmak �zere bir say� giriniz : ");
			
	Scanner input = new Scanner(System.in);
	int user = input.nextInt();
	int user1 = user % 10;
	int user2 = user /10;
	System.out.println("KAZANAN SAYI : "+ piyango);
	if(piyango == user) {
		System.out.println("1000TL Kazand�n�z. Tebrikler.");
	}
	else if(birler_basamag� == user1) {
		System.out.println("100TL Kazand�n�z. Tebrikler.");
	}
	else if(onlar_basamag� == user2) {
		System.out.println("200TL Kazand�n�z. Tebrikler.");
	}
	else if(onlar_basamag� == user1 && birler_basamag� == user2) {
		System.out.println("500TL kazand�n�z. Tebrikler.");
	}
	else {
		System.err.println("�kramiye Kazanamad�n�z.");
	}
}
}
