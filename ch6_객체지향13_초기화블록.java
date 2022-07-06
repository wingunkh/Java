/*
	멤버변수의 초기화 방법
	1) 명시적 초기화: 변수를 선언과 동시에 초기화하는 제일 기본적이고 간단한 방법.
	2) 생성자: 인스턴스변수의 초기화는 주로 생성자를 사용한다.
	
	3) 초기화 블록
	
	[인스턴스 초기화 블록]
	: 인스턴스변수를 초기화 하는데 사용.
	생성자와 같이 인스턴스를 생성할 때 마다 수행되며, 생성자보다 먼저 수행된다.
	인스턴스 초기화 블록은 '모든 생성자에서 공통으로 수행되어야 하는 코드를 넣는데' 사용한다.
	
	[클래스 초기화 블록]
	: 클래스변수를 초기화 하는데 사용.
	클래스가 메모리에 처음 로딩될 때 한번만 수행된다.
*/

class BlockTest{
	static {
		System.out.println("클래스 초기화 블록 실행");
	} //클래스 초기화 블록. 인스턴스 초기화 블록 앞에 단순히 static을 덧붙이기만 하면 된다.
	
	{
		System.out.println("인스턴스 초기화 블록 실행");
	} //인스턴스 초기화 블록. 단순히 클래스 내에 블록{}을 만들고 그 안에 코드를 작성하기만 하면 된다. 
	
	public BlockTest() {
		System.out.println("생성자 실행");
	}
}

public class ch6_객체지향13_초기화블록 {
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt=new BlockTest(); //"클래스 초기화 블록 실행 -> 인스턴스 초기화 블록 실행 -> 생성자 실행" 출력.

		System.out.println("BlockTest bt2 = new BlockTest();");
		BlockTest bt2=new BlockTest(); //"인스턴스 초기화 블록 실행 -> 생성자 실행" 출력.
	}
}