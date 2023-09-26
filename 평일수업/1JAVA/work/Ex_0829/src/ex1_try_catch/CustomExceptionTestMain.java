package ex1_try_catch;

import java.util.Scanner;

public class CustomExceptionTestMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputString = "";
		System.out.println("정수를 입력하세요");
		try {
			inputString = scan.next();
			int num = Integer.parseInt(inputString);
			System.out.println("결과 : " + num);
		} catch (NumberFormatException e) {
			System.out.println(inputString + "는 정수가 아닙니다!");
		} finally {
			if (scan != null) {
				scan.close();
			}
		}
	}
}


