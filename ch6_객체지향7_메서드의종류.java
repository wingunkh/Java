/*
	[인스턴스 메서드]
	: 인스턴스 변수와 관련된 작업을 하는, 즉 메서드의 작업을 수행하는데 인스턴스 변수를 필요로 하는 메서드이다.
	인스턴스 변수는 인스턴스(객체)를 생성해야만 만들어지므로 인스턴스 메서드 역시 인스턴스를 생성해야만 호출 가능하다.
	
	[클래스 메서드]
	: 인스턴스와 관계없는, 즉 인스턴스 변수나 인스턴스 메서드를 사용하지 않는 메서드(static 메서드)이다.
	- 클래스를 설계할 때, 멤버변수 중 모든 인스턴스에 공통으로 사용하는 것에 static을 붙인다.
	- 클래스 변수(static 변수)는 인스턴스를 생성하지 않아도 사용할 수 있다.
	- 클래스 메서드(static 메서드)는 인스턴스 변수를 사용할 수 없으며, 인스턴스 메서드를 호출할 수 없다.
	그 이유는 인스턴스 멤버가 존재하는 시점에 클래스 멤버는 항상 존재하지만, 클래스멤버가 존재하는 시점에 인스턴스 멤버가 존재하지 않을 수도 있기 때문이다.
	- 메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려한다.
*/

class MyMath{
	long a,b;
	
	//인스턴스 메서드. 인스턴스 변수 a,b만을 이용해서 작업하므로 매개변수가 필요없다.
	long add() {return a+b;}
	long substract() {return a-b;}
	long multiply() {return a*b;}
	long divide() {return a/b;}
	
	//클래스 메서드. 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
	static long add(long a, long b) {return a+b;}
	static long substract(long a, long b) {return a-b;}
	static long multiply(long a, long b) {return a*b;}
	static long divide(long a, long b) {return a/b;}
}

public class ch6_객체지향7_메서드의종류 {
	public static void main(String[] args) {
		System.out.println(MyMath.add(200L, 100L)); //클래스 메서드 호출. 인스턴스 생성없이 호출 가능
		
		MyMath mm=new MyMath();
		mm.a=200L;
		mm.b=100L;
		System.out.println(mm.add()); //인스턴스 메서드 호출. 객체 생성 후에만 호출 가능
	}
}