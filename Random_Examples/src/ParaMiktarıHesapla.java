import java.util.Scanner;

public class ParaMiktarıHesapla {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Hesaplacak Türk Lirasını Giriniz : Örn: 25,45");
	double toplamParaMiktarı = input.nextDouble();
	System.out.println("Toplam para miktarı : "+toplamParaMiktarı);
	
	toplamParaMiktarı *=100;
	int toplamTlMiktarı =(int)toplamParaMiktarı/100;
	System.out.println("Toplam Tl Miktarı : "+toplamTlMiktarı);
	
	int kalanKurusMiktarı = (int)toplamParaMiktarı % 100;
	int toplamelliKurusMiktarı = kalanKurusMiktarı/50;
	System.out.println("toplam 50 Kurus Miktarı : "+toplamelliKurusMiktarı);
	
	kalanKurusMiktarı = kalanKurusMiktarı % 50;
	int kalanyirmibesKurusMiktarı = kalanKurusMiktarı/25;
	System.out.println("Toplam 25 Kurus Miktarı : "+kalanyirmibesKurusMiktarı);
	
	kalanKurusMiktarı = kalanKurusMiktarı % 25;
	int toplamOnKurusMiktarı = kalanKurusMiktarı/10;
	System.out.println("Toplam 10 Kurus Miktarı : "+toplamOnKurusMiktarı);
	
	kalanKurusMiktarı = kalanKurusMiktarı % 10;
	int toplamBesKurusMiktarı = kalanKurusMiktarı/5;
	System.out.println("Toplam 5 Kurus Miktarı : "+toplamBesKurusMiktarı);
	
	kalanKurusMiktarı = kalanKurusMiktarı % 5;
	int toplamBirKurusMiktarı = kalanKurusMiktarı/1;
	System.out.println("Toplam 1 Kurus Miktarı : "+toplamBirKurusMiktarı);
			
	
}
}
