package ex2_break;

import java.util.Random;

public class Ex5_work {
	public static void main(String[] args) {

		Random rnd = new Random();
		int randInt = rnd.nextInt(130) + 1;

		int a = 101;
		int b = 101;
		int c = 101;
		// 국어,수학,영어 점수를 1~130의 난수로 생성하여
		// 하나라도 100점을 넘으면 난수를 다시 생성하도록
		// 프로그램을 작성하고
		// 세 과목 모두 점수 범위에 들어간다면 출력하기
		do {
			a=rnd.nextInt(130) + 1;
		} while (a>100);
		do {
			b=rnd.nextInt(130) + 1;
		} while (b>100);
		do {
			c=rnd.nextInt(130) + 1;
		} while (c>100);
		System.out.printf("%d %d %d", a,b,c);
	}

}
