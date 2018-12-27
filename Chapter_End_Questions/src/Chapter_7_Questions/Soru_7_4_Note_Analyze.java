package Chapter_7_Questions;

import java.util.Scanner;

public class Soru_7_4_Note_Analyze {
public static void main(String[] args) {
	int[] array = sumNoteEnter();
	printNoteAnalyze(array);
	
}

public static int[] sumNoteEnter() {
	int array[] = new int[100];
	int count = 0;
	Scanner input = new Scanner(System.in);
	for (int i = 0; i < array.length; i++) {
		System.out.println((i+1) + ". note : ");
		
		array[i] = input.nextInt();
		
		if(array[i]<0) {
			break;
		}
		count++;
	}
	int[] arrays = new int[count];
	for (int i = 0; i < arrays.length; i++) {
		arrays[i] = array[i];
	}
	return arrays;
}
public static double avarageNote(int[]array) {
	double sum = 0;
	for (int i = 0; i < array.length; i++) {
		sum += array[i];
	}
	double avarege = (double)(sum / array.length);
	return avarege;
}

public static void printNoteAnalyze(int[]array) {
 double avarege = avarageNote(array);
 int avaregeUnderCount = 0;
 int avaregeEqualCount = 0;
 int avaregeOnCount = 0;
 for (int i = 0; i < array.length; i++) {
	if(array[i]<avarege) {
		avaregeUnderCount++;
	}
	else if(array[i]>avarege) {
		avaregeOnCount++;
	}
	else {
		avaregeEqualCount++;
	}
}
 System.out.println("Sum note number is : " + array.length);
 System.out.println("Averege under note number is : " + avaregeUnderCount);//Note number of under average is...
 System.out.println("Average on note number is : " + avaregeOnCount);
 System.out.println("Average equal note number is : " + avaregeEqualCount);
 System.out.println("Note number of average is " + avarege);
}


}
