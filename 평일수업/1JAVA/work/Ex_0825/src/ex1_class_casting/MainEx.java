package ex1_class_casting;

public class MainEx {
	public static void main(String[] args) {
		// 형변환
		// 하나의 자료형 -> 다른 자료형으로 변환
		double d = 100;

		// 클래스의 자동 타입변환
		// 클래스의 자동 타입 변환은 상속 관계에 있는 자식클래스를 부모 타입의 객체로 변환하는 것을 말합니다.

		// 부모클래스 (사용자 정의 자료형) 객체명 = new 자식클래스();

		// 자식클래스명 객체명 = new 자식클래스();
		// 부모클래스 객체명 = 자식 객체;

		Parent p1 = new Parent(); // 부모 객체의 생성
		Child c1 = new Child(); // 자식 객체의 생성

		Parent p2 = new Child(); // 자동 타입 변환
		Parent p3 = c1; // 자동 타입 변환

		// Child c2 = p1; // 자동 타입 변환이 안 됨

		c1.info_Child();
		// p2.info_Child();
		// 부모타입으로 바꾸면 자식에게 있던 메서드는 사용할 수 없다.
	}
}
