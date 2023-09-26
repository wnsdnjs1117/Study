package ex6_final;

public class Comic extends Book {
	boolean isColor;

	public Comic(String title, boolean isColor) {
		super(title);
		this.isColor = isColor;
	}
	// info_title 메서드는 오버라이드할 수 없다.

	public void info_color() {
		if (isColor) {
			System.out.println("이 만화책은 컬러입니다.");
		} else
			System.out.println("이 만화책은 흑백입니다.");
	}

}
