/*
	[인터페이스를 이해하기 앞서 알아야 할 두가지]
	1) 클래스를 사용하는 쪽(User)과 클래스를 제공하는 쪽(Provider)이 있다.
	2) 메서드를 사용(호출)하는 쪽에서는 사용하려는 메서드(Provider)의 선언부만 알면 된다. (내용은 몰라도 된다.)
	
	[직접적인 관계의 두 클래스]
	: User클래스가 Provider클래스의 인스턴스를 생성하고 메서드를 호출해야 한다.
	한 쪽(Provider)이 변경되면 다른 한 쪽도 변경되어야 한다는 단점이 있다.
	
	[간접적인 관계의 두 클래스]
	: User클래스가 Provider클래스의 메서드를 직접 호출하지 않고, 인터페이스를 매개체로 해서 Provider클래스의 메서드에 접근하도록 할 수 있다.
	이 때 Provider클래스에 변경사항이 생기거나 Provider와 같은 기능의 다른 클래스로 대체 되어도 User클래스는 전혀 영향을 받지 않는다.
	(User클래스는 인터페이스를 통해 실제로 사용하는 클래스의 이름을 몰라도 되고 심지어는 실제로 구현된 클래스가 존재하지 않아도 문제되지 않는다.)
*/

class User{
	void autoPlay(I i) { //매개변수를 통해서 인터페이스를 구현한 클래스의 인스턴스를 동적으로 제공받아야 한다.
		i.play();
	}
}

interface I{
	public abstract void play();
} //User클래스와 Provider클래스의 관계를 간접적인 관계로 만들기 위해서는 먼저 인터페이스를 이용해서 Provider클래스의 선언과 구현을 분리해야 한다.
//그러므로 Provider클래스에 정의된 메서드를 추상메서드로 정의하는 인터페이스를 정의해야 한다.

class Provider implements I{
	public void play() {
		System.out.println("play() in Provider class");
	}
}

public class ch7_객체지향_t_인터페이스이해 {
	public static void main(String[] args) {
		User u=new User();
		u.autoPlay(new Provider());
		u.toString(); //인터페이스 타입의 참조변수로도 Object클래스에 정의된 메서드들을 호출 할 수 있다.
		//u에 toString()이 정의되어 있지 않지만, 모든 객체는 Object클래스에 정의된 메서드를 가지고 있을 것이기 때문에 허용하는 것이다.
	}
}