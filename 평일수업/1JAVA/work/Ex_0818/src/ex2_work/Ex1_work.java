package ex2_work;

public class Ex1_work {
	public static void main(String[] args) {
		// 배열 arr에 담겨 있는 모든 값의 합을 출력하세요.
		int[] arr = { 10, 20, 30, 40, 50 };
		int result = 0;
		for (int num : arr) {
			result += num;
		}
		System.out.println(result);
	}

}
