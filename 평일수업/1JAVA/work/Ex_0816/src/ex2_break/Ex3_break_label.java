package ex2_break;

public class Ex3_break_label {
	public static void main(String[] args) {
		//label : 특정 반복문에 이름표를붙여 두 개 이상의 반복문을 제어할 수 있도록 하는 키워드
		
		//label은 항상 쌍으로 존재한다
		//label의 이름은 자기가 원하는대로 사용이 가능하다.
		
		//label은 자신을 포함하고 있는 상위 개념에게만 달린다
	
		for(int i = 1; i<=3;i++) {
			for(int k = 1; k <=10; k++) {
				System.out.print(k+" ");
			}
			for(int j = 1; j<=10; j++) {
				if(j%2==0) {
					break;
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
