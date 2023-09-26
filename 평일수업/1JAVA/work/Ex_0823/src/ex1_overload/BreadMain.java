package ex1_overload;

public class BreadMain {
	public static void main(String[] args) {
		BreadTest bread = new BreadTest();
		bread.makeBread();
		System.out.println();
		bread.makeBread(5);
		System.out.println();
		bread.makeBread("단팥빵",5);
	}

}
