package ex6_static;

public class Number {
	static int num = 0;
	int num2 = 0;
	public static void main(String[] args) {
		Number number1 = new Number();
		
		Number number2 = new Number();
		number1.num++; // 정적변수 num1을 1 증가시킴
		number1.num2++; // 멤버변수 num2을 1 증가시킴
		
		System.out.println(number2.num); //1
		System.out.println(number2.num2); //0
	}

}
