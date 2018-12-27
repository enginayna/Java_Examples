import java.util.Scanner;

public class PiyangoOyunu {
public static void main(String[] args) {
	int piyango = (int)(Math.random()*41)+10;
	int birler_basamagý = piyango%10;
	int onlar_basamagý = piyango/10;
	System.out.println("---------Piyango Sistemine Hoþgeldiniz.----------");
	System.out.println("");
	System.out.println("Sistem 10 ile 50 arasýndaki sayýlardan oluþur.\n" +
	"\n" +
	"Doðru tahmin ederseniz. 1000TL\n" +
	"\n" +
	"Sayýyý tersten bilirsiniz. 500TL\n" +
	"\n" +
	"Sayýnýn onlar basamaðýný doðru tahmin ederseniz. 200TL\n " +
	"\n" +
	"Sayýnýn birler basamaðýný doðru tahmin ederseniz. 100TL\n" +
	"\n" +
	"KAZANIRSINIZ\n" +
	"\n" +
	"10 ve 50 dahil olmak üzere bir sayý giriniz : ");
			
	Scanner input = new Scanner(System.in);
	int user = input.nextInt();
	int user1 = user % 10;
	int user2 = user /10;
	System.out.println("KAZANAN SAYI : "+ piyango);
	if(piyango == user) {
		System.out.println("1000TL Kazandýnýz. Tebrikler.");
	}
	else if(birler_basamagý == user1) {
		System.out.println("100TL Kazandýnýz. Tebrikler.");
	}
	else if(onlar_basamagý == user2) {
		System.out.println("200TL Kazandýnýz. Tebrikler.");
	}
	else if(onlar_basamagý == user1 && birler_basamagý == user2) {
		System.out.println("500TL kazandýnýz. Tebrikler.");
	}
	else {
		System.err.println("Ýkramiye Kazanamadýnýz.");
	}
}
}
