package ex5_abstract;

public class AbsMain {
	public static void main(String[] args) {
		// 추상클래스는 객체로 만들 수 없다.
		AbsChild ac = new AbsChild(); 
		ac.setValue(20);
		System.out.println(ac.getValue());
				
	}
}
