package ex2_api;

import java.util.Calendar;
import java.util.Scanner;

public class Ex3_Calendar {
	public static void main(String[] args) {

		// 객체 생성(오늘의 정보)
		Calendar cal = Calendar.getInstance();

		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요.");
		int year = sc.nextInt();
		System.out.println("월을 입력하세요.");
		int month = sc.nextInt();

		// set() : 객체를 특정 날짜로 세팅
		cal.set(year, month - 1, 1);

		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");

		// 달의 마지막 날짜를 구함
		int lastOfDate = cal.getActualMaximum(Calendar.DATE);
		// 지정한 달의 시작하는 요일
		// DAY_OF_WEEK(1~7) : 1이 일요일
		int week = cal.get(Calendar.DAY_OF_WEEK);

		// 달력 시작 날의 요일 처리
		for (int i = 1; i < week; i++) {
			System.out.printf("\t");
		}
		for (int i = 1; i <= lastOfDate; i++) {
			System.out.printf("%d\t", i);
			if (week % 7 == 0) {
				System.out.println();
			}
			week++;
		}
	}
}
