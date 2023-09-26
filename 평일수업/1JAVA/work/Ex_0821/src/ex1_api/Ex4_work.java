package ex1_api;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {
		// 키보드에서 알파벳을 무작위로 입력받는다.
		// 입력받은 문자열에서 소문자 a가 몇 개 있는지 판별하는 로직 구현하기

		// 입력 : asdasd
		// 결과 : 2
		
		int count = 0;
		System.out.println("문자열을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		for (Character a : str.toCharArray()) {
			if (a == 'a') {
				count++;
			}
		}
		System.out.println("결과 : "+count);
	}
}
