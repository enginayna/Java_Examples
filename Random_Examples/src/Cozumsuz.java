import java.util.Scanner;

public class Cozumsuz {
public static void main(String[] args) {
	int sum_student_number = 0;
	String student_name = "";
	int student_note =-1;
	int student_name_sayac =0;
	int student_note_sayac = 1;
	int high_note =0;
	String high_note_student = "";
	int y = 1;
	int x = 1;
	int a =0;
	int b =0;
	Scanner input = new Scanner(System.in);
	System.out.println("Toplam �grenci say�s�n� giriniz : ");
	sum_student_number = input.nextInt();
	int i = 1;
	
	
	while(i<=sum_student_number*2) {
		
		if(student_name_sayac<student_note_sayac) {
			System.out.println("");
			System.out.println(x + ". ��rencinin ad�n� giriniz : ");
			b++;
			x++;
		}
		
		if(a<b) {
			
			student_name = input.nextLine();
		}
		
		
		if(student_name_sayac == student_note_sayac){
			System.out.println("");
			System.out.print(y + ". ��rencinin ald�g� notu giriniz : ");
			a++;
			y++;
		}
		
		if(a == b) {
			
			student_note = input.nextInt();
			student_note_sayac += 2;
		}
		student_note_sayac++;
		student_name_sayac += 2;
		
		if(student_note > high_note) {
			high_note = student_note;
			high_note_student = "\n��rencinin ad� : " + student_name;
		
		
		
	}
		i++;	
	
	}
	System.out.println("Toplam ��renci say�s� : " + sum_student_number);
	System.out.println("\nEn y�ksek notu alan ��rencinin ad� : " + high_note_student);
	
	
}
}
