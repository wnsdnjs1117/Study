package ex2_api;

public class Ex4_Wrapper {
	public static void main(String[] args) {
		//프로그램에 따라 기본 자료형의 데이터를 객체형으로 표시해야 하는경우가 있습니다.
		//자바에서 기본자료형을 객체로 다루기 위한 클래스를 제공하는데 이러한 클래스를 Wrapper클래스라고 합니다.
		//기본형의 데이터 타입을 클래스로포장했기 때문에 Wrapp클래스라고 부릅니다.
		
		//int -> Integer
		//char -> Character
		//float -> Float
		//double -> Double
		
		//생성자를 통한 선언은 ㅓ아 1.9부터 사용하지 않는 것을 권장함 (deprecated)
		Integer num01 = new Integer(10);
		Integer num02 = Integer.valueOf(10); // 반환형이 Integer (객체)
		
		Double doubleNum01 =Double.valueOf(30.11);
		
		//실수형 객체 생성
		String str = "3.14";
		double pi = Double.parseDouble(str);
		
		//문자형 객체 생성
		Character ch = Character.valueOf('A');
	}
}
