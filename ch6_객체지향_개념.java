/*
	객체지향언어란?
	: 실제 세계는 사물(객체)로 이루어져 있으며, 발생하는 모든 사건은 객체 간의 상호작용이라는 개념이다.
	기존의 프로그래밍언어와 다른 전혀 새로운 것이 아니라, 기존의 프로그래밍언어에 몇 가지 새로운 규칙을 추가한 보다 발전된 형태의 것이다.
	객체지향언어의 가장 큰 장점은 '코드의 재사용성이 높고 유지보수가 용이하다'는 것이다.
	
	클래스란?
	: '객체를 정의해 놓은 것' 또는 '객체의 설계도 또는 틀'이라고 정의할 수 있다.
	
	객체란?
	: 사전적 정의는 '실제로 존재하는 것'이며 프로그래밍에서의 객체는 '클래스에 정의된 내용대로 메모리에 생성된 것'을 의미한다.
	
	인스턴스란?
	: 어떤 클래스로부터 만들어진 객체를 그 클래스의 인스턴스라고 한다.
	ex) 책상은 객체다. 책상은 책상클래스의 인스턴스이다.
	인스턴스는 참조변수를 통해서만 다룰 수 있으며, 참조변수의 타입은 인스턴스의 타입과 일치해야 한다.
	
	객체의 구성요소 - 속성과 기능
	: 객체는 속성(멤버변수)과 기능(메서드) 두 종류의 구성요소로 이루어져 있으며 이들을 객체의 멤버라고 한다.
*/
class Tv{
	//Tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;
	
	//Tv의 기능(메서드)
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

public class ch6_객체지향_개념 {
	public static void main(String[] args) {
		Tv t1; //(Tv인스턴스를 참조하기 위한) Tv클래스 타입의 참조변수 t1선언
		t1 = new Tv(); //Tv인스턴스를 생성한 후, 생성된 Tv인스턴스의 주소를 참조변수에 저장한다. 이제 참조변수 t1을 통해 Tv인스턴스에 접근할 수 있다.
		
		t1.channel=7; //Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
		t1.channelDown(); //Tv인스턴스의 메서드 channelDown()을 호출한다.
		
		System.out.println("현재 t1의 채널은 "+t1.channel+" 입니다."); //"현재 t1채널은 6입니다." 출력
		
		Tv t2 = new Tv();
		t2 = t1; //t1이 저장하고 있는 값(주소)을 t2에 저장한다. 
		//t1은 참조변수이므로, 인스턴스의 주소를 저장하고 있다.
		//이 문장이 수행되면 t2가 가지고 있던 값은 잃어버리게 되고 t1에 저장되어 있던 값이 저장된다.
		//그렇게 되면 t2 역시 t1이 참조하고 있던 인스턴스를 같이 참조하게 되며 원래 참조하고 있던 인스턴스는 더이상 참조할 수 없다.
		t1.channel=5;
		
		System.out.println("현재 t1의 채널은 "+t1.channel+" 입니다."); //"현재 t1채널은 5입니다." 출력
		System.out.println("현재 t2의 채널은 "+t2.channel+" 입니다."); //"현재 t2채널은 5입니다." 출력
	}
}