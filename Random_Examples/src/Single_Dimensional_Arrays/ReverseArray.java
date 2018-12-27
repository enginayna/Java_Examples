package Single_Dimensional_Arrays;

public class ReverseArray {
public static void main(String[] args) {
	int[] team = {07,25,30,41,43,77,34};
	int result[] = reverse(team);
	String sonuc = "";
	for (int i = 0; i < result.length; i++) {
		
		sonuc += result[i] + " "; 
	}
	
	System.out.println(sonuc);
}
public static int[] reverse(int[] list) {
	int[] result = new int [list.length];
	
	for (int i = 0 , j = result.length-1 ; i < list.length; i++ , j--) {
		result[j] = list[i];
	}
	return result;
}
	
}
