package ex4_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex4_Work {
	public static void main(String[] args) {
		List<String> idDB = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		while (true) {
			String str = scan.next();
			if (Collections.frequency(idDB, str) == 1) {
				System.out.println(str + "은 중복된 값입니다.");
			} else {
				idDB.add(str);
				idDB.forEach(s -> System.out.println(s));
			}
		}
	}
}
