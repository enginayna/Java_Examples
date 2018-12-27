import java.util.Scanner;

public class En_yuksek_not {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int sum_student_number  = 0;
	int high_note1 = 0;
	int high_note2 = 0;
	String rapor = "";
	String rapor1 = "";
	String student_name1 ="";
	String student_name2 ="";
	
	System.out.println("Toplam öðrenci sayýsýný giriniz : ");
	sum_student_number = input.nextInt();
	int i = 1;
	while(i<=sum_student_number) {
		System.out.println(i+". öðrencinin adýný giriniz : ");
		String student_name = input.nextLine();
		student_name = input.nextLine();
		System.out.println(i + ". öðrencinin notunu giriniz : ");
		int student_note = input.nextInt();
		if(student_note > high_note1) {
			high_note2 = high_note1;
			student_name2 = student_name1;
			
			student_name1 = student_name;
			high_note1 = student_note;
		}
		
		if(student_note < high_note1 && student_note > high_note2) {
			student_name2 = student_name;
			high_note2 = student_note;
		}
			
		i++;
	}
	rapor = "\nEn yüksek notu alan öðrencinin adý : " + student_name1 + " Notu : " + high_note1;
	rapor1 = "\nEn yüksek ikinci notu alan öðrenci : " + student_name2 + " Notu : " + high_note2;
	System.out.println(rapor + rapor1 );
}
}
