/*
	자바에서는 한 클래스 내에 같은 이름의 메서드를 여러개 정의할 수 있다.
	이를 메서드 오버로딩, 또는 오버로딩이라고 한다.
	
	오버로딩의 조건
	1) 메서드 이름이 같아야 한다.
	2) 매개변수의 개수 또는 타입이 달라야 한다.
	(반환 타입은 오버로딩을 구현하는데 아무런 영향을 주지 못한다.)
*/

public class ch6_객체지향_i_오버로딩 {
	public static void main(String[] args) {
		MyMath mm=new MyMath();
		System.out.println("mm.add(3, 3) 결과:"+mm.add(3,3));
		System.out.println("mm.add(3L, 3) 결과:"+mm.add(3L,3));
		System.out.println("mm.add(3, 3L) 결과:"+mm.add(3,3L));
		System.out.println("mm.add(3L, 3L) 결과:"+mm.add(3L,3L));
		
		int[] a= {100,200,300};
		System.out.println("mm.add(a) 결과:"+mm.add(a));	
	}
}

class MyMath{
	//add()함수의 매개변수 개수 또는 타입을 다르게 하여 오버로딩 하였다.
	int add(int a,int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a,long b) {
		System.out.print("int add(int a, long b) - ");
		return a+b;
	}
	
	long add(long a,int b) {
		System.out.print("int add(long a, int b) - ");
		return a+b;
	}

	long add(long a,long b) {
		System.out.print("int add(long a, long b) - ");
		return a+b;
	}
	
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result=0;
		for(int i=0;i<a.length;i++) {
			result+=a[i];
		}
		return result;
	}
}