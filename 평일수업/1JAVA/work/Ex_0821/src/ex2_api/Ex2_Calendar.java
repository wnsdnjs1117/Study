package ex2_api;

import java.util.Calendar;

public class Ex2_Calendar {
	public static void main(String[] args) {
		//Calendar : 날짜와 시간에 대한 정보를 제공하는 클래스
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;	// 1월이 0이기 때문에 +1 해줘야 한다.
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("오늘 날짜는 %d년 %d월 %d일 입니다.",year,month,day);
		
		
	}
}
