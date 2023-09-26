package ex1_api;

public class Ex2_StringBuilder {
	public static void main(String[] args) {
		//String 객체는 문자열 연산이 많은 경우 성능이 좋지 않다.
		//간단하게 사용이 가능하고, 내부 데이터를 자유롭게 공유할 수 있다.

		//StringBuffer,StringBuilder
		//String과는 다르게 문자열 연산 등으로 기존 객체의 공간이 부족하게 되는 경우
		//기존의 버퍼 크기를 늘리며 유연하게 동작합니다.
		
		//멀티 스레드 환경이면 동기화 보장을 위해 StringBuffer를 사용하고
		//단일 스레드 환경이면 StringBuilder를 사용하는 게 좋다.
		
		//문자열 연산이 많은 경우 StringBuilder가 유리하다.
		
		StringBuilder sb = new StringBuilder();
		sb.append("홍길동");
		sb.insert(1, "ㅇㅇ");
		System.out.println(sb);
	}
}
