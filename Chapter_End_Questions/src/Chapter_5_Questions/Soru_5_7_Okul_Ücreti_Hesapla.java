package Chapter_5_Questions;

public class Soru_5_7_Okul_Ücreti_Hesapla {
public static void main(String[] args) {
	
	int toplam_okul_ücreti = 0;
	int okul_ücreti = 10000;
	for (int yýl = 1; yýl <15; yýl++) {
		if(yýl<11) {
		System.out.println(yýl + ". yýl okul ücreti : " + okul_ücreti);
		
		okul_ücreti += (okul_ücreti*5)/100;
		}
		else {
			okul_ücreti += (okul_ücreti*5)/100;
			toplam_okul_ücreti += okul_ücreti; 
		}
	}
	System.out.println("Son 4 yýlýn okul ücreti : " + toplam_okul_ücreti);
}
}
