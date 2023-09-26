package ex1_thread;

public class ThreadMain {
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		tt.start(); // run()메서드를 호출하는 메서드

		RunnableTest rt = new RunnableTest();
		Thread t = new Thread(rt);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("메인 함수 실행중 : " + i);
		}
	}
}
