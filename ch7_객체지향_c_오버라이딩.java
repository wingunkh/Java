/*
	[오버라이딩]
	: 부모클래스로부터 상속받은 메서드의 내용을 변경하는 것을 오버라이딩이라고 한다.
	메서드의 선언부는 부모의 것과 완전히 일치해야 하며, 접근 제어자와 예외는 제한된 조건 하에서만 다르게 변경할 수 있다.
	오버로딩과 서로 혼동하기 쉽지만 사실 그 차이는 명백하다.
	오버로딩은 '기존에 없는 새로운 메서드를 정의하는 것'이며, 오버라이딩은 '상속받은 메서드의 내용을 변경하는 것'이다.
	
	[super]
	: 자식클래스에서 부모클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수이다.
	멤버변수와 지역변수의 이름이 같을 때 this로 구분했듯이, 상속받은 멤버와 자신의 멤버와 이름이 같을 때 super로 구분한다.
	이렇듯 this와 super는 근본적으로 같다. 모든 인스턴스 메서드에는 자신이 속한 인스턴스의 주소가 지역변수로 저장되는데, 이것이 참조변수인 this와 super의 값이 된다.
	(super역시 클래스 메서드에서는 사용할 수 없고 인스턴스 메서드에서만 사용할 수 있다.)
*/

public class ch7_객체지향_c_오버라이딩 {
	public static void main(String[] args) {
		Child c=new Child();
		c.method();
	}
}

class Parent{
	int x=10;
	void method() {
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
	}
}

class Child extends Parent{
	int x=20;
	
	void method() { //오버라이딩
		System.out.println("x="+x); //20
		System.out.println("this.x="+this.x); //자식클래스에 선언된 멤버변수이므로 20
		System.out.println("super.x="+super.x); //부모클래스에 선언된 멤버변수이므로 10
		//super.method(); //변수만이 아니라 메서드 역시 super를 써서 호출할 수 있다.
	}
}