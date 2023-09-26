package ex1_api;

public class Ex1_String {
	public static void main(String[] args) {

		// 자바로 만들어진 모든 프로그램은 클래스로 이루어져 있다.
		// 우리가 문자열을 저장하기 위해 사용하던 String도 자바 내에 저장되어 있는 클래스
	
		//String 클래스는 두 가지 특징을 가지고 있다.
		//1) 객체 생성방법이 두 가지(암시적, 명시적)
		//2) 한 번 생성된 문자열의 내용은 변하지 않는다.( 불변의 법칙 )
		
		String s1 = "abc"; //암시적 객체 생성 (Boxing)
		String s2 = "abc";
		
		//이미 앞에 같은 문자열로 생성된 암시적 객체가 있다면
		//앞서 생성된 객체의 주소를 재사용한다.
		
		String s3 = new String("abc"); // 명시적 객체 생성
		String s4 = new String("abc");
		
		if(s1.equals(s3)) {
			System.out.println("값이 같습니다.");
		}	else {
			System.out.println("값이 다릅니다.");
		}
		
	}
}
