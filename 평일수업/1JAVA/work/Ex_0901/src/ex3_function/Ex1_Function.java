package ex3_function;

import java.util.ArrayList;

public class Ex1_Function {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		list.removeIf(x -> x % 2 == 0);
		System.out.println(list);
	}
}
