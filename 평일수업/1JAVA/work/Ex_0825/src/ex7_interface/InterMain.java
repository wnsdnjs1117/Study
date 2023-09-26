package ex7_interface;

public class InterMain {
	public static void main(String[] args) {
		// 인터페이스도 일반적인 방법으로는 객체화가 불가능합니다.
		// InterTest it = new InterTest();
		InterChild ic = new InterChild();
		System.out.println("getA() : " + ic.getA());
	}
}
