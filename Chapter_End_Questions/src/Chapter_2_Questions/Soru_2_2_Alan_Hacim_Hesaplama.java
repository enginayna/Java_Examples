package Chapter_2_Questions;
import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Soru_2_2_Alan_Hacim_Hesaplama {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Alan ve Hacim hesaplamak i�in silindirin yar��ap�n� ve y�ksekli�ini giriniz : ");
	double yar�cap = input.nextDouble();
	double yukseklik = input.nextDouble();
	double alan = yar�cap*yar�cap*3;
	System.out.println("Silindirin Alan� : " + alan);
	System.out.println("Silindirin Hacmi : " + (alan*yukseklik));
	
}
}
