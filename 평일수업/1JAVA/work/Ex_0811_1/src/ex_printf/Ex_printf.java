package ex_printf;

public class Ex_printf {
	public static void main(String[] args) {
		// printf : 문자열과 변수에 들어 있는 데이터를 함께 출력할 수 있도록
		// 도와주는 포맷형식 printf의 f가 format이란 뜻입니다.

		int su1 = 10, su2 = 7;

		// 10 + 7 = 17
		
		System.out.printf("%d + %d = %d\n" ,su1 ,su2, su1+su2);
		
		int age = 30;
		System.out.printf("제 나이는 %d세 입니다.\n",age);
		
		//제 나이는 30세이고 , 제 키는 170입니다.
		System.out.printf("제 나이는 %d세이고 , 제 키는 %dcm입니다\n", age,170);
		
		//원주율은 3.141592입니다.
		System.out.printf("원주율은 %.2f입니다.", 3.141592);
	}
}
