package ex1_Class;

public class ComMain {
	public static void main(String[] args) {
		//생체 생성 방법
		//클래스명 객체명 = new 클래스명();
		Computer com1 = new Computer(); //컴퓨터 1대 생산.
		com1.ssd = 2048;
		
		//다른 클래스에 있는 변수에 접근하는 법
		//객체명.변수명
		
		//참조 클래스에 있는 함수 사용하는 법
		//객체명.함수명();
		com1.getInfo();
		
		Computer com2 = new Computer();
		System.out.println(com2.cpu);
		System.out.println(com2.ssd);
		System.out.println(com2.ram);
		System.out.println(com2.color);
		System.out.println("--------------------");
		
		
	}

}
