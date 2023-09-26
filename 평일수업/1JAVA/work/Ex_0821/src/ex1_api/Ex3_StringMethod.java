package ex1_api;

public class Ex3_StringMethod {
	public static void main(String[] args) {
		//메서드란 어떤 작업을 수행하기 위한 명령문의 집합
		//메서드를 사용하는 가장 큰 이유는 반복적으로 사용되는 코드를 줄이기 위해서다.
		//자주 사용되는 내용의 코드는 메서드로 작성해두고 필요할 때마다 호출만 하면 된다.
	
		String str = "Kim Mal Ddong";
		
		//문자열의 길이
		System.out.println("문자열 str의 길이 : "+str.length()); // 13
		//글자의 위치(index값을 반환)
		System.out.println("문자 d의 위치 : "+str.indexOf('d')); // 9
		//인덱스 번호로 글자 찾기
		System.out.println("추출한 문자 : "+str.charAt(4)); // M
		//문자열 0부터 4까지 잘라내기
		System.out.println("잘라낸 문자 : "+str.substring(0,5)); // Kim M
		
		//문자열을 분리하여 저장하기
		String [] arr = str.split(" ");
		for(String s : arr) {
		System.out.println(s);
		}
		
		//숫자 형태의 문자열을 실제 정수로 바꿔주는 코드
		String number = "1";
		int num = Integer.parseInt(number);
		System.out.println(num+1);
		
		int n = 1;
		String s3 = Integer.toString(n);
		String s1 = String.valueOf(n);
		System.out.println(s1+1);
		
		
	}
}
