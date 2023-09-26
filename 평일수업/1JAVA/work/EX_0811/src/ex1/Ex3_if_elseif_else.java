package ex1;

public class Ex3_if_elseif_else {
	public static void main(String[] args) {
		//비교해야 하는 조건이 여러 개 있는 경우
		//기본 모양
		//if(조건식1){
		//	조건식 1이 참일 때 실행할 명령
		//} else if(조건식2){
		//	조건식 1이 거짓이고 2가 참일 때 실행할 명령
		//} else if(조건식3){
		//	조건식 1, 2이 거짓이고 3가 참일 때 실행할 명령
		//} else if(조건식4){
		//	조건식 1, 2, 3이 거짓이고 4가 참일 때 실행할 명령
		//}	else {
		//	위의 조건이 모두 것짓일 때 실행할 명령
		//}
		
		int score = 85;
		if(score >= 90) {
			System.out.println("성적은 A입니다.");
		} else if(score >= 80) {
			System.out.println("성적은 B입니다.");
		} else if(score >= 70) {
			System.out.println("성적은 C입니다.");
		} else if (score>=60) {
			System.out.println("성적은 D입니다.");
		} else {
			System.out.println("성적은 F입니다.");
		}
	
	}
}
