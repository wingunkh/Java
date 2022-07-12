/*
	[참조변수의 형변환]
	기본형 변수와 같이 참조변수도 형변환이 가능하다. 단, 상속관계에 있는 클래스 사이에서만 가능하다.
	
	[참조변수의 형변환 생략]
	기본형 변수의 형변환에서 작은 자료형에서 큰 자료형의 형변환은 생략이 가능하듯이, 자식타입의 참조변수를 부모타입으로 형변환하는 경우에는 형변환을 생략할 수 있다.
	(참조변수가 다룰 수 있는 멤버의 개수가 실제 인스턴스가 갖고 있는 멤버의 개수보다 적을 것이 분명하므로 생략이 가능하다.)
	
	
	[업캐스팅과 다운캐스팅]
	자식타입 -> 부모타입(Up-casting) : 형변환 생략가능
	부모타입 -> 자식타입(Down-casting) : 형변환 생략불가
	
	형변환은 참조변수의 타입을 변환하는 것이지 인스턴스를 변환하는 것은 아니기 때문에 참조변수의 형변환은 인스턴스에 아무런 영향을 미치지 않는다.
	단지 참조변수의 형변환을 통해서, 참조하고 있는 인스턴스에서 사용할 수 있는 멤버의 범위(개수)를 조절하는 것뿐이다.
*/

public class ch7_객체지향11_참조변수형변환 {
	public static void main(String[] args) {
		Car car=null;
		FireEngine fe=new FireEngine();
		FireEngine fe2=null;
		
		car=fe; //업 캐스팅 (car=(car)fe; 에서 형변환이 생략)
		//car.water(); //에러 발생. (he method water() is undefined for the type Car)
		
		fe2=(FireEngine)car; //다운 캐스팅
		fe2.water();
	}
}

class Car{
	String color;
	int door;
	
	void drive() { //운전 기능
		System.out.println("drive, Skrrr~");
	}
	
	void stop() { //정지 기능
		System.out.println("stop!!!");
	
	}
}

class FireEngine extends Car{ //소방차
	void water() { //물을 뿌리는 기능
		System.out.println("Water!!!");
	}
}