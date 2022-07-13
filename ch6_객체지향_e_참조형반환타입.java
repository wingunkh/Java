//함수의 반환타입 역시 참조형이 될 수 있다. 모든 참조형 타입의 값은 '객체의 주소'이므로 그저 정수값이 반환되는 것일 뿐 특별한 것이 없다.
class Data {int x;}

public class ch6_객체지향_e_참조형반환타입 {
	public static void main(String[] args) {
		Data d=new Data();
		d.x=10;
		
		Data d2=copy(d); //copy()메서드의 반환타입이 Data이므로, 호출결과를 저장하는 변수의 타입 역시 Data이다.
		System.out.println("d.x="+d.x);
		System.out.println("d2.x="+d2.x);
	}
	
	static Data copy(Data d) { //반환하는 값이 Data객체의 주소이므로 반환타입이 Data이다. 
		Data tmp=new Data(); //새로운 객체 tmp생성
		tmp.x=d.x; //d.x의 값을 tmp.x에 복사
		
		return tmp; //tmp객체의 주소를 반환한다.
	}
}