package ex1_control.stat2;

public class Ex4_do_while {
	public static void main(String[] args) {
		// while문은 선비교 후처리지만
		// do-while문은 선처리 후비교를 하기 때문에
		// 조건에 맞지 않아도 무조건 한 번은 실행하게 된다.

		int i = 0;
		do {
			i++;
			System.out.println(i);
		} while (i<0);

	}
}
