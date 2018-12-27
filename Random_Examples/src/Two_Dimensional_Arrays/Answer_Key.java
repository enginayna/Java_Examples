package Two_Dimensional_Arrays;

public class Answer_Key {
public static void main(String[] args) {
	char[][] answers = new char[10][10];
	char[] key = new char[10];
	randomAnswer(answers);
	randomKey(key);
	examResult(answers, key);
}
public static void randomAnswer(char[][] array) {
	
	for (int line = 0; line < array.length; line++) {
		for (int column = 0; column < array[line].length; column++) {
			char number = (char)((Math.random()*5)+97);	
			array[line][column] = number;
		}
	}
}
public static void randomKey(char[] array) {
	for (int i = 0; i < array.length; i++) {
		char number = (char)((Math.random()*5) + 97);
		array[i] = number;
	}
}
public static void examResult(char[][]array, char[] arrays) {
	int counter = 0;
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			char answer = array[i][j];
			char key = arrays[j];
			if(answer == key) {
				counter++;
			}
		}
		System.out.println((i+1) + ". student true answer number is " + counter);
		counter =0;
	}
}

}
