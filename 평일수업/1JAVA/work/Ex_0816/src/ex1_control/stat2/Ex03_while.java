package ex1_control.stat2;

import java.util.Scanner;

public class Ex03_while {
	public static void main(String[] args) {
		// while문 :ㅣ 간편한 구성을 가진 반복문(선비교 후처리)

		// 기본형
		// while(조건문){
		// 조건식이 참일 때 반복할 명령
		// }

		// while문은 for문 처럼 초기식과 증감식이 같이 존재하지
		// 않기 때문에 따로 설정을 해줘야 한다.

		int i = 0;

		while (i < 3) {
			System.out.println(i);
			i++;
		}

		Scanner sc = new Scanner(System.in);
		int n = 0;
		while(n != -1) {
			System.out.println("정수 입력 : ");
			n = sc.nextInt();
			
			if(n == -1) {
				System.out.println("-1이 입력되었습니다.");
			}
		}
		//강제로 무한루프 만들기
		while(true) {
			System.out.println(1);
		}
	}
}
