/*
	다형성이란?
	: 상속과 함께 객체지항개념의 중요한 특징 중 하나이며, '여러가지 형태를 가질 수 있는 능력'을 의미한다.
	자바에서는 부모클래스 타입의 참조변수로 자식클래스의 인스턴스를 참조할 수 있도록 함으로써 다형성을 프로그램적으로 구현하였다.
*/

class Tv{
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv{
	String text;
	void caption() {/*내용생략*/}
}

public class ch7_객체지향_j_다형성 {
	public static void main(String[] args) {
		Tv t1 = new Tv(); //지금까지 우리는 생성된 인스턴스를 다루기 위해서, 인스턴스의 타입과 일치하는 타입의 참조변수만을 사용했다.
		
		Tv t2 = new CaptionTv(); //그러나 클래스가 서로 상속관계에 있을 경우, 부모클래스 타입의 참조변수로 자식클래스의 인스턴스를 참조할 수 있다.
		//그러나 부모클래스 타입의 참조변수로는 부모클래스의 멤버들만 사용할 수 있다.
		//위의 인스턴스들은 같은 타입의 인스턴스지만 참조변수의 타입에 따라 사용할 수 있는 멤버의 개수가 달라진다.
		
		//Caption Tv c  = new Tv();
		//반대로 자식클래스 타입의 참조변수로 부모클래스 타입의 인스턴스를 참조하는 것은 불가능하다. 존재하지 않는 멤버를 사용하고자 할 가능성이 있기 때문이다.
		
		System.out.println("결론: 참조변수가 사용할 수 있는 멤버의 개수는 인스턴스의 멤버 개수보다 '같거나 적어야' 한다.");
	}
}