package ex8_work;

import java.util.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Bingo {
	// 컬렉션을 이용해서 5*5의 빙고판 만들기
	// 1~50 사이의 난수 중에서 25개를 뽑아서 Hashset에 추가
	// ArrayList<>(Set); -> set 객체를 리스트로 변환해준다.
	public static void main(String[] args) {
		Random rand = new Random();
		Set<Integer> set = new HashSet<>();
		while (set.size() < 25) {
			set.add(rand.nextInt(50) + 1);
		}
		List<Integer> list = new ArrayList<>(set);
		Collections.shuffle(list);
		int index = 0;
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.printf(" %02d ",list.get(j+5*i));
//				// 1. 외부변수
//				// 2. 차원 배열에 리스트의 요소를 넣고 출력하기
//			}
		int[][] arr = new int[5][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = list.get(index++);
				System.out.printf("%02d ", arr[i][j]);
			}
			System.out.println();
		}
	}
}
