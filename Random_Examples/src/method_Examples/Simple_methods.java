package method_Examples;

public class Simple_methods {
public static void main(String[] args) {
	System.out.println("1 ile 10 aras�ndaki say�lar�n toplam�  :  " + sum(1, 10));
	System.out.println("5 ile 25 aras�ndaki say�lar�n toplam�  :  " + sum(5, 25));
	System.out.println("8 ile 18 aras�ndaki say�lar�n toplam�  :  " + sum(8, 18));
	System.out.println("�arpmak istedi�iniz say�lar� giriniz : " + Multiplication(5, 34));
	System.out.println("�arpmak istedi�iniz say�lar� giriniz : " + Multiplication(34, 3));
	
}
	public static int sum(int number1, int number2){
		int sum = 0;
		for (int i = number1; i <number2; i++) {
			sum += i;
		}
		return sum;
	}
	public static int Multiplication(int number1, int number2) {
		int multiply = number1 * number2;
		return multiply;
	}
}
