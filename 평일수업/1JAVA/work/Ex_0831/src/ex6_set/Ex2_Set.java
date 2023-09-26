package ex6_set;
import java.util.Arrays;
import java.util.TreeSet;
public class Ex2_Set {
	public static void main(String[] args) {
		Test t1 = new Test(1);
		Test t2 = new Test(2);
		TreeSet<Test> set2 = new TreeSet<>(Arrays.asList(t1, t2));
		System.out.println("set1의 크기 : " + set2);
	}
}
