package Chapter_5_Questions;

public class Soru_5_13_Kup_Bulma {
public static void main(String[] args) {
	int n = 1;
	
	int count =0;
	while(n >0 && count <1) {
		int n3 =n*n*n;
		if(n3>12000) {
		System.out.println(n-1);
			count++;
		}
		
		n++;
	}
	
}
}
