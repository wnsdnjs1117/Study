package ex2_calendar;

public class DeskCalendar extends Calendar {
	public DeskCalendar(String color, int months) {
		super(color, months);
	}

	@Override
	public void hanging() {
		System.out.printf("%s 달력을 걸기 위해 고리가 추가로 필요합니다.\n",color);
	}
	public void onTheDesk() {
		System.out.printf("%s 달력을 책상에 세울 수 있습니다.\n",color);
	}
}
