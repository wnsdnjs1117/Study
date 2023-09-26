package ex2_method;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MethodTest {

	public void test(int n) {
		n++;
		System.out.println("n : " + n);
	}

	// 두 수를 더하는 함수
	public int add(int x, int y) {
		return x + y;
	}

	// 1~10까지 출력하는 f1()함수 만들기
	public void f1() {
		System.out.println(Arrays.toString(IntStream.rangeClosed(1, 10).toArray()));
	}

	// 1부터 10까지 총합을 반환하는 f2()함수 만들기
	public void f2() {
		System.out.println(IntStream.rangeClosed(1, 10).sum());
	}

	// 매개변수로 단으 하나 받아서 구구단을 출력하는 함수인 f3() 작성하기
	public void f3(int x) {
		for (int i = 2; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", x, i, x * i);
		}
	}
	public void f4(int n) {
		System.out.println(IntStream.rangeClosed(1, n).sum());
	}

	//함수의 종류
	//1. input이 있고 output이 있는 경우
	//2. input이 있고 output이 없는 경우
	//3. input이 없고 output이 있는 경우
	//4. input이 없고 output이 없는 경우
	
}
