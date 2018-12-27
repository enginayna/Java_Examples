package Chapter_5_Questions;

public class Soru_5_12_Kare_Bulma {
public static void main(String[] args) {
	int n = 1;
	int count = 0;
 
	while(n > 0 && count <1){
		
		int n2 = (int)Math.pow(n, 2);
		
		if(n2>12000) {
			
			System.out.println(n);
			count++;
		}
		n++;
	}
		
		
	
}
}
