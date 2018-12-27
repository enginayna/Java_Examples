package method_Examples;

import java.util.Scanner;

public class Calculater {
public static void main(String[] args) {
	System.out.println("----OPERATÝONS----");
	System.out.println("__________________");
	System.out.println();
	System.out.println("1 : Toplama Ýþlemi");
	System.out.println("2 : Çýkarma Ýþlemi");
	System.out.println("3 : Bölme Ýþlemi");
	System.out.println("4 : Çarpma Ýþlemi");
	System.out.println("5 : Çýkýþ");
	Scanner input = new Scanner(System.in);
	System.out.println("Yapmak istediðiniz iþlemi seçiniz(Rakam olarak) : ");
	int scan = input.nextInt();
	inputOperation(scan);
	
}
public static int sum(int number1, int number2) {
	int sum = number1 + number2;
	return sum;
}
public static double sum(double number1, double number2) {
	double sum = number1 + number2;
	return sum;
}
public static double sum(double number1 , int number2) {
	double sum = number1 + number2;
	return sum;
}
public static double sum(int number1, double number2) {
	double sum = number1 + number2;
	return sum;
}
public static int multiplication(int number1 , int number2) {
	int multiplication = number1*number2;
	return multiplication;
}
public static double multiplication(double number1 , int number2) {
	double multiplication = number1*number2;
	return multiplication;
}
public static double multiplication(int number1 , double number2) {
	double multiplication = number1*number2;
	return multiplication;
}
public static double multiplication(double number1 , double number2) {
	double multiplication = number1*number2;
	return multiplication;
}
public static double division(int number1 , int number2) {
	double division = number1/number2;
	return division;
}
public static double division(double number1 , int number2) {
	double division = number1/number2;
	return division;
}
public static double division(int number1 , double number2) {
	double division = number1/number2;
	return division;
}
public static double division(double number1 , double number2) {
	double division = number1/number2;
	return division;
}
public static int suptraction(int number1 , int number2) {
	int suptraction = number1-number2;
	return suptraction;
}
public static double suptraction(int number1 , double number2) {
	double suptraction = number1-number2;
	return suptraction;
}
public static double suptraction(double number1 , int number2) {
	double suptraction = number1-number2;
	return suptraction;
}
public static double suptraction(double number1 , double number2) {
	double suptraction = number1-number2;
	return suptraction;
}
public static void operation() {
	System.out.println("----OPERATÝONS----");
	System.out.println("__________________");
	System.out.println();
	System.out.println("1 : Toplama Ýþlemi");
	System.out.println("2 : Çýkarma Ýþlemi");
	System.out.println("3 : Bölme Ýþlemi");
	System.out.println("4 : Çarpma Ýþlemi");
	System.out.println("5 : Çýkýþ");
	Scanner input = new Scanner(System.in);
	System.out.println("Yapmak istediðiniz iþlemi seçiniz(Rakam olarak) : ");
	int scan = input.nextInt();
	
	inputOperation(scan);
	}
public static void inputOperation(int scan) {
	while(scan>0 && scan<6) {
	
	Scanner input = new Scanner(System.in);
	if(scan ==1) {
		System.out.println("1.sayý : ");
		int number1 = input.nextInt();
		System.out.println("2.sayý : ");
		int number2 = input.nextInt();
		System.out.println("Sonuç : " + sum(number1, number2));
		System.out.println();
		operation();
    }
	else if(scan ==2) {
		System.out.println("1.sayý : ");
		int number1 = input.nextInt();
		System.out.println("2.sayý : ");
		int number2 = input.nextInt();
		System.out.println("Sonuç : " + suptraction(number1, number2));
		System.out.println();
		operation();
    }
	else if(scan ==3) {
		System.out.println("1.sayý : ");
		double number1 = input.nextDouble();
		System.out.println("2.sayý : ");
		double number2 = input.nextDouble();
		System.out.println("Sonuç : " + division(number1, number2));
		System.out.println();
		operation();
	}
	else if(scan ==4) {
		System.out.println("1.sayý : ");
		int number1 = input.nextInt();
		System.out.println("2.sayý : ");
		int number2 = input.nextInt();
		System.out.println("Sonuç : " + multiplication(number1, number2));
		System.out.println();
		operation();
    }
	else if(scan == 5) {
		System.out.println("Çýkýþ yapýldý.");
	break;
	}
	
	
	}
	while(scan<1 && scan>5) {
		System.out.println("Hatalý tuþlama yaptýnýz. Lütfen tekrar deneyin");
		System.out.println();
		operation();
	}
}
}


