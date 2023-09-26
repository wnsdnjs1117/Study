package ex3_function;

import java.util.HashMap;

public class Ex2_Function {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("id1", "이름1");
		map.put("id2", "이름2");
		map.put("id3", "이름3");
		map.put("id4", "이름4");
		map.put("id5", "이름5");

		// compute() : Map의 value값을 업데이트할 때 사용하는 메서드
//		map.forEach((key, value) -> {
//			map.compute(key, (k , v) -> v + "**");
//		});
		map.compute("id1", (k , v) -> v + "**");
		map.forEach((key, value) -> System.out.printf("key = %s, vlaue = %s\n", key, value));
	}
}
