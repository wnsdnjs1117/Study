package ex6_final;

public class BookMain {
	public static void main(String[] args) {
		Comic comic = new Comic("원피스", false);
		comic.info_title();
		comic.info_color();
	}
}

// Car클래스는 gasGauge 변수를 갖고 있고, (생성자로 값 지정)
// 잔여 가스량을 출력하는 showCurrentgauge()메서드를 갖고 있다.

// HybridCar클래스는 electricGauge 변수를 갖고 있고, Car클래스를 상속 받는다.
// 생성자를 통해 gasGauge와 electricGauge를 전달 받는다.
// 메서드는 오버라이딩을 하여 잔여 가스량과 잔여 전기량을 출력

// HybridWaterCar 클래스는 waterGauge 변수를 갖고 있고, HybridCar클래스를 상속 받는다.
// 생성자를 통해 gasGauge, electricGauge와 waterGauge의 값을 전달 받는다.
// 메서드는 오버라이딩을 하여 잔여 가스량과 잔여 전기량, 잔여 물의 양 출력

// main에서 HybridWater객체를 생성하여 잔여 연료량 모두 출력하기

// ex)
// 잔여 가스량 : 15
// 잔여 전기량 : 30
// 잔여 물의양 : 45;