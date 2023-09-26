package ex4_Person;

public class PersomMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("홍길동");
		
		p1.setPhone("010-1111-1111");
	
		p1.setAge(30);
		
		System.out.println(p1.getName());
	
		System.out.println(p1.getPhone());
		
		System.out.println(p1.getAge());
	}

}
