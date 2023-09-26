package ex5_abstract;

public class Cheese extends Ramen {
	String cheese = "치즈";

	@Override
	public void makeRamen() {
		System.out.printf("%s %s %s\n", nudle, soup, cheese);
	}
}
