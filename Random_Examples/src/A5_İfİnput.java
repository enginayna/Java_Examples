import java.util.Scanner;
public class A5_›f›nput {
	public static void main(String args[]) {
	  int exam_result;
	  
	  Scanner student_note = new Scanner(System.in);
	  
	  System.out.println("Do you exam result enter :");
	  
	  exam_result =student_note.nextInt();
	  
	  if(exam_result <= 40 ) {
	  
	      System.out.println("FF");
	      System.out.println("You failed this lesson.");
	  }
	  if (exam_result<=50 && exam_result >40) {
	      System.out.println("DD");
	  }
	  if (exam_result<= 65 && exam_result >50)
		  System.out.println("CC");
	  
	  if (exam_result<= 80 && exam_result >65)
		  System.out.println("BB");
	  
	  if (exam_result<= 90 && exam_result >80) {
		  System.out.println("AA");
	      System.out.println("Bravo! You buyed hight puan.");
	 
	  }
	  
		
	  }
	}

