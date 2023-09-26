package ex3_function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Ex4_Function {
	public static void main(String[] args) {
		// 메서드의 참조
		// 람다식의 하나의 메서드만 호출하는 경우 메서드 참조를 활용하여 람다식을 간결하게 할 수 있다.
		// 클래스명::메서드명, 객체명::메서드명으로 사용할 수 있다.

		Function<String, Integer> f = Integer::parseInt;
		
		BiFunction<String, String, Boolean> g = String::equals;
		System.out.println( g.apply("dd","dd"));
	}
}
