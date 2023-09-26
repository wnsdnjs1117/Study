package ex2_generic;

// 멀티타입 파라미터
// 타입에 두 개 이상을 넣을 수 있고
// 이 경우 각 타입을 콤마로 구분한다.
public class Person<T, M> {
	private T name;
	private M age;

	public Person(T name, M age) {
		this.name = name;
		this.age = age;
	}
	public M getAge() {
		return age;
	}
	public T getName() {
		return name;
	}
}
