package ex5_super;

public class Child extends Parent{
	public Child(int n) {
		//super();가 생략되어 있다.
		//부모클래스의 생성자가 파라미터를 받기 시작하면 생략할 수 없다.
		super(n);
		System.out.println("자식(Child)클래스");
	}
}
