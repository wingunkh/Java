/*
	[접근 제어자]
	: 접근 제어자는 멤버 또는 클래스에 사용되어, 해당하는 멤버 또는 클래스를 외부에서 접근하지 못하도록 제한하는 역할을 한다.
	
	[public]
	: 접근 제한이 전혀 없다.
	
	[protected]
	: 같은 패키지 내에서, 그리고 다른 패키지의 자식클래스에서 접근이 가능하다.
	(패키지에 관계없이 상속관계에 있는 자식클래스에서 접근할 수 있도록 하는 것이 제한목적이지만, 같은 패키지 내에서도 접근이 가능하다.)
		
	[default]
	: 같은 패키지 내에서만 접근이 가능하다.
	(접근 제어자가 지정되어 있지 않다면, 접근 제어자가 default임을 뜻한다.)
	
	[private]
	: 같은 클래스 내에서만 접근이 가능하다.
	
	[접근 제어자를 사용하는 이유]
	1) 클래스 내부에 선언된 데이터를 외부로부터 보호하기 위해서이다.
	2) 외부에는 불필요한, 내부적으로만 사용되는 부분을 감추기 위해서이다.
	이들은 객체지향개념의 캡슐화(encapsulation)에 해당된다.
*/

public class ch7_객체지향_h_접근제어자 {
	public static void main(String[] args) {
		Time t=new Time(16,20);
		System.out.println(t); //"16시:20분" 출력.
		//t.hour=17; //에러 발생. (The field Time.hour is not visible)
		t.setHour(t.getHour()+1);
		System.out.println(t); //"17시:20분" 출력.
	}
}

class Time{
	private int hour, minute; //접근제어자를 private으로 하여 외부에서 직접 접근하지 못하도록 했다.
	
	Time(int hour, int minute){
		setHour(hour);
		setMinute(minute);
	}
	
	public int getHour() {
		return hour;
	} //getter메서드
	public void setHour(int hour) {
		if(hour<0 || hour>23) return;
		this.hour=hour;
	} //setter메서드
	
	public int getMinute() {
		return hour;
	}
	public void setMinute(int minute) {
		if(hour<0 || hour>59) return;
		this.minute=minute;
	}
	
	public String toString() {
		return hour+"시:"+minute+"분";
	}
}