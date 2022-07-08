/*
	[상속]
	: 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것이다.
	새로 작성하고자 하는 클래스의 이름 뒤에 상속받고자 하는 클래스의 이름을 키워드 'extends'와 함께 써주기만 하면 된다.
	상속해주는 클래스를 '부모 클래스'라 하고 상속받는 클래스를 '자식 클래스'라 한다. '자식 클래스'는 '부모 클래스'의 모든 멤버를 상속받는다.
	이 때, 생성자와 블록은 상속되지 않는다.
	
	[상속의 장점]
	: 보다 적은 양의 코드로 새로운 클래스를 작성할 수 있고 코드를 공통적으로 관리할 수 있기 때문에 코드의 추가 및 변경이 용이하다.
	이러한 장점은 코드의 재사용성을 높이고 코드의 중복을 제거하여 프로그램의 생산성과 유지보수에 크게 기여한다.
	
	[단일상속과 다중상속]
	: 한 클래스로부터 상속을 받는 것을 단일상속, 여러 클래스로부터 상속을 받는 것을 다중상속이라고 한다.
	단일 상속이 하나의 부모 클래스만을 가질 수 있기 때문에 다중상속에 비해 불편한 점도 있지만,
	클래스 간의 관계가 보다 명확해지고 코드를 더욱 신뢰할 수 있게 만들어 준다는 점에서 다중상속보다 유리하다.
	자바는 오직 단일상속만을 허용한다.
*/

class Tv{ //부모 클래스
	boolean power; //전원상태(on/off)
	int channel; //채널
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv{ //자식 클래스
	boolean caption; //캡션 상태(on/off)
	void displayCaption(String text) {
		if(caption) { //캡션 상태가 on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}
	}
}

public class ch7_객체지향1_상속 {
	public static void main(String[] args) {
		CaptionTv ctv=new CaptionTv();
		ctv.channel=10; //부모 클래스로부터 상속받은 멤버
		ctv.channelUp(); //부모 클래스로부터 상속받은 멤버
		System.out.println(ctv.channel); //11 츨력.
		ctv.displayCaption("Hello, World!"); //출력되지 않음.
		ctv.caption=true;
		ctv.displayCaption("Hello, World!"); //출력.
	}
}