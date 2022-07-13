/*
	메서드의 경우 부모클래스의 메서드를 자식클래스에서 오버라이딩한 경우에도 참조변수의 타입에 관계없이 항상 실제 인스턴스의 메서드가 호출되지만,
	멤버변수의 경우 참조변수의 타입에 따라 달라진다.
	
	멤버변수가 부모클래스와 자식클래스에 중복으로 정의된 경우
	부모타입의 참조변수를 사용했을 때는 부모클래스에 선언된 멤버변수가, 자식타입의 참조변수를 사용했을 때는 자식클래스에 선언된 멤버변수가 사용된다.
	(중복되지 않은 경우 차이는 없다.)
*/

public class ch7_객체지향_m_인스턴스연결 {
	public static void main(String[] args) {
		Parent p=new Child(); //부모클래스 타입의 참조변수로 자식클래스의 인스턴스를 참조
		Child c=new Child();
		
		System.out.println("p.x= "+p.x);
		p.method();
		
		System.out.println("c.x= "+c.x);
		c.method();
	}
}

class Parent{
	int x=100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent{
	int x=200;
	
	void method() { //메서드 오버라이딩
		System.out.println("Child Method");
	}
}

/*
	[출력 결과]
	p.x= 100
	Child Method
	c.x= 100
	Child Method
	
	메서드의 경우 참조변수와 관계없이 실제 인스턴스의 메서드가 호출된다.
	그러나 멤버변수의 경우 참조변수의 타입에 따라 달라진다.
		
	전에 배운것과 같이 멤버변수들은 주로 private으로 접근을 제한하고, 외부에서는 메서드를 통해서만 접근할 수 있게끔 한다.
	이 예제에서 알 수 있듯이 인스턴스변수에 직접 접근하면, 참조변수의 타입에 따라 사용되는 인스턴스변수가 달라질 수 있으므로 주의해야 한다.
*/