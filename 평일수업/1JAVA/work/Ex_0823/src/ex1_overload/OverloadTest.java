package ex1_overload;

public class OverloadTest {
	// 메서드 오버로드(오버로딩) : 메서드의 '중복정의'라고 하며 하나의 클래스 내에서
	// 같은 이름을 가진 메서드가 여러 개 정의되는 것

	// 메서드 오버로드의 규칙
	// 1) 메서드의 이름이 같아야 한다.
	// 2) 파라미터의 개수가 달라야 한다.
	// 3) 파라미터의 개수가 같다면 타입이 달라야 한다.
	// 4) 파라미터의 개수가 같다면(2개 이상) 순서가 달라야 한다.

	// IF the number of parameters is the same, the type  must be different

	public void result() {
		System.out.println("인자가 없는 메서드");
	}

	public void result(int n) {
		System.out.println("정수를 인자로 받는 메서드");
	}

	public void result(char c) {
		System.out.println("문자를 인자로 받는 메서드");
	}

	public void result(String s, int n) {
		System.out.println("문자열과 정수를 인자로 받는 메서드");
	}

	public void result(int n, String s) {
		System.out.println("정수와 문자열을 인자로 받는 메서드");
	}

}
