import java.util.Scanner;

public class Ebob {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Bir say� giriniz: ");
	int say� = input.nextInt();
	System.out.println("Bir say� giriniz: ");
	int say�1 = input.nextInt();
	int ebob = 1;
	int bolen = 2;
	while(bolen<=say� && bolen<=say�1) {
		if(say�%bolen ==0 && say�1%bolen == 0) {
			ebob = bolen;
	}
		bolen++;
	}
	System.out.println(say� + " ve " + say�1 + " obeb'i : " + ebob + " dir" );
}
}
