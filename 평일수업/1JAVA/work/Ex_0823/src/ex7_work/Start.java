package ex7_work;

import java.util.Random;
import java.util.Scanner;

public class Start {
	// Start클래스를 생성하여 1~50사이의 난수를 발생시킨다.
	// StartMain 클래스를 만들고 사용자가 키보드를 통해 정수를 입력받습니다.
	// Start클래스에서 사용자가 입력한 숫자를 판단하여 발생한 난수보다 크다면 "down", 작다면 "up"을 문자열로
	// 을 반환하고, 입력한 숫자와 난수가 같을 결우에 프로그램을 종료시키며 몇 회만에 정답을 맞췄는지 판단하기.
	// 단, 정답을 맞춘 경우 프로그램의 종료는 메인클래스에서 이루어지도록 만들자.

	// 숫자 입력 : 30
	// Down
	// 숫자 입력 : 10
	// up
	// 숫자 입력 : 20
	// 3회 만에 정답!
	public void work() {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int num = rand.nextInt(49) + 1;
		int result = 0;
		int count = 0;
		while (num != result) {
			System.out.printf("숫자 입력 : ");
			result = scan.nextInt();
			count++;
			if (num > result)
				System.out.println("Up");
			if (num < result)
				System.out.println("Down");
		}
		System.out.printf("%d회 만에 정답!", count);
	}

}
