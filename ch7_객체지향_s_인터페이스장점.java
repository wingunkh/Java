/*
	인터페이스의 장점
	1) 개발시간을 단축할 수 있다.
	2) 표준화가 가능하다.
	3) 서로 관계없는 클래스들에게 관계를 맺어줄 수 있다.
	4) 독립적인 프로그래밍이 가능하다.
	
	실제로 자바에서는 다수의 데이터베이스와 관련된 다수의 인터페이스를 제공하고 있으며, 프로그래머는 특정 데이터베이스에 종속되지 않는 프로그램을 개발할 수 있다.
*/

public class ch7_객체지향_s_인터페이스장점 {
	public static void main(String[] args) {
		Tank tank=new Tank();
		Dropship dropship=new Dropship();
		
		Marine marine=new Marine();
		SCV scv=new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
		//scv.repair(marine); //에러 발생.
	}
}

interface Repairable { }
//현재 상속관계에서 GroundUnit클래스의 자식클래스인 Tank와 AirUnit클래스의 자식클래스인 Dropship의 공통점은 없다.
//이 때 인터페이스를 이용하면 서로 관계없는 클래스들에게 관계를 맺어줄 수 있다.
//이 인터페이스에 정의된 것은 없고, 단지 인스턴스의 타입체크에만 사용될 뿐이다.

class Unit{
	int hitPoint;
	final int MAX_HP;
	Unit(int hp){
		MAX_HP=hp;
	}
}

class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
		hitPoint=MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable{
	Dropship(){
		super(125);
		hitPoint=MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
}

class Marine extends GroundUnit{
	Marine(){
		super(40);
		hitPoint=MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
		hitPoint=MAX_HP;
	}

	void repair(Repairable r) { //이 메서드의 매개변수로 Repairable인터페이스를 구현한 클래스의 인스턴스만 받아들여진다.
		if(r instanceof Unit) { //Repairable에는 정의된 멤버가 없으므로 타입 체크 후 캐스팅하여 Unit클래스의 멤버를 사용할 수 있도록 한다.
			Unit u=(Unit)r;
			while(u.hitPoint!=u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString()+" 의 수리가 끝났습니다.");
		}
	}
}