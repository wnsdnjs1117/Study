package ex2_generic;

public class PersonMain {
	public static void main(String[] args) {
		Person<String, Integer> p1 = new Person<>("Jack", 20);
		Person<String, Integer> p2 = new Person<>("Steve", 30);

		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println("---------------------------");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());

	}
}
