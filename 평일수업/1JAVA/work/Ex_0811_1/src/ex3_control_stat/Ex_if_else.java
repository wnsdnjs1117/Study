package ex3_control_stat;

public class Ex_if_else {
	public static void main(String[] args) {
		
	//농구문제 if_else문으로 풀기
	//상자 하나에는 농구공이 5개 들어갈 수 있습니다.
	//만일 농구공 23개를 담아야 한다면 필요한 상자의 개수는 몇 개인지 구하세요
	int num1 = 5;
	int num2 = 26;
	int result=	num2 / num1;
	if(num2%num1!=0) {
		result++;
	}
	System.out.printf("필요한 상자는 %d개 입니다.", result);
	

	}

}
