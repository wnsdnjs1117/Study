package ex1_api;

import java.util.Scanner;

public class Ex5_work {
	public static void main(String[] args) {
		// 화문 구하기
		// 회문이란 앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문장을 말한다
		// 키보드에서 세 글자 이상의 문장을 입력받은 뒤 해당 문장이 회문이 아닌지를 판단하는 로직을 구현하자\
		
		System.out.println("문자열을 입력하세요.");
		StringBuilder sb = new StringBuilder();
		Scanner scan = new Scanner(System.in);

		sb.append(scan.nextLine());
		scan.close();
		
		// 동등성 비교를 위해 String 형식으로 변환
		if (sb.toString().equals(sb.reverse().toString())) {
			System.out.println(sb+"는 회문입니다.");
		} else {
			System.out.println(sb+ "는 회문이 아닙니다.");
		}
		
	// 		String으로 변환하지 않고 동등성 비교하려면 equals 재정의 해야함
		
	//		if (sb.equals(sb.reverse())) {
	//			System.out.println("회문입니다.");
	//		} else {
	//			System.out.println("회문이 아닙니다.");
	//		}
	}
}
