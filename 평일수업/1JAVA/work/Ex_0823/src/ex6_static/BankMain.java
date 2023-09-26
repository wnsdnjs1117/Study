package ex6_static;

public class BankMain {
	public static void main(String[] args) {
		Bank.interest = 0.1f;
		//static 변수는 객체의 생성 없이도 언제든 사용할 수 있다.
		
		Bank bank1 = new Bank("강남", "02-222-2222");
		Bank bank2 = new Bank("인천", "032-333-3333");
		Bank bank3 = new Bank("대전", "042-444-4444");
		
		
		bank1.printBank();
		bank2.printBank();
		bank3.printBank();
	}
}
