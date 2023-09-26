package ex5_abstract;

public class Mandu extends Ramen {
	String mandu = "만두";

	@Override
	public void makeRamen() {
		System.out.printf("%s %s %s\n", nudle, soup, mandu);
	}
}
