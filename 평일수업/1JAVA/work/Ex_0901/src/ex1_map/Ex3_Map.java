package ex1_map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex3_Map {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);

		Scanner scan = new Scanner(System.in);
		System.out.println("id : ");
		String k = scan.next();
		if (!map.containsKey(k)) {
			System.out.println("아이디가 없습니다.");
		} else
			System.out.println("pw : ");
		int v = scan.nextInt();
//			if (map.get(k).equals(v)) {
		if (map.get(k) == v) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
}
