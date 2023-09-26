package ex1_array;

import java.util.Scanner;

public class Ex2_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문자형 배열
		char[] ch;
		ch = new char[4];

//		char[] ch = {'j','a','v','a'};

		// 배열의 각각의 방에 데이터를 넣기

		ch[0] = 'j';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';

		// 배열의 내용 출력하기
		// 배열의 크기 : 배열명.length
		// 주의 : 배열의 마지막 index번호는 항상 배열명.length-1 이다.
		for (int i = 0; i < ch.length; i++) {
			System.out.printf("ch[%d] : %c\n", i, ch[i]);
		}

		// 문자형 배열은 이름만 가지고 출력하는 것이 가능하다.
		System.out.println(ch);

		String[] str = new String[3];
		str[0] = "hello";

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		//null : 아무것도 없다.

		System.out.println(str);
	}
}
