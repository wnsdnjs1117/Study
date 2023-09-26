package ex2_method;

public class MethoTestMain {
	public static void main(String[] args) {
		int su = 100;

		MethodTest me1 = new MethodTest();

		me1.test(su);

		System.out.println(su);

		int n = me1.add(2, 5);
		System.out.println(n);
		
		me1.f1();
		me1.f2();
		me1.f3(9);
		me1.f4(13);

	}
}
