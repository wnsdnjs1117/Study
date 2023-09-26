package ex2_break;

public class Ex3_continue {
	public static void main(String[] args) {
		int n = 0;
		while(n<10) {
			n++;
			if(n%2 !=0){
				//while문에서 continue를 만나면
				//조건식으로 이동
				continue;
			}
			System.out.println(n);
		}
	}
}
