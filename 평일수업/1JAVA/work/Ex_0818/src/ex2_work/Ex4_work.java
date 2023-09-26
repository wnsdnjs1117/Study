package ex2_work;

import java.util.Random;

public class Ex4_work {
	public static void main(String[] args) {
		// 1~45 사이의 난수를 발생시켜 로또번호를 생성하는
		// 프로그램 만들기
		int num = 0;
		Random rand = new Random();
		int[] rotto = new int[6];
		int index = 0;

		while (index != rotto.length) {
			// apply가 1이면 통과
			int apply = 1;
			// 중복값 확인
			for (int i = 0; i < rotto.length; i++) {
				num = rand.nextInt(45) + 1;
				if (rotto[i] == num) {
					apply = 0;
				}
			}
			// apply가 1이면 값 입력
			if (apply == 1) {
				rotto[index] = num;
				index++;
			}
		}
		// 출력
		System.out.print("번호는 : ");
		for (int result : rotto) {
			System.out.printf("%d ", result);
		}
	}
}
