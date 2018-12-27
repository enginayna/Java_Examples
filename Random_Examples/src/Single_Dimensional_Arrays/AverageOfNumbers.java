package Single_Dimensional_Arrays;

import java.util.Scanner;

public class AverageOfNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ortalamasý alýnacak sayý adeti : ");
		int averagenumber = input.nextInt();
		double sum = 0;
		double[] number = new double[averagenumber];
		for (int i = 0; i < averagenumber; i++) {
			System.out.println((i+1)+". sayý : ");
			number[i] = input.nextDouble();
			
			sum += number[i];
		}
		double average = (double)(sum/averagenumber);
		System.out.println("average of numbers : " + average);
		int count = 0;
		int count1=0;
		for (int i = 0; i < number.length; i++) {
			if(average>number[i]) {
				System.out.println("Küçüktür" + number[i]);
				count++;
			}
			else {
				System.out.println("Büyüktür" + number[i]);
				count1++;
			}
			
		}
		
		System.out.println("ortalamadan küçük olanlarýn sayýsý : " + count);
		System.out.println("Ortalamadan büyük olanlarýn sayýsý : " + count1);
		
	}
}

