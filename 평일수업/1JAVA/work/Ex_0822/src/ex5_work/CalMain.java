package ex5_work;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 클래스로 계산기 만들어보기 문제
		// CalTest클래스를 만들고
		// 사칙연산을 해주는 getResult()함수를 만듭니다.
		// main에서 키보드에서 두 개의 숫자와 연산자를 입력받은 뒤
		// getResutlt()함수로 전달하여 계산하고 결과를 반환해보세요.
		System.out.print("첫 번째 숫자 입력 : ");
		int a = scan.nextInt();
		System.out.print("\n두 번째 숫자 입력 : ");
		int b = scan.nextInt();
		System.out.print("\n연산 기호 입력 : ");
		String c = scan.next();
		scan.close();

		int num = CalTest.getResult(a, b, c);
		System.out.println(num);
		// 첫 번째 숫자 입력 : 5
		// 두 번째 숫자 입력 : 10
		// 연산 기호 입력 : +
		// 결과 : 15
	}

}
