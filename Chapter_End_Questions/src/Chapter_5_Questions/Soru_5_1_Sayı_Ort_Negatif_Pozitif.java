package Chapter_5_Questions;
import java.util.Scanner;

public class Soru_5_1_Say�_Ort_Negatif_Pozitif {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bir say� giriniz : ");
		int say� = input.nextInt();
		int negatifsayac =0;
		int pozitifsayac = 0;
		int toplam =0;
		double ortalama = 0;
		int sayac = 1;
		while(say� != 0) {
			if(say�<0) {
				negatifsayac++;
			}if(say�>0) {
				pozitifsayac++;
			}
			 toplam =toplam+say�;
			 ortalama = (double)toplam/sayac;
			sayac++;
			System.out.println("Bir say� giriniz : ");
			say� = input.nextInt();
		}
		System.out.println("Nesatif say�lar�n toplam� : " + negatifsayac);
		System.out.println("Pozitif say�lar�n toplam� : " + pozitifsayac);
		System.out.println("Girdi�iniz say�lar�n toplam� : " + toplam);
		System.out.println("Girdi�iniz say�lar�n ortalamas� : " + ortalama);
		
	}

}
