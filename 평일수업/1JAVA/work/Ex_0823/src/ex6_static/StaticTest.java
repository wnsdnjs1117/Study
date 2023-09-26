package ex6_static;

public class StaticTest {
	// static 변수(정적변수) : 정적 변수를 갖고 있는 클래스를 아무리 많이 객체를 만든다고 해도 메모리에는 딱 한 번만 생성이 된다.

	int num = 10;
	static int snum = 10;

	public void changeNumber() {
	num += 10;
	}

//	public static void main(String[] args) {
//		int num = 10;
//		StaticTest st =new StaticTest();
//		st.changeNumber(snum);
//		System.out.println("함수 출력 후 num : "+num);
//		
//		//static변수는 사용할 때 객체를 생성하지 않아도 된다.
//		//클래스명.변수명
//		Static
//	}
}
