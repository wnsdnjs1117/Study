package ex2_lambda;

public class Calculator4 {
	public static void main(String[] args) {
		// 람다'식'을 매개변수로 사용하기
//		MyCalculator calc = (num1, num2) -> num1 + num2;
//		int result = myCalc(calc);
		
		
		int result = myCalc((num1,num2)->num1+num2);
		System.out.println(result);
	}
	public static int myCalc(MyCalculator calc) {
		return calc.plus(1, 2);
	}
}
