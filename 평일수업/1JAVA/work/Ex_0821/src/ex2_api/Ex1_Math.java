package ex2_api;

public class Ex1_Math {
	public static void main(String[] args) {
		// 수학에서 자주 사용하는 상수들과 함수를 구현해놓은 클래스

		// 올림
		System.out.println("3.51올림 : " + Math.ceil(3.515 * 10) / 10);

		// 내림
		System.out.println("3.51올림 : " + Math.floor(13.61));

		// 반올림
		System.out.println("3.51올림 : " + Math.round(13.5)); // 반환형이 long(정수)값임

		// 절대값 구하기
		System.out.println("3.51올림 : " + Math.abs(-4.55));
		System.out.println("3.51올림 : " + Math.abs(-50));

		// 최댓값 구하기
		int maxValue = Math.max(30, 60);
		
		//최솟값 구하기
		int minValue = Math.min(40,70);
		System.out.println("30, 60 중 최대값 :"+ maxValue);
		System.out.println("40, 70 중 최솟값 :"+ minValue);

	}
}
