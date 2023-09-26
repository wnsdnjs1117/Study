package ex3_bike;

public class BikeMain {
	public static void main(String[] args) {
		// 클래스의 강제 타입 변환
		// 부모타입으로 변환을 했을 때는 자식클래스의 요소들에는
		// 접근을 할 수 없으므로 다시 자식타입으로 변경해줘야 한다.

		// ((자식타입)부모타입객체).메서드(); // 1회
		// 자식클래스 객체명 = (자식클래스)부모객체 // 여러 번
		
		Bike b = new FourWheelBike("윤기");
		b.info();
		b.ride();
		((FourWheelBike)b).info();
		System.out.println();
		FourWheelBike fwb = (FourWheelBike) b;
		fwb.info();
		fwb.ride();
		fwb.addWheel();
		fwb.info();
	}
}
