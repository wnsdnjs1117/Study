package ex6_final;

public class Book {
	// final 키워드는 상수를 뜻하는 키워드
	// 상수 : 한 번 초기화 한 후 다시 값을 대입할 수 없다는 의미

	// 클래스에 final을 추가할 경우 상속의 마지막 클래스임을 의미합니다.
	// 어떠한 클래스도 이 클래스의 자식클래스가 될 수 없고, 이 클래스는 어떤 클래스의 부모클래스도 될 수 없다.

	String title;

	public Book(String title) {
		this.title = title;
	}

	// final 메서드
	// 상속은 받을 수 있더라도, 오버라이딩 할 수 없는 메서드
	public final void info_title() {
		System.out.println("책의 제목은 : " + title + "입니다.");
	}
}
