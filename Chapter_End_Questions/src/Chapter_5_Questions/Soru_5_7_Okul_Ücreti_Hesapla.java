package Chapter_5_Questions;

public class Soru_5_7_Okul_�creti_Hesapla {
public static void main(String[] args) {
	
	int toplam_okul_�creti = 0;
	int okul_�creti = 10000;
	for (int y�l = 1; y�l <15; y�l++) {
		if(y�l<11) {
		System.out.println(y�l + ". y�l okul �creti : " + okul_�creti);
		
		okul_�creti += (okul_�creti*5)/100;
		}
		else {
			okul_�creti += (okul_�creti*5)/100;
			toplam_okul_�creti += okul_�creti; 
		}
	}
	System.out.println("Son 4 y�l�n okul �creti : " + toplam_okul_�creti);
}
}
