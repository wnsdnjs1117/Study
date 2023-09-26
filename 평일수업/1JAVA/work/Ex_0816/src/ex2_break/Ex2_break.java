package ex2_break;

public class Ex2_break {
	public static void main(String[] args) {
		// 기타 제어문
		// 제어문의 흐름을 조금 더 세밀하게 할 수 있게 해주는 문법
		// break, continue

		// 기타제어문은 반복문 내에서만 사용이 가능합니다.
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j % 2 == 0) {
					break;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		int n = 1;
		while(true) {
			System.out.println(n);
			n++;
			//n > 10일 때 break로 while문 빠져나오기
			if(n>10) {
				break;
			}
		}
	}

}
