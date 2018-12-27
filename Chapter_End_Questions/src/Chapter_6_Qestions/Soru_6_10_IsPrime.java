package Chapter_6_Qestions;

public class Soru_6_10_IsPrime {
public static void main(String[] args) {
	printPrime(10000);
}
public static boolean isPrime(int number) {
	int count = 0;
	for (int i = 1; i <number; i++) {
	  if(number%i ==0) {
		  count++;
		  if(count>1) {
			  return false;
		  }
		  
	  }
	}
		  return true;
	
}
public static void printPrime(int number) {
	int a = 2;
	int count = 0; 
	while(a <= number) {
	if(isPrime(a) == true) {
		count++;
		System.out.printf("%6d" , a);
		System.out.print(" ");
		if(count % 20 == 0) {
			System.out.println();
		}
	}
		a++;
	}
}
}
