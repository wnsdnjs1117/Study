package ex3_synchronized;

class AddThread implements Runnable {
	private volatile Bank b;
	private volatile String name;

	public AddThread(String name, Bank b) {
		this.name = name;
		this.b = b;
	}

	@Override
	public void run() {
		//블럭동기화
		//특정 영역만 동기화 처리
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(100); // 1초동안 중지
				b.addMoney(1000);
				System.out.println(name + "현재 잔고 : " + b.getMoney());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	};
}

public class BankMain {
	public static void main(String[] args) {
		Bank b = new Bank();
		Thread t1 = new Thread(new AddThread("1번", b));
		Thread t2 = new Thread(new AddThread("2번", b));
		t1.start();
		t2.start();
	}
}
