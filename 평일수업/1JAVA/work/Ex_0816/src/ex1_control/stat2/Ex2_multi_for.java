package ex1_control.stat2;

public class Ex2_multi_for {
	public static void main(String[] args) {

//	다중 for문
//	for문 안에 for문이 있는 경우
//	반복문을 반복하는 반복문
//	
//	기본형
//	for(초기식; 조건식; 증감식;) {
//	for(초기식;조건식;증감식) {
//	반복실행할 명령들;
//		}
//	}
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println(i + " " + j);
			}
		}

		// 1 2 3 4
		// 1 2 3 4
		// 1 2 3 4
		// 1 2 3 4
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(1 + " ");
			}
			System.out.println();
		}

		System.out.println("------------------------------------------------");

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(j + (i - 1) * 4 + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		for (int i = 1; i <= 3; i++) {
			for (int j = 'A'; j <= 'D'; j++) {
				System.out.print((char) (j + (i - 1) * 4) + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");

		int R = 20;
		while (R > 0) {
			for (int i = 0; i <= R * 2; i++) {
				for (int j = 0; j <= R * 2; j++) {
					if ((R - i) * (R - i) + (R - j) * (R - j) <= R * R
							&& (R - i) * (R - i) + (R - j) * (R - j) >= R * R - R) {
						System.out.print("* ");
					} else {

						System.out.print("  ");
					}
				}
				System.out.println();
			}
			R-=1;
		}
	}
}