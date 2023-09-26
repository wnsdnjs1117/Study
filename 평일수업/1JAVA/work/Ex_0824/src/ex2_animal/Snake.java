package ex2_animal;

public class Snake extends Animal {
	
	// 메서도 오버라이드(overriding)
	// 메서드의 재정의의 의미를 가진다.
	// 상속관계의 객체에서 부모의 메서드를 자식이 가져와 사용하되
	// 내용만 자식의 상황에 맞게 재정의하고 나머지(함수명 , 매개변수 종류&개수)는 똑같아야 한다.
	// 접근제한은 부모 것보다 넓은 범위에서 사용 가능.
	@Override
	public int getLeg() {
		return 0;
	}

	String sensor = "감각이 좋다";
}

