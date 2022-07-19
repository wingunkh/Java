/*
	[내부 클래스]
	: 내부 클래스는 클래스 내에 선언된 클래스이다.
	클래스에 다른 클래스를 선언하는 이유는 간단하다. 두 클래스가 서로 긴밀한 관계에 있기 때문이다.
	이 때 내부클래스는 외부클래스를 제외하고는 다른 클래스에서 잘 사용되지 않는 것이여야 한다.
	
	[내부 클래스의 장점]
	1) 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다.
	2) 코드의 복잡성을 줄일 수 있다.(캡슐화)
	
	[내부 클래스의 종류와 특징]
	내부 클래스의 종류는 변수의 선언위치에 따른 종류와 같다. (유효범위와 접근성도 동일하다.)
	
	- 인스턴스 클래스: 외부 클래스의 멤버변수 선언위치에 선언 / 외부 클래스의 인스턴스멤버처럼 다뤄짐 / 외부 클래스의 인스턴스멤버들과 관련된 작업에 사용
	- 스태틱 클래스: 외부 클래스의 멤버변수 선언위치에 선언 / 외부 클래스의 static멤버처럼 다뤄짐 / 외부 클래스의 static멤버, 특히 static메서드에서 사용
	- 지역 클래스: 외부 클래스의 메서드나 초기화블럭 안에 선언 / 선언된 영역 내부에서만 사용
	- 익명 클래스: 클래스의 선언과 객체의 생성을 동시에 하는 이름없는 클래스(일회용)
*/

class Outer {
	private int px=100;
	int y=100;
	class InstanceInner{ //인스턴스 클래스
		int x=px; //외부 클래스의 private멤버에도 접근이 가능하다.
		int y=Outer.this.y; //내부 클래스외 외부 클래스에 선언된 변수의 이름이 같을 때는 변수 앞에 'this' 또는 '외부클래스명.this'를 붙혀서 구분한다.
	}
	
	static class StaticInner{ //스태틱 클래스
		int x=200; //스태틱 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
		static int y=200; //내부 클래스 중 스태틱 클래스만 static 멤버를 가질 수 있다.
	}
	
	void method() {
		final int Localy=300;
		class LocalInner{ //지역 클래스
			int x=px; // 외부 클래스의 private멤버에도 접근이 가능하다.
			int y=Localy; //지역 클래스가 포함된 메서드에 정의된 지역변수도 사용할 수 있다. 단, final이 붙은 지역변수만 접근 가능하다.
		}
	}
	
	void print() {
		Outer outer = new Outer();
		InstanceInner i = outer.new InstanceInner();
		//인스턴스 클래스의 인스턴스를 생성하려면 외부 클래스의 인스턴스를 먼저 생성해야 한다.
		System.out.println(i.x); //100
		System.out.println(StaticInner.y); //200
	}
}

public class ch7_객체지향_v_내부클래스{
	public static void main(String[] args) {
		Outer o = new Outer();
		o.print();
	}
}