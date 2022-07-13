/*
	생성자에서 다른 생성자를 호출하기 위한 조건
	1) 생성자의 이름으로 클래스의 이름 대신 this를 사용한다.
	2) 한 생성자에서 다른 생성자를 호출 할 때는 반드시 첫 줄에서만 호출이 가능하다.
*/

class Car{
	String color; //색상
	String gearType; //변속기의 종류 - auto(자동), manual(수동)
	int door; //문의 개수
	
	Car(){
		this("white","auto",4); //Car()생성자에서 Car(String color,String gearType,int door) 생성자 호출
	}
	
	Car(Car c){ //현재 사용하고 있는 인스턴스와 같은 상태를 갖는 인스턴스를 하나 더 만들고자 할 때 생성자를 이용할 수 있다.
		this(c.color,c.gearType,c.door);
	}
	
	Car(String color){
		this(color,"auto",4); //Car(String color)생성자에서 Car(String color,String gearType,int door) 생성자 호출
	}
	
	Car(String color,String gearType,int door){
		//인스턴스 변수와 생성자의 매개변수의 이름이 같아서 구별이 안될 때, 인스턴스 변수 앞에 'this'를 사용한다.
		//'this'는 참조변수로 인스턴스 자신을 가리킨다. 인스턴스의 주소가 저장되어 있으며 모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재한다.
		//인스턴스 메서드만이 'this'를 사용할 수 있다. (클래스 메서드는 당연히 사용 불가)
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
}

public class ch6_객체지향_l_this {
	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car(c1);
		
		System.out.println("c1의 색상=" + c1.color + ", 변속기=" + c1.gearType + ", 문의 개수=" + c1.door);
		//c1의 색상=white, 변속기=auto, 문의 개수=4
		System.out.println("c2의 색상=" + c2.color + ", 변속기=" + c2.gearType + ", 문의 개수=" + c2.door);
		//c2의 색상=white, 변속기=auto, 문의 개수=4
		
		c1.door=100;
		
		System.out.println("c1의 색상=" + c1.color + ", 변속기=" + c1.gearType + ", 문의 개수=" + c1.door);
		//c1의 색상=white, 변속기=auto, 문의 개수=100
		System.out.println("c2의 색상=" + c2.color + ", 변속기=" + c2.gearType + ", 문의 개수=" + c2.door);
		//c2의 색상=white, 변속기=auto, 문의 개수=4
		//인스턴스 c2는 c1을 복사하여 생성된 인스턴스지만, 서로 독립적으로 메모리공간에 존재하는 별도의 인스턴스이므로 c1의 값이 변경되어도 c2의 값이 영향을 받지 않는다.
	}
}