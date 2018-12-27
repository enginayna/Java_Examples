package method_Examples;

public class Max_Methods {
public static void main(String[] args) {
	double m = max(5.43 , 8.97);
	System.out.println(m);
}
public static double max(double a, double b) {
	return a > b ? a : b;
}
}
