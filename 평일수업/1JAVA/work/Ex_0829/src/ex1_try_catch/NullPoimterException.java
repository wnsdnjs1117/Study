package ex1_try_catch;

public class NullPoimterException {
	//자바 프로그램을 실행하다보면 갑자기 프로그램이 종료되거나,
	//어떤 원인에 의해 잘못 동작하여 오류가 나타나는 등 예기치 못한 오류가 발생합니다.
	
	//전자의 경우에는 개발자가 해결할 수 없는 시스템 에러가 발생해서 종료된 경우
	public static void main(String[] args) {
		//
		
		
		String str01 = "11";
		String str02 = "11.11";
		
		//정수 형태의 문자열을 정수로 변환
		int num01 = Integer.parseInt(str01);
		System.out.println("String to int : " + num01);
		//실수 형태의 문자열을 정수로 변환
//		int num02 = Integer.parseInt(str02);
//		System.out.println("String to int : " + num02);
		
	}
}
