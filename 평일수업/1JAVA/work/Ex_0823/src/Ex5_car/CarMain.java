package Ex5_car;

public class CarMain {
	public static void main(String[] args) {
		Car car1 = new Car("현대", "white", 3000);
		Car car2 = new Car("현대", 3000);
		Car car3 = new Car();
		
		System.out.println(car3.brand);
		System.out.println(car3.color);
		System.out.println(car3.price);
		
	}


}
