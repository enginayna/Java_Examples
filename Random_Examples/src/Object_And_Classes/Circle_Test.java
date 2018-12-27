package Object_And_Classes;

public class Circle_Test {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.radius = 12;
		circle.area();
		circle.perimeter();
		System.out.println(circle.radius + " " + circle.area() + " " + circle.perimeter());
	}
		
}
