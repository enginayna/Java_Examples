package Chapter_7_Questions;

import java.util.Scanner;

public class Soru_7_35_Game {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Adam asmaca oyununa hosgeldiniz.\n");
	System.out.println("3 yanlýþ hakkýnýz var. \n");
	System.out.println("Rassal olarak karþýnýza çýkacak kelime * sayýsý kadar harften oluþmaktadýr. \n");
	System.out.println("Tahmin ettiðiniz harf var ise kelimenin içinde görünecektir.\n");
	System.out.println("Tahmin etmeniz gereken kelime  : " + starNumbers());
	char[] word = wordOfLetters();
	String star = starNumbers();
	char[] starLetters = starOfLetters();
	int counter = 3;
	for (int i = 0; i < word.length; i++) {
		int count = 1;
		for (int j = 0; j < starLetters.length; j++) {
			System.out.print(starLetters[j]);
		}
		System.out.println("\n" + (i+1) + ". tahmin :");
		String tahmin =input.next();
		char d = tahmin.charAt(0);
		
		for (int j = 0; j < word.length; j++) {
			
			if(d == word[j]) {
				 starLetters[j]= d;
				count--;
			}
			
		}
		if(count>0) {
				counter--;
				System.out.println(counter + " hakkýnýz kaldý.");
			
		}
		
		
	}
}

public static char[] wordOfLetters() {
	String a = findWord();
	char[] word = new char[a.length()];
	for (int i = 0; i < word.length; i++) {
		word[i] = a.charAt(i);
	}
	return word;
}
public static char[] starOfLetters() {
	String star = starNumbers();
	char[] word = new char[star.length()];
	for (int i = 0; i < word.length; i++) {
		word[i] = star.charAt(i);
	}
	return word;
}
public static String starNumbers() {
	String word = findWord();
	String star = "";
	for (int i = 0; i < word.length(); i++) {
		star += ""+"*"; 
	}
	return star;
}

public static String findWord() {
	String[] words = {"fenerbahce","galatasaray","realmadrid","barcelona"};
	int number = (int)(Math.random()*4);
	return words[number];
}

}
