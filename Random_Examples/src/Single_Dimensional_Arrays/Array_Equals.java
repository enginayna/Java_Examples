package Single_Dimensional_Arrays;

public class Array_Equals {
public static void main(String[] args) {
	int[] array = {1,2,3,4,5};
	int[] arrays = {1,2,3,4,6};
	System.out.println(isItequal(array, arrays));
}
public static boolean isItequal(int[]array, int[]arrays) {
	if(array == arrays) {
		return true;
	}
	if(array != null && arrays == null ) {
		return false;
	}
	if(arrays != null && array == null) {
		return false;
	}
	if(array.length != arrays.length) {
		return false;
	}
	for (int i = 0; i < arrays.length; i++) {
		if(array[i] != arrays[i]) {
			return false;
		}
	}
	return true;
}
}
