/*
	자바에서는 메서드를 호출할 때 매개변수로 지정한 값을 메서드의 매개변수에 복사해서 넘겨준다.
	
	[기본형 매개변수]
	: 매개변수의 타입이 기본형일 때는 기본형 값이 복사된다. 변수의 값을 읽기만 할 수 있다. (Call by Value)
	
	[참조형 매개변수]
	: 매개변수의 타입이 참조형일 떄는 인스턴스의 주소가 복사된다. 변수의 값을 읽고 변경할 수 있다. (Call by Reference)
*/
class Data {int x;}

public class ch6_객체지향_d_Call_by {
	public static void main(String[] args) {
		Data d=new Data();
		d.x=10;
		System.out.println("main() -> x = "+d.x);
		System.out.println();
		
		changeCBV(d.x); //Call by Value, 값이 전달된다.
		System.out.println("After changeCBV(d.x)");
		System.out.println("main() -> x = "+d.x); //x=10 (변경x)
		System.out.println();
		
		changeCBR(d); //Call by Reference, 주소가 전달된다.
		System.out.println("After changeCBR(d)");
		System.out.println("main() -> x = "+d.x); //x=1000 (변경)
		System.out.println();
	}
	
	static void changeCBV(int x) { //기본형 매개변수
		x=1000;
		System.out.println("changeCBV() -> x = "+x);
	}
	
	static void changeCBR(Data dt) { //참조형 매개변수
		dt.x=1000;
		System.out.println("changeCBR() -> x = "+dt.x);
	}
}

/*
	main() -> x = 10
	
	changeCBV() -> x = 1000
	After changeCBV(d.x)
	main() -> x = 10
	
	changeCBR() -> x = 1000
	After changeCBR(d)
	main() -> x = 1000
*/