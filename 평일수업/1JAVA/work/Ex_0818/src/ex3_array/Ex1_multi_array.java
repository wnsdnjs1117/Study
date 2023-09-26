package ex3_array;

public class Ex1_multi_array {
	public static void main(String[] args) {
		// 다차원 배열
		// 다차원 배열이란 2차원 이상의 배열을 의미하며,
		// 배열의 요소로 또 다른 배열을 가지는 것을 의미합니다.
		// 2차원 배열의 요소로는 1차원 배열을 가지고
		// 3차원 배열의 요소는 2차원 배열을 갖습니다.

		// 자료형[][] 배열명 = new 자료형[1차원 배열에 들어가는 요소의 크기];

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };

//		System.out.println(arr[0][0]);	// 첫 번째 값;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}

		// 2차원 배열의 요소로서 들어가는 1차원 배열의 요소의 개수를 각각 따로 지정할 수 있다.
		int iArr[][] = new int[3][];

		iArr[0] = new int[3];
		iArr[1] = new int[2];
		iArr[2] = new int[4];

		int n = 1;
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				iArr[i][j] = n++;
				System.out.print(iArr[i][j] + " ");
			}
			System.out.println();
		}

		int nArr[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		int total = 0;
		int count = 0;
		// 2차원 배열에 담긴 모든 요소들의 총합과 평균
		for (int i = 0; i < nArr.length; i++) {
			for (int j = 0; j < nArr[i].length; j++) {
				total += nArr[i][j];
				count++;
			}
		}
		System.out.printf("%d %s",total,(double)total / count);
	}
}
