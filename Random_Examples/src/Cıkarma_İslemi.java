import java.util.Scanner;

public class C�karma_�slemi {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int sayac =0; 
	int dogrusayac� = 0;
	int yanl�ssayac� = 0;
	long baslang�czaman� = System.currentTimeMillis();
	String rapor = "";
	
	while(sayac < 5) {
		int say�1 = (int)(Math.random()*10);
		int say�2 = (int)(Math.random()*10);
		
		if(say�1<say�2) {
		int yenisay� = say�1;
		say�1 = say�2;
		say�2 = yenisay�;
		}
		System.out.println(say�1 + "-" + say�2 + " =");
		int sonuc = input.nextInt();
	
		if(say�1-say�2 == sonuc) {
		System.out.println("Do�ru cevap verdiniz");
		dogrusayac�++;
		rapor += say�1 + "-" + say�2 + " =" + sonuc + "do�ru\n";
	}else { System.out.println("Yanl�� cevap verdiniz");
	yanl�ssayac�++;
	rapor += say�1 + "-" + say�2 + " =" + sonuc + "yanl�s\n";
	}
		sayac++;
	}
	long bitiszaman� = System.currentTimeMillis();
	System.out.println("Toplam S�re : "+(bitiszaman�-baslang�czaman�)/1000 + "sn");
	System.out.println("Toplam soru say�s� : "+ sayac);
	System.out.println("Toplam dogru say�s� : " + dogrusayac�);
	System.out.println("Toplam yanl�� say�s� : "+ yanl�ssayac�);
	System.out.println(rapor);
}
}