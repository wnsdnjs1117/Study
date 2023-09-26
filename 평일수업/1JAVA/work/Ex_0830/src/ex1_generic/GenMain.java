package ex1_generic;

public class GenMain {
	public static void main(String[] args) {
		GenEx<String> v1 = new GenEx<>();
		v1.setValue("홍길동");
		System.out.println(v1.getValue());

		GenEx<Integer> v2 = new GenEx<>();
		v2.setValue(100);
		System.out.println(v2.getValue());

		GenEx<Character> v3 = new GenEx<>();
		v3.setValue('A');
		System.out.println(v3.getValue());

		GenEx<Double> v4 = new GenEx<>();
		v4.setValue(3.14);
		System.out.println(v4.getValue());
	}
}
