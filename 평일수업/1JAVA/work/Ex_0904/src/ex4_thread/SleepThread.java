package ex4_thread;

public class SleepThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(1000); // TIMED_WAITING
				System.out.println(i);
			} catch (Exception e) {
				System.out.println("sleep error");
			}
		}
	}
}
