package ex1_thread;

//스레드를 구현하는 첫 번째 방법
//Thread 클래스를 상속 받는다.
public class ThreadTest extends Thread {

	@Override
	public void run() {
		// 스레드 작동 시 작업할 내용을 정의한다.
		for (int i = 0; i < 10; i++) {
			System.out.println("스레드 진행중 :" + i);
		}
	}
}
