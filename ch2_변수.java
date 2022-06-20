//변수란? 값을 저장할 수 있는 메모리상의 공간.
public class ch2_변수 {
	public static void main(String[] args) {
		int x; //변수 선언문(int는 변수타입, x는 변수이름)
		x=10; //대입 연산자 '='를 이용한 변수 초기화
		int y=20; //변수는 선언과 동시에 초기화가 가능
		int tmp=0;
		
		System.out.println("x:"+ x+" y:" + y);
		
		tmp=x;
		x=y;
		y=tmp;
		
		System.out.println("x:"+ x+" y:" + y);
	}
}

/*
자바 프로그래머들에게 권장하는 규칙
1. 클래스 이름의 첫 글자는 항상 대문자로 한다.
2. 여러 단어로 이루어진 이름은 단어의 첫 글자를 대문자로 한다.
3. 상수의 이름은 모두 대문자로 한다. 여러 단어로 이루어진 경우 '_'로 구분한다.
*/