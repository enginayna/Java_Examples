import java.util.Scanner;

public class ParaMiktar�Hesapla {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Hesaplacak T�rk Liras�n� Giriniz : �rn: 25,45");
	double toplamParaMiktar� = input.nextDouble();
	System.out.println("Toplam para miktar� : "+toplamParaMiktar�);
	
	toplamParaMiktar� *=100;
	int toplamTlMiktar� =(int)toplamParaMiktar�/100;
	System.out.println("Toplam Tl Miktar� : "+toplamTlMiktar�);
	
	int kalanKurusMiktar� = (int)toplamParaMiktar� % 100;
	int toplamelliKurusMiktar� = kalanKurusMiktar�/50;
	System.out.println("toplam 50 Kurus Miktar� : "+toplamelliKurusMiktar�);
	
	kalanKurusMiktar� = kalanKurusMiktar� % 50;
	int kalanyirmibesKurusMiktar� = kalanKurusMiktar�/25;
	System.out.println("Toplam 25 Kurus Miktar� : "+kalanyirmibesKurusMiktar�);
	
	kalanKurusMiktar� = kalanKurusMiktar� % 25;
	int toplamOnKurusMiktar� = kalanKurusMiktar�/10;
	System.out.println("Toplam 10 Kurus Miktar� : "+toplamOnKurusMiktar�);
	
	kalanKurusMiktar� = kalanKurusMiktar� % 10;
	int toplamBesKurusMiktar� = kalanKurusMiktar�/5;
	System.out.println("Toplam 5 Kurus Miktar� : "+toplamBesKurusMiktar�);
	
	kalanKurusMiktar� = kalanKurusMiktar� % 5;
	int toplamBirKurusMiktar� = kalanKurusMiktar�/1;
	System.out.println("Toplam 1 Kurus Miktar� : "+toplamBirKurusMiktar�);
			
	
}
}
