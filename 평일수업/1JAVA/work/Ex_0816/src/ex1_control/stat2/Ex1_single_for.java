package ex1_control.stat2;

import java.util.Scanner;

public class Ex1_single_for {
	public static void main(String[] args) {
		/*
		 * 반복문 for, while for : 조건에 따라 명령을 반복할지 반복하지 않을지 결정하는 문법
		 * 
		 * 기본형 (초기식;조건식;증감식){ 반복실행하고자 하는 명령}
		 * 
		 * 초기식 : 반복을 하기 위한 시작값 보통 변수를 하나 초기화 넣어놓는다. 조건식 : 반복을 하기 위한 종료값 비교연산자를 많이 사용한다.
		 * 증감식 : 초기식의 변수의 값을 증감시켜주는 역할
		 * 
		 */
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}

		// 1. 내가 반복할 명령이 뭔지 확실하게 알기
		// 2. 몇 번 반복할 건지 체크
		// 3. 변수 i를 사용할 수 있으면 사용하고
		// 사용할 필요 없으면 사용 안 해도 됨

		// 1부터 10까지 출력하는 for문 작성하기
		// 1 2 3 4 5 6 7 8 9 10

		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d ", i);
		}

		System.out.printf("\n");

		// 10부터 1까지 감소하는 for문 작성하기/

		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d ", 10 - i);
		}

		// 1~10까지 총합 구하기
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		// 정수형 변수 N에 키보드에서 값을 입력 받고
		// 1~N까지의 총합 구하여 출력하기
		Scanner scan1 = new Scanner(System.in);
		double num3 = 0;
		double num4 = 0;
		double result=0;
		System.out.println("정수를 입력하세요.");
		num3 = scan1.nextInt();
		System.out.println("정수를 입력하세요.");
		num4 = scan1.nextInt();
		result=(num3+num4)*(Math.abs(num3-num4)+1)*100/2/100;
		System.out.println(result);

		//단을 하나 입력 받고 해당 구구단 출력하기
		Scanner scan2 = new Scanner(System.in);
		int num=0;
		System.out.println("단을 입력하세요.");
		num=scan2.nextInt();
		for(int i=0;i<10;i++) {
			System.out.printf("%d x %d = %d\n", num,i, num*i);
		}
	}
}
