import java.util.Scanner;
	public class En_Y�ksek_Not {
	public static void main(String[] args) {
		int sum_student_number = 0;
		String student_name = "";
		int student_note =-1;
		int high_note =0;
		String high_note_student = "";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Toplam �grenci say�s�n� giriniz : ");
		sum_student_number = input.nextInt();
		int i = 1;
		
		while(i<=sum_student_number) {
			
			System.out.println("");
			System.out.println(i+". ��rencinin ad�n� giriniz : ");
			student_name = input.nextLine();
			student_name = input.nextLine();
			System.out.println("");
			System.out.println(i+". ��rencinin notunu giriniz : ");
			
			student_note = input.nextInt();
		
			if(student_note > high_note) {
				high_note = student_note;
				high_note_student = "\nEn y�ksek notu alan ��rencinin ad� : " + student_name;
		    }
			i++;	
		}
		System.out.println(high_note_student);
	}
	}

