package ex4_computer;

public class Computer {
	//다형성
	//하나의 타입으로 여러가지 객체를 사용할 수 있는 것
	//클래스의 타입변환이 존재하는 이유는 다형성을 구현하기 위함이다.
	
	//객체가 특정 클래스의 변수가 되면서, 하나의 부품처럼 사용될 수 있다.
	//이때 부품을 굧체해야 할 일이 생기면 다형성을 통해 코드의 수정을 최소화 할 수 있다.

	public void powerOn() {
		System.out.println("컴퓨터의 전원 켜기");
	}
	
	public void powerOff() {
		System.out.println("컴퓨터가 종료됩니다.");
	}

}
