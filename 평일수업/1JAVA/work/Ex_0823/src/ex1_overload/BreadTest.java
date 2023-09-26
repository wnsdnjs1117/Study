package ex1_overload;

public class BreadTest {
//	BreadTest 클래스를 만들어 각기 다른 기능을 하는 makeBread()메서드를 세개 만드는데,
//	BreadMain에서 각각의 메서드를 호출했을 때 다음과 같은 결과를 보고 메서드를 구현하세요.

//	빵을 만들었습니다 -> method 1을 호출한 결과

//	빵을 만들었습니다. -> method 2를 호출한 결과
//	빵을 만들었습니다. -> 
//	....
//	요청하신 빵을 N개 만들었습니다.

//	OO빵을 만들었습니다. -> method 3을 호출한 결과
//	OO빵을 만들었습니다.
//	OO빵을 만들었습니다.
//	....
//	요청하신 빵을 N개 만들었습니다.

	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
	}

	public void makeBread(int n) {
		for (int i = 1; i <= n; i++)
			System.out.println("빵을 만들었습니다.");
		System.out.printf("요청하신 빵을 %d개 만들었습니다.\n", n);
	}

	public void makeBread(String s, int n) {
		for (int i = 1; i <= n; i++)
			System.out.printf("%s을 만들었습니다.\n", s);
		System.out.printf("요청하신 빵을 %d개 만들었습니다.\n", n);
	}

}
