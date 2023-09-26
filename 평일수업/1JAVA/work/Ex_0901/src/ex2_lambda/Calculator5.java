package ex2_lambda;

import java.util.ArrayList;

public class Calculator5 {
	public static void main(String[] args) {
		// 컬렉션 프레임워크와 함수형 인터페이스
		// 컬렉션 프레임워크에는 여러가지의 인터페이스가 존재한다.
		// 그 중 일부는 함수형 인터페이스를 채택하고 있다.

		ArrayList<String> list = new ArrayList<>();
		list.add("이름1");
		list.add("이름2");
		list.add("이름3");
		list.add("이름4");
		list.add("이름5");
		list.forEach(System.out::println);
	}
}


