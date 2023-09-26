package ex1;

public class Ex01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		// ++a >= b || 2 + 7 <= b && 13 -b >= 0 && (a+=b) -(a&b)
		// 연산 결과 : true

		// 연산자 우선순위

		// 과수원이 있습니다.
		// 배, 사과 , 오렘지를 키우고 있는데 하루에 생산되는 양은 각각

		int pear = 5, apple = 7, orange = 5;

		int total = pear + apple + orange;

		float hour = (float) total / 24;

		System.out.println("하루에 생산되는 총 과일의 개수 : " + total);
		System.out.println("시간당 생산되는 총 과일의 개수 : " + hour);

		// 상자 하나에는 농구공이 5개 들어갈 수 있습니다.
		// 만일 농구공 23개를 담아야 한다면 필요한 상자의 개수는 몇 개인지 구하세요.
		int ball = 230;
		int baket = 5;
		int result1 = ball / baket;
		int result2 = ball / baket/10*10;
		int total2 = (result1 - result2 > 0) ? result2/10+1 : result2;
		System.out.println(total2+"개");

	}

}
