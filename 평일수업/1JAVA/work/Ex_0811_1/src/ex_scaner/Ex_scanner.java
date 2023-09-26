package ex_scaner;

import java.util.Scanner;

public class Ex_scanner {public static void main(String[] args) {
	//Scanner : 키보드에서 값을 직업 입력받아
	//변수에 저장할 수 있도록 해주는 클래스(설계도)
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("정수를 입력하세요. : ");
	int num=scan.nextInt();	//반환값이 Int
	System.out.printf("제 나이는 %d살 입니다.\n",num);
	scan.nextLine();
	
	System.out.print("이름 : ");
	//String = 문자열과 관련된 클래스
	String name = scan.next();	//next는 반환값이 String임
	
	System.out.printf("제 이름은 %s 입니다. \n",name);
	
}
}
