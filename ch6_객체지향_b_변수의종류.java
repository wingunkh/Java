/*
	변수는 클래스변수, 인스턴스 변수, 지역변수 모두 세 종류가 있다. 변수의 종류를 결정 짓는 중요한 요소는 '변수의 선언된 위치'이다.
	
	인스턴스 변수
	- 선언위치: 클래스 내부
	- 생성시기: 인스턴스가 생성될 때
	- 용도: 인스턴스는 독립적인 저장공간을 가지므로 서로 다른 값을 가질 수 있다. 인스턴스마다 고유한 상태를 유지해야 하는 경우 사용한다.
	
	클래스 변수
	- 선언위치: 클래스 내부
	- 생성시기: 클래스가 메모리에 올라갈 때
	- 용도: 인스턴스 변수와 달리 모든 인스턴스가 공통된 저장공간을 공유하게 된다.
	한 클래스의 모든 인스턴스들이 공통된 값을 유지해야하는 속성의 경우 사용하며 인스턴스 변수 앞에 static을 붙히기만 하면 된다.
	
	지역 변수
	- 선언위치: 메서드 내부
	- 생성시기: 변수 선언문이 수행되었을 때
*/

public class ch6_객체지향_b_변수의종류 {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		//클래스변수는 객체생성 없이 직접 사용 가능하다.
		
		Card c1=new Card();
		c1.kind="Heart";
		c1.number=7;
		
		Card c2=new Card();
		c2.kind="Spade";
		c2.number=4;
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+"이며, 크기는 (" +c1.width+", "+c1.height+")");
		System.out.println("c2은 "+c2.kind+", "+c2.number+"이며, 크기는 (" +c2.width+", "+c2.height+")");
		
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		c1.width=50;
		c1.height=80;
		//클래스변수를 사용할 때는 '클래스이름.클래스변수'의 형태로 하는 것이 바람직하다.
		//이렇게 '참조변수.클래스변수'의 형태를 통해서도 사용할 수 있지만 클래스변수를 인스턴스변수로 오해하기 쉽기 때문이다.
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+"이며, 크기는 (" +c1.width+", "+c1.height+")");
		System.out.println("c2은 "+c2.kind+", "+c2.number+"이며, 크기는 (" +c2.width+", "+c2.height+")");
		//Card.width, c1.width, c2.width는 모두 같은 저장공간을 참조하므로 항상 같은 값을 갖게 된다.
	}
}

class Card{
	//Card인스턴스는 자신만의 무늬와 숫자를 유지하고 있어야 하므로 인스턴스변수로 선언하였다.
	String kind; //무늬
	int number; //숫자
	
	//Card인스턴스는 각 카드의 폭과 높이가 공통적으로 같은 값을 유지해야하므로 클래스변수로 선언하였다.
	static int width=100; //폭
	static int height=250; //높이
} //트럼프 카드를 나타낸 Card 클래스이다.