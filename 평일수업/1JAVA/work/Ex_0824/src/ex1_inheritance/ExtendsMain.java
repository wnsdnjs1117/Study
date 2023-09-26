package ex1_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		Child c1 = new Child(); // 자식 객체 생성
		System.out.println(c1.car);
		
		//Child클래스의 객체 c1은 Parent클래스를 상속 받는 상태이므로
		//부모로부터 상속 받은 money, str등의 속성을 마음대로 가져다가 사용할 수 있다.
		System.out.println(c1.money);
		System.out.println(c1.str);
		
		Parent p1 = new Parent();
		System.out.println(p1.money);
		System.out.println(p1.str);
		//상속관계라고 할지라도 부모클래스는 자식 클래스의 속성을 마음대로 가져다가 사용할 수 없다.
		
		System.out.println(c1.hashCode());
		System.out.println(p1.hashCode());
		
		//instanceof 연산자
		//객체명 instanceof 클래스명
		//객체가 해당 클래스의 타입이면 true
		// 아니면 false
		
		if(c1 instanceof Parent) {
		System.out.println("c1은 Parent타입입니다.");
		}
		if(c1 instanceof Child) {
		System.out.println("c1은 Child타입입니다.");
		}
		
		// 자바의 상속의 특징
		// 한 명의 자녀가 두 명의 부모를 갖는 것은 불가능하다.
		// 한 명의 부모는 여러 명의 자식을 갖는 것이 가능하다.
		
		// 계속 상위로 올라가다보면 상속 관계의 최상위에는 Object.
		// Object는 모든 타입을 받아들일 수 있는 최상위 객체이다.
		
	}
}
