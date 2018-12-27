package Chapter_5_Questions;
import java.util.Scanner;

public class Soru_5_1_Sayý_Ort_Negatif_Pozitif {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayý giriniz : ");
		int sayý = input.nextInt();
		int negatifsayac =0;
		int pozitifsayac = 0;
		int toplam =0;
		double ortalama = 0;
		int sayac = 1;
		while(sayý != 0) {
			if(sayý<0) {
				negatifsayac++;
			}if(sayý>0) {
				pozitifsayac++;
			}
			 toplam =toplam+sayý;
			 ortalama = (double)toplam/sayac;
			sayac++;
			System.out.println("Bir sayý giriniz : ");
			sayý = input.nextInt();
		}
		System.out.println("Nesatif sayýlarýn toplamý : " + negatifsayac);
		System.out.println("Pozitif sayýlarýn toplamý : " + pozitifsayac);
		System.out.println("Girdiðiniz sayýlarýn toplamý : " + toplam);
		System.out.println("Girdiðiniz sayýlarýn ortalamasý : " + ortalama);
		
	}

}
