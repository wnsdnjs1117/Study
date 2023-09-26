package ex9_interface;

public class Person {
	// 휴대폰을 구입하거나 사용하는 사람 클래스

	Phone p; // 다형성(s폰과 a폰의 객체를 둘 다 받을 수 있다.)

	Person(Phone p) { // 생성자를 통해 받아오거나
		this.p = p;
	}

	// 함수의 매개변수를 통해서 받아오거나
	public void buyNewPhone(Phone p) {
		this.p = p;
		System.out.println(" = = = = = = = = ");
		System.out.println("새 폰을 샀습니다.");
	}

	public void turnOnPhone() {
		p.powerOn();
	}

	public void turnOffPhone() {
		p.powerOff();
	}

	public void watchUtube() {
		if (p.isOn()) {
			p.watchUtube();
		} else {
			System.out.println("폰이 꺼져 있기 때문에 U튜브를 볼 수 없습니다.");
		}
	}
	
	public void charge() {
		p.charge();
	}
}
