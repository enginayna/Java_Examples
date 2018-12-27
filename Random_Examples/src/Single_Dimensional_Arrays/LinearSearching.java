package Single_Dimensional_Arrays;

import java.util.Scanner;

public class LinearSearching {
	public static void main(String[] args) {
		String[] aile = { "Ahmet", "Zeynep", "Gamze", "Engin", "Sevgi","yok" };
       Scanner input = new Scanner(System.in);
       System.out.println("Aile'de aramak istediðiniz kiþinin ismini giriniz : ");
       String search = input.nextLine();
       String result = familySearch(aile, search);
       
       
       System.out.println("Sonuc : " + result);
	}

	public static String familySearch(String[] family, String search) {
	
		for (int i = 0; i < family.length; i++) {
			
			if (family[i].equalsIgnoreCase(search)) {
				
				return family[i];
			}
		}
		return family[family.length-1];
	
	}
}
