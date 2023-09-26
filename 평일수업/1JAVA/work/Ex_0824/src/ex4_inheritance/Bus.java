package ex4_inheritance;

public class Bus extends Car {
	private int peopleNum; // 승객 수

	public Bus(int peopleNum) {
		this.peopleNum = peopleNum;
	}

	public void takePerson() {
		System.out.println("승객이 버스에 탑승했습니다.");
		peopleNum++;
		System.out.println("지금까지 탑승한 승객은 " + peopleNum+"명 입니다.");
	}
}
