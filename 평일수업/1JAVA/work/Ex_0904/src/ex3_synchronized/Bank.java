package ex3_synchronized;

public class Bank {
	private volatile int money;

	public synchronized int  getMoney() {
		return money;
	}

	
	//하나의 스레드가 메서드를 점유하고 있을 때
	//다른 스레드가 점유하지 못하도록 막는 키워드
	public synchronized void addMoney(int  money) {
		this.money += money;
	}
}
