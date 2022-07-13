/*
	응용프로그램이 실행되면, JVM은 시스템으로부터 프로그램을 수행하는데 필요한 메모리를 할당받고 JVM은 이 메모리를 용도에 따라 여러 영역으로 나누어 관리한다.
	
	[메서드 영역]
	: 프로그램 실행 중 어떤 클래스가 사용되면, JVM은 해당 클래스의 클래스파일을 읽어서 분석하여 클래스 데이터를 이곳에 저장한다.
	이 때, 그 클래스의 클래스변수도 이 영역에 함께 생성된다.
	
	[힙]
	: 인스턴스가 생성되는 공간. 프로그램 실행 중 생성되는 인스턴스는 모두 이곳에 생성된다.
	즉, 인스턴스변수도 이 영역에 함께 생성된다.
	
	[호출스택]
	: 호출스택은 메서드의 작업에 필요한 메모리 공간을 제공한다. 메서드가 호출되면, 호출스택에 호출된 메서드를 위한 메모리가 할당되며,
	이 메모리는 메서드가 작업을 수행하는 동안 지역변수들과 연산의 중간결과 등을 저장하는데 사용된다.
	그리고 메서드가 작업을 마치면 할당되었던 메모리공간은 반환되어 비워진다.
	
	호출스택의 특징
	- 메서드가 호출되면 수행에 필요한 만큼의 메모리를 스택에 할당받는다.
	- 메서드가 수행을 마치고 나면 사용했던 메모리를 반환하고 스택에서 제거된다.
	- 호출스택의 top에 있는 메서드가 현재 실행 중인 메서드이다.
	- bottom에 있는 메서드가 바로 위의 메서드를 호출한 메서드이다.
*/

public class ch6_객체지향_c_JVM메모리구조 { //각 메서드의 시작과 종료의 순서를 확인하는 예제
	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음.");
		firstMethod();
		System.out.println("main(String[] args)이 끝났음.");
	}
	
	static void firstMethod() { //static 메서드: 객체를 생성하지 않고도 호출할 수 있는 메서드이다.
		System.out.println("firstMethod()이 시작되었음.");
		secondMethod();
		System.out.println("firstMethod()이 끝났음.");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()이 시작되었음.");
		System.out.println("secondMethod()이 끝났음.");
	}
	
	/*
		main(String[] args)이 시작되었음.
		firstMethod()이 시작되었음.
		secondMethod()이 시작되었음.
		secondMethod()이 끝났음.
		firstMethod()이 끝났음.
		main(String[] args)이 끝났음.
	*/
}