package ex1_thread;

//스레드를 구현하는 방법
//2. Runnable 인터페이스를 구현
public class RunnableTest implements Runnable {

	@Override
	public void run() {
		// 스레드 작동 시 작업할 내용을 정의한다.
		for (int i = 0; i < 10; i++) {
			System.out.println("스레드 진행중 :" + i);
		}
	}
}