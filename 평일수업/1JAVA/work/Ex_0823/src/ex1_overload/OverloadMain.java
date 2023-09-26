package ex1_overload;

public class OverloadMain {
	public static void main(String[] args) {
		OverloadTest over = new OverloadTest();

		over.result();
		over.result(0);
		over.result('A');
		over.result("홍", 100);

		System.out.println(100);
		System.out.println(3.14);
		System.out.println('A');
		System.out.println("홍길동");
	}

}
