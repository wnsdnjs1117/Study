package ex4_Person;

public class Person {
	// 사람마다 이름, 나이, 전화번호가 다르기 때문에 미리 설정하면 안 된다.
	private String name;
	private String phone;
	private int age;

	//메서드에서는 지역변수가 우선이기 때문에
	//클래스 변수와 구분할 수 있도록 this를 써야한다.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
