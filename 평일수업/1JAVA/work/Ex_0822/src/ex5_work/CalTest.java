package ex5_work;

public class CalTest {
	public static int getResult(int a, int b, String c) {
		int num = 0;
		switch(c) {
		case "+" :
			num = a + b;
			break;
		case "-" :
			num = a - b;
			break;
		case "*" :
			num = a * b;
			break;
		case "/" :
			num = a / b;
			break;
		}
		return num;
	}

}
