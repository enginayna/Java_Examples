package Object_And_Classes;

import java.util.Date;
import java.util.Random;

public class Date_Class {
public static void main(String[] args) {
	Date date = new Date();
	System.out.println(date.toString());
	
	//Random class
	
	Random number = new Random();
	for (int i = 0; i <10; i++) {
		System.out.print(number.nextInt(100)+ " ");
	}
	System.out.println();
	Random r = new Random(4);
	for (int i = 0; i < 10; i++) {
		System.out.print(r.nextInt(10) + " ");
	}
	System.out.println();
	Random s = new Random(4);//random a gönderilen parametre baska nesnede ayný ise ayný random sayýlarý üretir.
	for (int i = 0; i < 10; i++) {
		System.out.print(s.nextInt(10) + " ");
	}
	
}
}
