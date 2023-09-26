package ex5_Thread;

public class DaemonMain implements Runnable {
	static boolean autoSave = false;

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
			}
			if (autoSave) {
				System.out.println("자동 저장을 실행합니다.");
			}
		}
	}
	
	
	public static void main(String[] args) {
		// 데몬스레드
		// 다른 일반적인 스테들의 작업을 돕는 보조적인 역할을 하는 스레드
		// 함께 구동중인 스데르가 종료되면 데몬스레드도 함께 종료된다.

		DaemonMain dm = new DaemonMain();
		Thread t = new Thread(dm);

		t.setDaemon(true); // t라는 스레드가 데몬스레드임을 명시하는 메서드
		t.start();
		for (int i = 0; i <= 15; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i % 3 == 0) { // 3초 뒤에 자동세이브 시작
				autoSave = true;
			}
		}
		System.out.println("프로그램 종료");
	}
}
