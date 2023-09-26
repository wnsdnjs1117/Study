package ex6_static;

public class Bank {
	private String name = "우리은행";
	private String point; // 은행 위치
	private String tel; // 은행 번호
	static float interest = 10f; // 은행 이자

	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
	}

	// 은행의 정보를 출력하는 메서드
	public void printBank() {
		System.out.println("Bank [name=" + name + ", point=" + point + ", tel=" + tel + ", interest=" + interest + "]");
	}

}
