package ex9_interface;

public interface Phone {
	// 어차피 인터페이스 안에서는 상수라고 인식하기 때문에
	// final을 생략해도 된다.
	static int MAX_BATTERY_CAPACITY = 100;

	// 하나의 인터페이스에 꼭 추상메서드가 하나일 필요는 없다.
	public void powerOn();
	public void powerOff();
	public boolean isOn();
	public void watchUtube();
	public void charge();
}
