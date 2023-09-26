package ex5_Thread;

import java.util.Scanner;
// 스캐너를 이용하여 키보드에서 숫자를 입력받고
// 스레드에서 입력 받은 숫자가 1씩 감소하다가 0이 되었을 때
// "종료"라는 메세지와 함께 스레드를 빠져나오도록 만들어보자.

public class CountMain {
	static int staticCount = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		staticCount = scan.nextInt();
		scan.close();
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				while (staticCount > 0) {
					try {
						Thread.sleep(100);
						staticCount--;
						System.out.println(staticCount);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println("종료");
			}
		});
		th.start();
	}
}
