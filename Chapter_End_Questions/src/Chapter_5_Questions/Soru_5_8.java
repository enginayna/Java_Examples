package Chapter_5_Questions;
import java.util.Scanner;

public class Soru_5_8 {
public static void main(String[] args) {
	int sum_student = 0;
	int high_note = 0;
	String student_name = "";
	int student_note = -1;
	String high_note_student = "";
	Scanner input = new Scanner(System.in);
	System.out.println("Toplam öðrenci sayýsýnýz giriniz : ");
	sum_student = input.nextInt();
	int asd = 1;
	while(asd <= sum_student) {
		
		int sayac = 1;
	while(sayac<=sum_student) {
			
			System.out.println(sayac + ". öðrencinin adýný giriniz : ");
			student_name = input.nextLine();
		sayac++;
		break;
	}
	int k = 1;
	while(k<=sum_student) {
		System.out.println(sayac + ". öðrencinin aldýðý notu giriniz");
		student_note = input.nextInt();
		
		if(student_note > high_note) {
			high_note = student_note;
			high_note_student = "\nÖðrencinin adý : " + student_name;
		}
	k++;
	break;
	}
	asd++;
	}	

	System.out.println("En yüksek notu alan öðrenci : " +high_note_student);
}
}
