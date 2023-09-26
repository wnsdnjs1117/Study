package ex4_computer;

public class MacCom extends Computer {

	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("맥 부팅 중!");
	}

}
