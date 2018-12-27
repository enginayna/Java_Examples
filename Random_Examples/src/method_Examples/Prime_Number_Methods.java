package method_Examples;

public class Prime_Number_Methods {
public static void main(String[] args) {
	printPrimeNumber(100);
}
public static void printPrimeNumber(int numberOfPrimeNumber) {
	int primeNumberCount = 0;
	int number =2;
	int line = 11;
	while(primeNumberCount<= numberOfPrimeNumber) {
		if(isPrime(number)) {
			primeNumberCount++;
		
		if(primeNumberCount % line ==0) {
			System.out.println();
		}
		else {
			System.out.printf("%5d", number);
		}
		}
		number++;
	}
}
public static boolean isPrime(int number) {
	int count =0;
	for (int divisor = 2; divisor <= number; divisor++) {
		if(number%divisor == 0) {
			count++;
		}
		if(count > 1) {
			return false;
		}
	}
	return true;
}
}