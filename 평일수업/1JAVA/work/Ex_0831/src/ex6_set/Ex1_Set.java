package ex6_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Iterator;


public class Ex1_Set {
	public static void main(String[] args) {
		// set
		// 중복된 값을 허용하지 않는다.
		// index가 없기 때문에 개별의 요소에 접근할 수 없다.

		// Hash Set의 생성
		Set<String> hs1 = new HashSet<>();

		// HashSet에 데이터 추가하는 법
		hs1.add("b");
		hs1.add("a");
		hs1.add("f");
		hs1.add("d");
		System.out.println(hs1);

		// Set에는 중복되는 값을 추가할 수 없다.
		hs1.add("a");
		hs1.add("b");
		System.out.println("hs1의 요소의 개수 : " + hs1.size());

		// Set에 해당 요소가 들어있는지 검증
		System.out.println("a의 유무 : " + hs1.contains("a"));

		// Set의 요소의 제거
		hs1.remove("f");
		System.out.println(hs1);

		// Set에 들어있는 모든 요소 삭제하기
		hs1.removeAll(hs1); // or
		hs1.clear();
		System.out.println(hs1);

		Set<Integer> hs2 = new HashSet<>();
		// 1 ~ 45 사이의 난수를 생성하여 hs2에 6개 채우기
		Random ran = new Random();
		while (hs2.size() < 6) {
			hs2.add(ran.nextInt(45) + 1);
		}
		System.out.println(hs2);

		// Set -> 배열형태로 변환
		// Integer[0] : 배열의 방 개수를 0으로 잡으면
		// Set이 add해둔 요소의 개수만큼 방을 자동으로 만든다.
		Integer[] arr = hs2.toArray(new Integer[0]);
		System.out.println(Arrays.toString(arr));
		for(Integer i : arr) {
			System.out.print(i+" ");
		}
		Iterator<Integer> iter = hs2.iterator();
		while(iter.hasNext()) {
			int val = iter.next();
			System.out.print(val+" ");
		}
	}
}
