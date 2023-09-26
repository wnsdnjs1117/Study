package ex1_InnerClass;
// 내부클래스

// 클래스 안에서 만들어진 또 하나의 클래스로
// 중첩 클래스라고도 부릅니다.

// 두 클래스의 멤버(변수)들 간에 손쉽게 접근이 가능하다.
// 불필요한 클래스를 감춰서 코드의 복잡성을 줄일 수 있다.

// 내부 클래스는 클래스 안에서 선언된 위치에 따라서

// 인스턴스 클래스 : 외부클래스의 멤버변수들과 같은 위치에 생성
// 정적 클래스 : 외부클래스의 변수와 같이 static 키워드를 부여
// 지역 클래스 : 외부클래스의 메서드 내부에서 선언
// 익명 클래스 : 이름이 없는 클래스

class Calculator { // Outer class
	int val1;
	int val2;

	public Calculator(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}

	public class Clac { // Inner class
		public int add() {
			return val1 + val2;
		}
	}

}
