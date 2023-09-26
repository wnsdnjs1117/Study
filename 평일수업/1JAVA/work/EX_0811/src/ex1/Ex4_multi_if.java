package ex1;

import java.util.Scanner;

public class Ex4_multi_if {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// if문의 중첩
		// 제어문은 자유롭게 주첩해서 사용할 수 있습니다.
		// if문 안에 if문이 있는 경우

		// it(조건식1){
		// if(조건식2){
		// //조건식 1, 2가 모두 참일 때 실행할 명령
		// }
		// }

		// 숫자를 하나 입력받아서
		// 해당 숫자가 5의 배수이면서 홀수이면 "5의 배수이면서 홀수입니다."
		// 홀수가 아니면 "5의 배수이면서 짝수입니다." 출력
		// 5의 배수가 아니면 "5의 배수가 아닙니다" 출력하는 프로그램 작성하기."
		int num1 = 0;
		System.out.println("정수를 입력하세요.");
		num1 = scan.nextInt();
		System.out.println(num1);
		if (num1 % 5 == 0) {
			if (num1 % 2 == 0) {
				System.out.println("5의 배수이면서 짝수입니다.");
			} else {
				System.out.println("5의 배수이면서 홀수입니다.");
			}
		} else {
			if (num1 % 2 == 0) {
				System.out.println("5의 배수가 아니면서 짝수입니다.");
			} else {
				System.out.println("5의 배수가 아니면서 홀수입니다.");
			}
		}
	}
}
