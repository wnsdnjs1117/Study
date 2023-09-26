package ex3_function;

import java.util.function.Function;

public class Ex3_Function {
	public static void main(String[] args) {
		// Function의 합성
		// 두 람다식을 합성해서 새로운 람다식을 만들 수 있다
		// f.andThen(g) -> f를 먼저 적용하고 g를 적용한다.
		// f.compose(g) -> g를 먼저 적용하고 f를 적용한다.
		
		Function<String,Integer> f = s-> Integer.parseInt(s,12);
		System.out.println(f.apply("1B"));
		Function<Integer,String> g = i-> Integer.toBinaryString(i);
		System.out.println(g.apply(255));
		Function<String,String> h = f.andThen(g);
		System.out.println(h.apply("1B")); // FF -> 255 -> 11111111
		Function<Integer, Integer> h2 = f.compose(g);
		System.out.println(h2.apply(2)); // 2 ->2진수로-> 10 ->16진수를 10진수로-> 16
	}
}
