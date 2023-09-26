package ex2_lambda;

@FunctionalInterface
// 내가 컴파일러에게 이 인터페이스를 람다식용으로 인터페이스로 쓸 거라 알려주는 역할
// 인터페이스의 추상 메서드는 반드시 1개만 들어가야 된다.
public interface MyFunction {
	// 상수, 추상메서드
	// 인터페이스에 추상메서드는 반드시 하나여야 한다.
	void method(int num);
}
