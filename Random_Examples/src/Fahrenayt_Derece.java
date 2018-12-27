import java.util.Scanner;

public class Fahrenayt_Derece {
public static void main(String[] args) {
	double mil;
	Scanner input = new Scanner(System.in);
	System.out.println("Kilometreye dönüþtürülecek mil'i giriniz : ");
	mil = input.nextDouble();
	double km = mil/0.62137;
	System.out.println("Sonuc : "+(int)(km*100)/100.0+" km eder.");
	//küsüratlý sonuclarýn küsürat kýsýmlarýnýn kaç basamaðý görünsün istiyorsak 
	//ona göre 100 ve katlarý ile çarpabiliriz. 
	//örn 100/100.0 küsürat kýsmý 2 basamaklý olacak demektir.
	Fahren(43);
}
public static void Fahren(double l){
	double k=(9.0/5)*l+32;
	
	System.out.println(l+" celcius "+k+" fahrenayt eder");
}
}
