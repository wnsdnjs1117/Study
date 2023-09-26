package ex3_override;

public interface CalPlus {
	// calculator클래스를 만들고
	// getResult()함수를 정의하세요
	// 반환형은 정수
	// 파라미터를 정수n1, n2
	// 반환형은 -1
	//
	// CalPlus클래스를 만들어 Calculator클래스를 상속받는다.
	// 오버라이딩을 이용하여 Calculator의 getResult()함수를 인자로 받은 n1,n2를 더해서 반환하는 함수로 만든다.
	//
	// CalMinus클래스를 만들어 Calculator클래스를 상속받는다.
	// 오버라이딩을 이용하여 Calculator의 getResult()함수를 인자로 받은 n1,n2를 빼서 반환하는 함수로 만든다.
	//
	// CalMain에서 실행하기

	// 예시
	// CalPlus : 30
	// CalMinus : 15
	int getAdd(int n1, int n2);
}
