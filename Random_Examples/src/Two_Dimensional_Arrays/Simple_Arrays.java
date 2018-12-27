package Two_Dimensional_Arrays;

public class Simple_Arrays {
public static void main(String[] args) {
	int[][] array = new int[4][4];
	array[0][3] = 7;
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			System.out.print(array[i][j] + " ");
		}
		System.out.println();
	}
	String[][] arrays = new String[7][7];
	String[] arrayss = {"engin", "ahmet", "zeynep", "sevgi", "gamze","nazým","feqo","halid","sefa","sarý","gökhan","cemal","serhat"};
	String a;
	for (int i = 0; i < arrays.length; i++) {
		
		for (int j = 0; j < arrays[i].length; j++) {
			int number = (int)(Math.random()*13);
			a = arrayss[number];
			arrays[i][j] = a;
			System.out.print(a + "   ");
		}
		System.out.println();
	}
	
}

}
