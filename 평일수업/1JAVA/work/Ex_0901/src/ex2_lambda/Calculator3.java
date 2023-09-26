package ex2_lambda;

public class Calculator3 {
public static void main(String[] args) {
//	MyFunction mf = num -> System.out.println(num);
	MyFunction mf = System.out::println;
	mf.method(30);
	//::(이중클론) : 메서드 참조 연산자
	//람다식을 보다 간결하게 사용할 수 있도록 해준다.
	//클래스명::함수명
}
}
