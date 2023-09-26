package ex1_array;

public class Ex1_Array {
	public static void main(String[] args) {
		// 배열은 같은 자료형의 변수들로 이루어진 유한 집합
		// 데이터를 효율적으로 관리하기 위해서는 배열이 꼭 필요하다.

		// 배열의 선언
		// 자료형 [][] 배열명;

		// 배열의 선언
		// 자료형 [] 배열명;

		// 배열의 생성
		// 배여명 = new 자료형[길이or크기];

		// 선언과 생성을 동시에 알 수 있다.
		// 자료형 [][] 배열명 = new 자료형[길이];

		// 여러개가 필요하면 변수를 그만큼 많이 만들어야 한다.
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		int su5 = 500;

		// 여러 개의 데이터를 편하게 관리하고 제어하기 위해서는
		// 배열을 만들어서 사용하는 것이 좋다.

		int[] ar; // 정수형 배열의 선언

		ar = new int[4];

		// 각각의 방은 index라는 번호를 가지고 있다.
		// index번호는 항상 0번부터 시작한다.
		// 배열의 각 방에 접근하는 방법
		// 배열의[index]
		// 값의 대입 : 배열명[index] = 데이터;
		// System.out.println(배열명[index])

		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 300;
		ar[3] = 400;

		// 배열의 출력
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);

		for (int i = 0; i < 4; i++) {
			ar[1] = 100 * (i + 1);
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.println(" "+ar[i]);
		}

		System.out.println();
		for (int a :ar) {
			System.out.println(" "+a);
		}
		
		//배열의 초기화
		//자료형[][] 배열명 = {값1,값2,값3...}
		
		//{값1,값2,갑3...} -> 초기화 리스트
		
		//배열의 생성 후에는 초기화 리스트고 값을 한번에 넣을 수 없다.
		
		//배열을 초기화 할 때는 초기화 리스트에 들어있는 요소의 개수만큼
		//컴파일러가 방을 생성해준다.
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		
		
		
	}
}





