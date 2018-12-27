package Chapter_7_Questions;

import java.util.Scanner;

public class Soru_7_1_Student_Note {
	public static void main(String[] args) {
		int studentNumber = getStudentNumber();
		int[]studentNote = getStudentNote(studentNumber);
		int bestNote = findBestNote(studentNote);
		findLetterNote(studentNote, bestNote);
		
		
	}

	public static int findBestNote(int[] array) {
		int bestNote = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > bestNote) {
				bestNote = array[i];
			}
		}
		return bestNote;
	}

	public static int[] getStudentNote(int number) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[number];
		for (int i = 0; i < array.length; i++) {
			System.out.println((i+1) + ". student note : ");
			array[i] = input.nextInt();
		}
		return array;
	}

	public static int getStudentNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Sum student number is : ");
		int number = input.nextInt();
		return number;
	}
	public static void findLetterNote(int[]array, int bestnote) {
		for (int i = 0; i < array.length; i++) {
			if(bestnote-10<=array[i]) {
				System.out.println((i+1) + ". student letter note : A"  );
			}
			else if(bestnote-20 <= array[i]) {
				System.out.println((i+1) + ". student letter note : B"  );
			}
			else if(bestnote-30 <= array[i]) {
				System.out.println((i+1) + ". student letter note : C"  );
			}
			else if(bestnote-40 <= array[i]) {
				System.out.println((i+1) + ". student letter note : D"  );
			}
			else {
				System.out.println((i+1) + ". student letter note : F"  );
			}
		}
	}

}
