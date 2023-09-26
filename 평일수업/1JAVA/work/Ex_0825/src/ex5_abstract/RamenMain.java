package ex5_abstract;

public class RamenMain {
	public static void main(String[] args) {
		Ramen c = new Cheese();
		Ramen m = new Mandu();

		c.makeRamen();
		m.makeRamen();

		// 추상클래스와 추상메서드의 용도
		// 자식 클래스간의 공통적인 변수와 메서드의 이름을 공유할 수 있습니다.
		// 반드시 구현해야 하는 메서드를 선언함으로써 공통 규격을 제공합니다.
	}

}