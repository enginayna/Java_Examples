import java.util.Scanner;
public class A8_Ýnput_Example {
	public static void main(String args[]) {
		long totalmilisn = System.currentTimeMillis();
		long totalsn = totalmilisn/1000;
		long totaldk = totalsn/60;
		long totalsaat = totaldk/60;
		long totalgün = totalsaat/24;
		double totalyýl =(totalgün/365.6);
		double totalay =(totalgün/30.46);
		int simdikiyýl = (int)totalyýl+1970;
		int simdikiay = (int)(((1970*365.6+totalgün)/30.46)%12);
		int simdikigün =(int)(((1970*365.6)+totalgün)%30.46);
		long simdikisn = totalsn %60;
		long simdikidk = totaldk %60;
		long simdikisaat = totalsaat %60;
		
		System.out.println(totalyýl);
		

		
		
		
	    Scanner input = new Scanner(System.in);
		
		
		System.out.println("Doðduðun yýl: ");
		double dogdugunyýl = new Scanner(System.in).nextDouble();
		System.out.println("doðduðun ay: ");
		double dogdugunay = new Scanner(System.in).nextDouble();
		System.out.println("doðduðun gün : ");
		double dogdugungun = new Scanner(System.in).nextDouble();
		
		int sonuc = (int)((simdikiyýl - dogdugunyýl)*365.6 + (simdikiay - dogdugunay)*30.46 + (simdikigün-dogdugungun)); 
		
		
		
		System.out.println("Toplam yaþadýðýn gün sayýsý : " + sonuc);
		System.out.println("Þuanki saat : " + (simdikisaat+3) + " : " + simdikidk + " : " + simdikisn);
		System.out.println("Þuanki Tarih : " + simdikiyýl + " . " + simdikiay + " . " + simdikigün);
		System.out.println(((dogdugunyýl-1970)*365.6)+(dogdugunay*30.46)+dogdugungun);
		
		
		
		
	}
	}

