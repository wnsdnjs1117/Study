package ex1_map;

import java.util.HashMap;

public class Ex2_Map {
	public static void main(String[] args) {
		HashMap<String, Float> map = new HashMap<>();
		map.put("k1", 100.0f);
		map.put("k2", 3.14f);
		map.put("k3", 4.15f);

		// map에서 value값을 조회
		float res=map.get("k2");
		System.out.println(res);
		
		// 알고 있으면 유용한 map 메서드
		// containsKey() : map 객체 안에 인자로 전달된 key값이 존재하면 true, 없으면 false
		if(map.containsKey("k3")) {
			System.out.println("k3라는 key가 존재합니다.");
		}
		if(map.containsValue(3.14f)) {
			System.out.println("map에 3.14 value가 존재합니다.");
		}
		//containValue() : map 객체 안에 인자로 전달된 value가 있으면 true, 없으면 false;
		
	}
}
