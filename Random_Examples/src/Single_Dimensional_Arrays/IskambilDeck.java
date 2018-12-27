package Single_Dimensional_Arrays;

public class IskambilDeck {
public static void main(String[] args) {
	String[] sortArray = {"Kupa" , "Karo" , "Maça" , "Sinek"};
	String[] numberArray = {"As" , "Papaz" , "Kýz" , "Vale" , "10" ,"9" , "8" , "7", "6" , "5" , "4" ,"3" , "2"};
	
	int[] deckArray = new int[52];
	
	for (int i = 0; i < deckArray.length; i++) {
		deckArray[i] = i;
	}
	
	for (int i = 0; i < deckArray.length; i++) {
		int random = (int)(Math.random()*52);
		
		int temp = deckArray[i];
		deckArray[i] = deckArray[random];
		deckArray[random] = temp;
		
	}
	
	for (int i = 0; i < deckArray.length; i++) {
		
		String sort = sortArray[deckArray[i]/13];
		String number = numberArray[deckArray[i] % 13];
		
		if(i % 13 == 0) {
			System.out.println();
		}
		
		System.out.print(sort + " " + number + "  ");
	}
}
}
