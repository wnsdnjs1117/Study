package ex5_Thread;
//QuizThread 클래스를 만들어 스레드를 상속받는다.

//startGame()메서드를 만들고 그 안에서 1 ~ 100 사이의
//난수 두 개 를 더하는 문제를 출제한다.
//키보드에서 답을 입력하여 5문제가 정답처리 될 때 까지 로직을 반복한다.

import java.util.Random;
import java.util.Scanner;

//정답을 맞히고 난 후 모든 문제를 맞히는데 까지 몇 초가 걸렸는지 출력하고 종료.

public class QuizThread extends Thread {
	Scanner scan = new Scanner(System.in);
	int seconds = 0;
	int count = 0;
	final int playCount = 5;

	public void startGame() {
		while (count != playCount) {
			int ranNum1 = new Random().nextInt(10) + 1;
			int ranNum2 = new Random().nextInt(10) + 1;
			System.out.println(ranNum1 + " + " + ranNum2 + " = ");
			int userNum = 0;
			try {
				userNum = Integer.parseInt( scan.next());
			} catch (Exception e) {
			}
			if (userNum == ranNum1 + ranNum2) {
				System.out.println("맞았습니다!");
				count++;
			} else {
				System.out.println("틀렸습니다!");
			}
			continue;
		}
		System.out.println(seconds + "초");
	}

	@Override
	public void run() {
		while (count != playCount) {
			try {
				sleep(1000);
				seconds++;
			} catch (Exception e) {
			}
		}
	}
}
