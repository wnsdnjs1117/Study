package ex1_generic;

//제네릭스
//일반적인 코드를 작성하고 이 코드를 다양한 타입의 객체에 대하여 재사용하는 객체지향 기법
//객체의 타입을 컴파일할 때 체크하기 때문에 객체의 타입에 대한 한정성을 높이고
//형변환을 해야 하는 번거로움을 줄일 수 있다.

public class GenEx<T> {
	// public class 클래스명<T>{}
	// public interface 인터페이스명<T>{}
	// T는 Type의 첫 글자를 따옴, 다른 글자를 써도 무방함
	private T value;

	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
}
