/*
	instanceof연산자
	: 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 instanceof연산자를 사용하며, 주로 조건문에 사용된다.
	왼쪽에는 참조변수가, 오른쪽에는 타입(클래스)이 피연산자로 위치한다.
	연산결과로 boolean값인 true 와 false 중의 하나를 반환한다.
*/

public class ch7_객체지향_l_instanceof연산자 {
	public static void main(String[] args) {
		FireEngine fe=new FireEngine();
		
		if(fe instanceof FireEngine) { //true
			System.out.println("This is a FireEngine instance.");
		}
		
		if(fe instanceof Car) { //true
			System.out.println("This is a Car instance.");
		}
		
		if(fe instanceof Object) { //true
			System.out.println("This is a Object instance.");
		}
	}
}

class Car {}
class FireEngine extends Car {}

/*
	3개의 출력문이 전부 출력된다.
	FireEngine클래스는 Object클래스와 Car클래스의 자식클래스이므로 부모의 멤버들을 상속받았기 때문에,
	FireEngine인스턴스는 Object인스턴스와 Car인스턴스를 포함하고 있는 셈이다.
	
	요악하면, 실제 인스턴스와 같은 타입의 instanceof연산 이외에 부모타입의 instanceof연산에도 true를 결과로 얻으며,
	instanceof 연산의 결과가 true라는 것은 '검사한 타입으로의 형변환을 해도 아무런 문제가 없다는 뜻'이다.
*/