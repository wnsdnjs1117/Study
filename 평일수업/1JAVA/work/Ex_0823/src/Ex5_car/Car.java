package Ex5_car;

public class Car {
	// 생성자 오버로딩
	String brand;
	String color;
	int price;

	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public Car(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	public Car() {
		this("kia","white",4000);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
