package ex5_work;

import java.util.Iterator;
import java.util.stream.IntStream;

public class TimesTable {
	
	//TimesTable 클래스를 만들고
	//showTable()메서드를 정의한다
	//showTable()메서드에는 구구단을 출력하는 코드 작성하기
	
	//TimesTavleMain클래스를 만들어서 TimesTable객체를 생성하고
	//키보드에서 단을 하나 입력받아서 해당 구구단 출력하기
	
	public void showTable(int a) {
		for(int i =2; i<=9; i++) {
			System.out.printf("%d X %d = %d\n", a,i,a*i);
		}
		
		
	}

}
