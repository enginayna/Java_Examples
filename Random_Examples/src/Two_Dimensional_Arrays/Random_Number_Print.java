package Two_Dimensional_Arrays;

public class Random_Number_Print {
	public static void main(String[] args) {
		int[][] array = new int[10][10];
		findRandomNumber(array);
		printRandomNumber(array);
		System.out.println("Sum of random number is : " + randomNumberSum(array));
		lineSum(array);
		printColumn(array);
		biggestIndex(array);
		shuffleArray(array);

	}
	public static void printColumn(int[][]array) {
		int[] column = new int [10];
		int sum = 0;
		int counter = 0;
		for (int i = 0; i < array[counter].length; i++) {
			for (int j = 0; j <array.length; j++) {
				sum += array[j][i]; 
			}
			column[i] = sum;
			sum = 0;
		}
		for (int i = 0; i < column.length; i++) {
			System.out.println((i+1)+ ".column sum is : " + column[i]);
		}
		
		
	}

	public static int randomNumberSum(int[][] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		return sum;
	}

	public static void findRandomNumber(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 100);
			}
		}
	}
	public static void printRandomNumber(int[][]array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%3d" , array[i][j]);
			}
			System.out.println();
		}
	}
	public static void lineSum(int[][] array) {
		int[] line = new int[10];
		int sum = 0;
		int highestLine = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
			line[i] = sum;
			sum = 0;
		}
		for (int i = 0; i < line.length; i++) {
			System.out.println((i+1) + ". line sum is : " + line[i]);
			if(line[i]>highestLine) {
				highestLine = line[i];
			}
		}
		System.out.println("Highest line sum is : " + highestLine);
	
	}
	public static void biggestIndex(int[][]array) {
		int biggestNumber = 0;
		int column=0;
		int line=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(array[i][j]>biggestNumber) {
					biggestNumber = array[i][j];
					column = j;
					line = i;	
				}
				 
			}
		}
		System.out.println("Biggest number is : " + biggestNumber);
		System.out.println("Biggest number is here : " + line +".line " + column + ".column" );
	}
	public static void shuffleArray(int[][]array) {
		
		int shuffle =0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				int line = (int)(Math.random()*10);
				int column = (int)(Math.random()*10);
				
				shuffle = array[i][j];
				array[i][j] = array[line][column];
				array[line][column] = shuffle;
			}
		}
		printRandomNumber(array);
	}
	
}
