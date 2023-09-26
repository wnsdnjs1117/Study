package ex1_InnerClass;

public class PermitExample {
	private class InClass {
		public void print() {
			System.out.println("접근을 private으로 제한합니다.");
		}
	}

	public static void main(String[] args) {
		PermitExample permit = new PermitExample();
		PermitExample.InClass in = permit.new InClass();
		in.print();
	}
}
