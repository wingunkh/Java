/*
	생성자에 접근제어자를 사용함으로써 인스턴스의 생성을 제한할 수 있다. (보통 생성자의 접근제어자는 클래스의 접근제어자와 같지만, 다르게 지정할 수 있다.)
	생성자의 접근제어자를 private으로 지정하면, 외부에서 생성자를 접근할 수 없으므로 인스턴스를 생성할 수 없게 된다.
	
	대신 인스턴스를 생성해서 반환해주는 public메서드를 제공함으로써 외부에서 이 클래스의 인스턴스를 사용하도록 할 수 있다.
	(이 때 이 메서드는 public인 동시에 static이여야 한다.)
	
	생성자가 private인 클래스는 다른 클래스의 부모클래스가 될 수 없다.
	왜냐하면 자식클래스의 인스턴스를 생성할 때 부모클래스의 생성자를 호출해야만 하는데, 생성자의 접근제어자가 private이므로 호출이 불가능하기 때문이다.
	그래서 클래스 앞에 final키워드를 추가하여 상속할 수 없는 클래스라는 것을 알리는 것이 좋다.
*/

final class Singleton{
	private static Singleton s=new Singleton(); //getInstance()에서 사용될 수 있도록 인스턴스가 미리 생성되어야 하므로 static이여야 한다.
	
	private Singleton() {
		//...
	}
	
	public static Singleton getInstance() { //인스턴스를 생성하지 않고도 호출할 수 있어야 하므로 static이여야 한다.
		if(s==null)
			s=new Singleton();
		
		return s; //s는 인스턴스변수이지, 인스턴스가 아님!
	}
}

public class ch7_객체지향9_private생성자 {
	public static void main(String[] args) {
		//Singleton s=new Singleton(); //에러 발생. (The constructor Singleton() is not visible)
		Singleton s=Singleton.getInstance();
	}
}