package ex1;

import java.util.Scanner;

public class Ex06_Calendar {
	public static void main(String[] args) {

//		 정수형 변수를 하나 만들어서 정수를 하나 초기화 하고
//		 해당 달이 며칠까지 있는지 switch문을 이용하여 작성하세요.

//		31일 = 1,3,5,7,8,10,12
//		30일 = 4,6,9,11
//		28일 = 2

		Scanner scan = new Scanner(System.in);

		int month = 0;

			System.out.println("몇 월 입니까?");
			month = scan.nextInt();

			switch (month) {
			case 2:
				System.out.println(month + "월은 28일까지 있습니다");
				break;
			case 4, 6, 9, 11:
				System.out.println(month + "월은 30일까지 있습니다");
				break;
			case 1, 3, 5, 7, 8, 10, 12:
				System.out.println(month + "월은 31일까지 있습니다");
				break;
			}
		}
	}