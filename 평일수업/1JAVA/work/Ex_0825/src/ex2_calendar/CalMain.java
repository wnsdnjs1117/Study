package ex2_calendar;

public class CalMain {
public static void main(String[] args) {
	DeskCalendar dc = new DeskCalendar("보라색", 6);
	dc.info();
	dc.hanging();
	dc.onTheDesk();
	
	System.out.println();
	
	Calendar c = new DeskCalendar("검은색", 12);

	c.info();
	c.hanging(); // -> 오버라이딩 된 메서드가 호출이 된다.
	// c객체가 Calendar의 타입을 가졌지만 DeskCalendar의 객체이기 때문에
	// 오버라이딩된 hanging()이 호출됐다.
	//c.ontTheDest();
	
	// 가상메서드?
}
}
