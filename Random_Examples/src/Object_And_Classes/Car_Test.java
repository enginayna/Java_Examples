package Object_And_Classes;

public class Car_Test {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "blue";
		car1.doors = 4;
		car1.model = "mercedes";
		car1.motor = "20V";
		car1.wheels = 4;
		
		System.out.println("Color of car is " + car1.color);
		
	}
	
}
