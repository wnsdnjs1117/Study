package ex4_computer;

public class WindowsCom extends Computer{

	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("윈도우 부팅 중!");
	}

}
