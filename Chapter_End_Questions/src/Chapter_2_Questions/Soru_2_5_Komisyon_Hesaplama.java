package Chapter_2_Questions;
import java.util.Scanner;

public class Soru_2_5_Komisyon_Hesaplama {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("ev tutar�n� giriniz: ");
	int a =input.nextInt();
	System.out.println("komisyon oran� nedir: ");
	int b =input.nextInt();
	double k =(double)a*b/100;
	double z =(double)(a+k);
	System.out.println("emlak��ya verilecek komisyonun: "+k);
	System.out.println("toplam harcanacak sermaye: "+z);
}
}
