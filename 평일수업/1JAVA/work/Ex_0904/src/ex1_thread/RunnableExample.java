package ex1_thread;

public class RunnableExample {
	public static void main(String[] args) {
		Runnable white =() -> {
			while (true) {
				System.out.println("백기 올려");
			}
		};
		Thread t = new Thread(white);
		t.start();
	}
}
