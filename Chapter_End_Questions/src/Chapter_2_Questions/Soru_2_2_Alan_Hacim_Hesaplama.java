package Chapter_2_Questions;
import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Soru_2_2_Alan_Hacim_Hesaplama {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Alan ve Hacim hesaplamak için silindirin yarýçapýný ve yüksekliðini giriniz : ");
	double yarýcap = input.nextDouble();
	double yukseklik = input.nextDouble();
	double alan = yarýcap*yarýcap*3;
	System.out.println("Silindirin Alaný : " + alan);
	System.out.println("Silindirin Hacmi : " + (alan*yukseklik));
	
}
}
