package ex4_computer;

public class ComputerRoom {
	Computer com1; // 객체의 선언 -> 메모리에 점유 안 되어 있음
	Computer com2;


	public void allPowerOn() {
		com1.powerOn();
		com2.powerOn();
	}
	
	public void allPowerOff() {
		com1.powerOff();
		com2.powerOff();
	}
}
