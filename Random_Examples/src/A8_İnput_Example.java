import java.util.Scanner;
public class A8_�nput_Example {
	public static void main(String args[]) {
		long totalmilisn = System.currentTimeMillis();
		long totalsn = totalmilisn/1000;
		long totaldk = totalsn/60;
		long totalsaat = totaldk/60;
		long totalg�n = totalsaat/24;
		double totaly�l =(totalg�n/365.6);
		double totalay =(totalg�n/30.46);
		int simdikiy�l = (int)totaly�l+1970;
		int simdikiay = (int)(((1970*365.6+totalg�n)/30.46)%12);
		int simdikig�n =(int)(((1970*365.6)+totalg�n)%30.46);
		long simdikisn = totalsn %60;
		long simdikidk = totaldk %60;
		long simdikisaat = totalsaat %60;
		
		System.out.println(totaly�l);
		

		
		
		
	    Scanner input = new Scanner(System.in);
		
		
		System.out.println("Do�du�un y�l: ");
		double dogduguny�l = new Scanner(System.in).nextDouble();
		System.out.println("do�du�un ay: ");
		double dogdugunay = new Scanner(System.in).nextDouble();
		System.out.println("do�du�un g�n : ");
		double dogdugungun = new Scanner(System.in).nextDouble();
		
		int sonuc = (int)((simdikiy�l - dogduguny�l)*365.6 + (simdikiay - dogdugunay)*30.46 + (simdikig�n-dogdugungun)); 
		
		
		
		System.out.println("Toplam ya�ad���n g�n say�s� : " + sonuc);
		System.out.println("�uanki saat : " + (simdikisaat+3) + " : " + simdikidk + " : " + simdikisn);
		System.out.println("�uanki Tarih : " + simdikiy�l + " . " + simdikiay + " . " + simdikig�n);
		System.out.println(((dogduguny�l-1970)*365.6)+(dogdugunay*30.46)+dogdugungun);
		
		
		
		
	}
	}

