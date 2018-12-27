package Single_Dimensional_Arrays;

public class LettersCountOfArray {
	public static void main(String[] args) {
		char[] randomCh = getRandomArray();
		printRandomArray(randomCh);
		printLetterCount(letterCount(randomCh));
	}

	public static char[] getRandomArray() {
		char[] random = new char[100];

		for (int i = 0; i < random.length; i++) {
			random[i] = (char) ((int) (Math.random() * 26 + 97));
		}
		return random;

	}

	public static void printRandomArray(char[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + "  ");

			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}
	public static int[] letterCount(char[] letterNumber) {
		int[] count = new int [26];
		for (int i = 0; i < letterNumber.length; i++) {
			count[letterNumber[i]-97]++;
		}
		return count;
	}
	public static void printLetterCount(int [] count) {
		for (int i = 0; i < count.length; i++) {
			System.out.println(((char)(97 + i)) + " " +  count[i]);
		}
		
	}
}
