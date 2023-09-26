package ex9_interface;

public class PhoneMain {
	public static void main(String[] args) {
//		ApplePhone ap = new ApplePhone();
//		Person jimin = new Person(ap);
		Person jimin = new Person(new ApplePhone());
		jimin.turnOnPhone();

		for (int i = 0; i < 6; i++) {
			jimin.watchUtube();

			if (i % 3 == 0) {
				jimin.charge();
			}
		}
		jimin.buyNewPhone(new SamsungPhone());
		jimin.turnOnPhone();

		for (int i = 0; i < 6; i++) {
			jimin.watchUtube();

			if (i % 3 == 0) {
				jimin.charge();
			}
		}
		//인터페이스를 사용함으로써 다양한 장점이 있다.
		//실제 구현 클래스의 내용을 전혀 보지 않고도 개발 코드로 샛체를
		//-> 정보 은닉
		//구현 클래스들이 독립적으로 사용될수 있습니다. 개발 코드에서 객체의 변경이 필요할 때
		//개발 코드의 수정을 최소화 할 수 있습니다.
		//-> 모듈화
	}

}
