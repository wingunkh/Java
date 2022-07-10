/*
	[제어자]
	: 제어자(modifier)는 클래스, 변수 또는 메서드의 선언부에 함께 사용되어 부가적인 의미를 부여한다.
	제어자의 종류는 크게 접근 제어자와 그 외 제어자로 나눌 수 있다.
	
	접근 제어자: public, protected, default, private
	그 외: static, final, abstract, native, transient, synchronized, volatile, strictfp 등
	
	[static 제어자]
	: static은 '클래스의' 또는 '공통적인'의 의미를 가지고 있다.
	(ch6_객체지향_변수의종류.java 파일과 ch6_객체지향_메서드의종류.java 파일에 자세히 설명되어 있으므로 생략한다.)
	
	[final 제어자]
	: final은 '마지막의' 또는 '변경될 수 없는'의 의미를 가지고 있으며 거의 모든 대상에 사용될 수 있다.
	변수에 사용하면 상수가되며, 메서드에서 사용하면 오버라이딩을 할 수 없게되고 클래스에 사용하면 자신을 확장하는 자식클래스를 정의하지 못하게 된다.
	
	[abstract 제어자]
	: abstract는 '미완성'의 의미를 가지고 있다. 메서드의 선언부만 작성하고 실제 수행내용은 구현하지 않은 추상메서드를 선언하는데 사용된다.
	그리고 그 클래스에 사용되어 클래스 내에 추상메서드가 존재한다는 것을 쉽게 알 수 있게 한다.
	(보다 자세한 내용은 '추상 클래스'(p.375)에서 다룬다.)
*/

class Card{
	final String KIND;
	final int NUMBER;
	static int width=100;
	static int height=250;
	
	Card(String kind, int num){
		KIND=kind;
		NUMBER=num;
	} //final이 붙은 변수는 상수이므로 일반적으로 선언과 동시에 초기화를 하지만, 인스턴스변수의 경우 생성자에서 초기화 되도록 할 수 있다.
	//이 기능을 활용하면 각 인스턴스마다 final이 붙은 멤버변수가 다른 값을 갖도록 하는 것이 가능하다.
	
	Card(){
		this("HEART",1);
	}
	
	public String toString() {
		return KIND+" "+NUMBER;
	}
}

class ch7_객체지향7_제어자{
	public static void main(String args[]) {
		Card c1=new Card("HEART",10);
		Card c2=new Card("CLOVER",7);
 		//c1.NUMBER=5; //에러 발생. (The final field Card.NUMBER cannot be assigned)
		System.out.println(c1);
		System.out.println(c2);
	}
}