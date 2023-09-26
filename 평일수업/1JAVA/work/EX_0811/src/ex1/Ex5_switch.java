package ex1;

public class Ex5_switch {
	public static void main(String[] args) {
//		switch문은 if문과 비슷하지만 인자 값으로 true, false가 아닌
//		값이 1개가 들어와야 합니다.
//		특정 값을 바로 찾아 들어가기 때문에 속도가 빠르다.
//		
//		기본형
//		switch(비교값) {
//		case 조건값1:
//		비교값과 조건값1이 일치할 때 실행할 문장
//		break;
//		case 조건값2:
//		비교값과 조건값2이 일치할 때 실행할 문장
//		break;
//		case 조건값3:
//		비교값과 조건값3이 일치할 때 실행할 문장
//		break;
//		default:
//		비교값과 조건값이 하나도 일치하는 게 없는 경우 실행할 문장
//		break;
//		}

//		비교값과 조건값의 타입은 바드시 일치해야 한다.
//		case의 조건값은 중복될 수 없다. 

		int n = 1;
		switch (n) {
		case 1:
			System.out.println("1. 게임 시작");
			break;
		case 2:
			System.out.println("2. 게임 소개");
			break;
		case 3:
			System.out.println("3. 종료");
			break;
		default:
			System.out.println("메뉴 선택이 올바르지 않습니다.");
			break;
		}

		// if vs switch
		// if문은 범위에 따라서 조건을 비교하는데 효울적이고
		// switch문은 하나의 값에 따라서 조건을 비교하는데 효과적이다.

		int s = 91;
		switch (s) {
		case 100:
			System.out.println("성적은 A입니다.");
			break;
		case 99:
			System.out.println("성적은 A입니다.");
			break;
		case 98:
			System.out.println("성적은 A입니다.");
			break;
		case 97:
			System.out.println("성적은 A입니다.");
			break;
		case 96:
			System.out.println("성적은 A입니다.");
			break;
		}

		// witch문의 비교값으로 사용 가능한 자료형
		// 정수(byte,short,int)
		// 문자형(char)
		// 문자열(String)

		String str = "박";
		String result = "";

		switch (str) {
		case "박":
			result = "박길동";
		case "이":
			result = "이길동";
		case "김":
			result = "김길동";
		case "홍":
			result = "홍길동";
		}
		System.out.println(result);
	}
}
