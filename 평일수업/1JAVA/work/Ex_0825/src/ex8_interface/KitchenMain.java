package ex8_interface;

public class KitchenMain {
	public static void main(String[] args) {
		Kitchen k = new Kitchen();
		System.out.println("짜장면 : "+ k.jajjang());
		System.out.println("탕수육 : "+ k.tangsuyuk());
		System.out.println("볶음밥 : "+ k.bokkembab());
	}
}
