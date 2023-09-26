package ex5_abstract;

// 추상 메서드가 한 개 이상 정의되어 있는 클래스를 추상 클래스라고 한다.
// 추상 클래스 또한 abstract를 통해 자신이 추상 클래스임을 명시해줘야 한다.
public abstract class AbsParent {
	int value = 100;

	public int getValue() { // 일반적인 메서드
		return value;
	}

	// 추상메서드(abstract method)
	// 다형성을 위해 메서드의 선언은 통일을 해야하지만 실제로 구현하는 내용은 자식 클래스마다 달라야 할 때
	// 부모클래스의 메서드는 비워두고 자식 클래스에서 오버라이딩 하여 구현할 수 있도록 하는 클래스

	// 접근제한 abstract 반환형 메서드명(매개변수);
	public abstract void setValue(int n);
}
