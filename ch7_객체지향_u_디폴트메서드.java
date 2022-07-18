/*
	부모클래스의 경우와 달리 인터페이스의 경우에는 새로운 메서드를 추가하는 것이 쉽지 않다.
	인터페이스에 새로운 메서드를 추가한다는 것은, 추상메서드를 추가한다는 것이고, 이 인터페이스를 구현한 기존의 모든 클래스들이 새로 추가된 메서드를 구현해야하기 때문이다.
	이러한 이유 때문에 JDK 설계자들은 디폴트 메서드를 고안하였다.
	
	[디폴트 메서드]
	: 추상메서드의 기본적인 구현을 제공하는 메서드로, 추상메서드가 아니기 때문에 디폴트 메서드가 새로 추가되어도 해당 인터페이스를 구현한 클래스를 변경하지 않아도 된다.
	디폴트 메서드는 키워드 default를 붙히며, 추상메서드와 달리 일반메서드처럼 몸통{}이 있어야 한다. 역시 접근 제어자가 public이며, 생략가능하다.
*/

public class ch7_객체지향_u_디폴트메서드 {
	public static void main(String[] args) {
		Child c=new Child();
		c.method1(); 
		c.method2(); //부모클래스의 메서드와 MyInterface인터페이스의 메서드 간의 충돌 -> 부모클래스의 메서드가 상속되고, 디폴트 메서드는 무시.
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}
}

class Child extends Parent implements MyInterface, MyInterface2{
	public void method1() {
		System.out.println("method1() in Child");
	} //MyInterface인터페이스와 MyInterface2인터페이스의 디폴트 메서드 간의 충돌 -> 인터페이스를 구현한 클래스에서 디폴트 메서드를 오버라이딩.
}

class Parent{
	public void method2() {
		System.out.println("method2() in Parent");
	}
}

interface MyInterface{
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2{
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}

/*
	[출력문]
	method1() in Child
	method2() in Parent
	staticMethod() in MyInterface
	staticMethod() in MyInterface2
*/