package ex1_map;

import java.util.HashMap;
import java.util.Map;

public class Ex1_Map {
	public static void main(String[] args) {
		// Map구조는 Key(키)와 value(값)이 하나의 데이터로 저장
		// Map 인터페이스를 구현한 클래스에는 HashMap, TreeMap, LinkedHashMap
		// index가 없지만 key값이 index의 역할을 대신한다.
		// 많은 양의 데이터를 조회하는데 있어서 매우 뛰어난 성능을 발휘

		Map<Integer, Character> map = new HashMap<>();

		// map에 데이터 추가하기
		map.put(100, 'A');
		map.put(20, 'B');
		map.put(48, 'C');

		// map에는 중복되는 value를 추가할 수 있다.
		map.put(7, 'A');

		// map에 key값은 중복될 수 없다.
		// map.put(100, 'F');
		// 존재하는 key가 있다면 value를 갱신해버린다.
		map.replace(100, 'F'); // ???

		// map에 없는 key로 value를 추가하면 추가
		// map에 없는 key로 value를 추가하면 갱신

		// map에서 데이터 삭제하기
		// key를 통해서 해당 value를 삭제해야 한다.
		map.remove(100);

		System.out.println(map);

		// map의 크기
		System.out.println("map의 사이즈 : " + map.size());
	}
}
