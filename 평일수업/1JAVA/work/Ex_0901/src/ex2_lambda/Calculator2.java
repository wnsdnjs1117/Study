package ex2_lambda;

public class Calculator2 {
	public static void main(String[] args) {
		MyCalculator calc = (x, y) -> x + y;
		MyCalculator calc2 = (a, b) -> a + b;
		int result = calc.plus(20, 30);
		System.out.println(result);
	}

}
