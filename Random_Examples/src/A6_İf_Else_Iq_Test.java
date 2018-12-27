import java.util.Scanner;
public class A6_Ýf_Else_Iq_Test {
	public static void main(String args[]){

		String x, y, z;
		
		
		Scanner answer = new Scanner(System.in);
		//Scanner can declare with new Scanner(Sytem.in)
		//int string double ... different declare.
		//example = answer.nextLine(); for string
		//        = answer.nextÝnt(); for int
		//        = answer.nextDouble(); for double 
		// Scanner can declare need for method (import java.util.Scanner;) 
		
		
		System.out.println("Welcome to ýq test. You will total see three questions. Ýf you answer three questions true.You ýq puan of 130.");
		System.out.println();
		System.out.println("What is long form of ÝMF?");
		System.out.println();
		System.out.println("A) WTF?????");
		System.out.println("B) International Monetary Fund");
		System.out.println("C) International Labour Organization");
		System.out.println("D) Shut the fuck up!");
		System.out.println();
		System.out.println("Answer: ");
		
		x = answer.nextLine();
		
		if(x.equals("b")) {
		System.out.println("Second question");
		System.out.println();
		System.out.println("which is 2002 world cup champion?");
		System.out.println();
		System.out.println("A) Germany");
		System.out.println("B) South Kore");
		System.out.println("C) Turkey");
		System.out.println("D) Brazil");
		System.out.println();
		System.out.println("Answer :");
		}
		else {
			
			System.out.println("False");
			System.out.println("You loser ");

	}
		y = answer.nextLine();	
		
		if(y.equals("d")) {
		System.out.println("Third question");
		System.out.println();
		System.out.println("When is birthday Engin's?");
		System.out.println("A) 24 may 1992");
		System.out.println("B) 24 june 1992");
		System.out.println("C) 21 may 1992");
		System.out.println("D) 21 june 1992");
		System.out.println();
		System.out.println("Answer");
		}
		else {
			
			System.out.println("False");
			System.out.println("You loser ");

	}
		z = answer.nextLine();
		
		if(z.equals("a"))
		System.out.println("You win.You are 130ýq minumum");
		
		else {
			
				System.out.println("False");
				System.out.println("You loser ");

		}
		

	 }

	}


