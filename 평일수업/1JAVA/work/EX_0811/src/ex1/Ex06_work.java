package ex1;

import java.util.Scanner;

public class Ex06_work {
	public static void main(String[] args) {
		// 두 개의 정수형 변수를 초기화 한다.(값의 자유)
		// 산술연산자 기호를 담을 문자열 변수를 만든다.
		// switch문을 이용하여 두 정수의 사칙연산을 수행하는 코드를 작성해보자.
		Scanner scan = new Scanner(System.in);
		int num1=20;
		int num2=10;
		String operator="";
		System.out.println("정수를 입력하세요.(1)");
		num1 = scan.nextInt();
		System.out.println("정수를 입력하세요.(2)");
		num2 = scan.nextInt();
		System.out.println("연산자를 입력하세요.");
		operator = scan.next();
		scan.close();
		switch(operator) {
		case "+" : System.out.println(num1+num2);
		break;
		case "-" : System.out.println(num1-num2);
		break;
		case "*" : System.out.println(num1*num2);
		break;
		case "/": System.out.println(num1/num2);
		break;
		}
		
	}
}
