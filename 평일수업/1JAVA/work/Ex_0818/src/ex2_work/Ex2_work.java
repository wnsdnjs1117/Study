package ex2_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		// 프로그램이 실행되면 배열의 크기를 몇으로 할 건지 물어본다.
		// 입력한 값을 배열의 크기로 설정
		// 배열의 크기만큼 알파벳을 넣어서 출력하기

		// 배열의 길이를 몇으로? 5
		// ABCDE

		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 크기는?");
		int leng = scan.nextInt();
		char[] result = new char[leng];
		for (int i = 0; i < result.length; i++) {
				result[i] += ('A' + i);
			}
		System.out.println(result);
		}
	}