package ex3_Computer;

public class ComMain {
	public static void main(String[] args) {
		Computer com1 = new Computer();
//	com1.brand	// private이기 때문에 접근이 불가능!
		com1.setBrand("apple");

		String brand = com1.getBrand();
		System.out.println(brand);
	}
}
