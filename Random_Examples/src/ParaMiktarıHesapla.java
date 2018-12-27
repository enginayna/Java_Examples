import java.util.Scanner;

public class ParaMiktarýHesapla {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Hesaplacak Türk Lirasýný Giriniz : Örn: 25,45");
	double toplamParaMiktarý = input.nextDouble();
	System.out.println("Toplam para miktarý : "+toplamParaMiktarý);
	
	toplamParaMiktarý *=100;
	int toplamTlMiktarý =(int)toplamParaMiktarý/100;
	System.out.println("Toplam Tl Miktarý : "+toplamTlMiktarý);
	
	int kalanKurusMiktarý = (int)toplamParaMiktarý % 100;
	int toplamelliKurusMiktarý = kalanKurusMiktarý/50;
	System.out.println("toplam 50 Kurus Miktarý : "+toplamelliKurusMiktarý);
	
	kalanKurusMiktarý = kalanKurusMiktarý % 50;
	int kalanyirmibesKurusMiktarý = kalanKurusMiktarý/25;
	System.out.println("Toplam 25 Kurus Miktarý : "+kalanyirmibesKurusMiktarý);
	
	kalanKurusMiktarý = kalanKurusMiktarý % 25;
	int toplamOnKurusMiktarý = kalanKurusMiktarý/10;
	System.out.println("Toplam 10 Kurus Miktarý : "+toplamOnKurusMiktarý);
	
	kalanKurusMiktarý = kalanKurusMiktarý % 10;
	int toplamBesKurusMiktarý = kalanKurusMiktarý/5;
	System.out.println("Toplam 5 Kurus Miktarý : "+toplamBesKurusMiktarý);
	
	kalanKurusMiktarý = kalanKurusMiktarý % 5;
	int toplamBirKurusMiktarý = kalanKurusMiktarý/1;
	System.out.println("Toplam 1 Kurus Miktarý : "+toplamBirKurusMiktarý);
			
	
}
}
