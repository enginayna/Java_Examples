import java.util.Scanner;

public class Fahrenayt_Derece {
public static void main(String[] args) {
	double mil;
	Scanner input = new Scanner(System.in);
	System.out.println("Kilometreye d�n��t�r�lecek mil'i giriniz : ");
	mil = input.nextDouble();
	double km = mil/0.62137;
	System.out.println("Sonuc : "+(int)(km*100)/100.0+" km eder.");
	//k�s�ratl� sonuclar�n k�s�rat k�s�mlar�n�n ka� basama�� g�r�ns�n istiyorsak 
	//ona g�re 100 ve katlar� ile �arpabiliriz. 
	//�rn 100/100.0 k�s�rat k�sm� 2 basamakl� olacak demektir.
	Fahren(43);
}
public static void Fahren(double l){
	double k=(9.0/5)*l+32;
	
	System.out.println(l+" celcius "+k+" fahrenayt eder");
}
}
