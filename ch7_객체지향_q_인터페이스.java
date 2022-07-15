/*
	[인터페이스]
	: 인터페이스는 일종의 추상클래스이며, 기본 설계도에 비유할 수 있다.
	
	- 인터페이스도 추상클래스처럼 추상메서드를 갖지만 추상클래스보다 추상화 정도가 높아서 추상클래스와 달리 일반메서드 또는 멤버변수를 구성원으로 가질 수 없다.
	오직 추상메서드와 상수만을 멤버로 가질 수 있다. (생성자도 가질 수 없다.)
	- 추상클래스와 마찬가지로 그 자체로는 인스턴스를 생성할 수 없다.
	- 인터페이스는 키워드로 'class' 대신 'interface'를 사용하며, 'extends' 대신 'implements'를 사용한다.
	- 인터페이스는 인터페이스로부터만 상속받을 수 있으며, 클래스와는 달리 다중상속이 가능하다.
	하지만 다중상속은 장점도 있지만 단점이 더 크다고 판단하였기 때문에 자바에서 인터페이스로 다중상속을 구현하는 경우는 거의 없다.
	
	[인터페이스 멤버의 제약사항]
	1) 모든 멤버변수는 public static final 이어야 한다. 즉 상수여야 한다.
	2) 모든 메서드는 public abstract 이어야 한다. 즉 추상메서드여야 한다. (JDK 1.8부터 static메서드와 디폴트 메서드의 추가를 허용)
	
	인터페이스에 정의된 모든 멤버에 예외없이 적용되는 사항이므로 생략이 가능하며, 편의상 생략하는 경우가 많다. 생략된 제어자는 컴파일 시 컴파일러가 자동적으로 추가해준다.
*/

class Unit{
	int currentHP;
	int x;
	int y;
}

class Fighter extends Unit implements Fightable{
	public void move(int x,int y) {/* 내용 생략 */}
	//Movable인터페이스의 move()메서드는 실은 'public abstract void move(int x,int y)'이다.
	//오버라이딩 할 때는 부모의 메서드보다 같거나 넓은 범위의 접근 제어자를 지정해야 하므로 접근 제어자를 반드시 public으로 해야한다.
	public void attack(Unit u) { /* 내용 생략 */ }
}

interface Movable { void move(int x,int y); } //인터페이스의 이름에는 주로 '~를 할 수 있는'의 의미인 'able'로 끝나는 경우가 많다.
interface Attackable { void attack(Unit u); } //그 이유는 어떠한 기능 또는 행위를 하는데 필요한 메서드를 제공한다는 의미를 강조하기 위해서이다.
interface Fightable extends Movable, Attackable { } //다중상속

public class ch7_객체지향_q_인터페이스 {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit)
			System.out.println("f는 Unit클래스의 자식입니다.");
		
		if(f instanceof Fightable)
			System.out.println("f는 Fightable인터페이스를 구현했습니다.");
		
		if(f instanceof Movable)
			System.out.println("f는 Movable인터페이스를 구현했습니다.");
		
		if(f instanceof Attackable)
			System.out.println("f는 Attackable인터페이스를 구현했습니다.");
		
		if(f instanceof Object)
			System.out.println("f는 Object클래스의 자식입니다.");
	}
} //5개의 출력문이 전부 출력된다.