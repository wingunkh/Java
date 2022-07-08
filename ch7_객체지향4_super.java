/*
	super()
	: this()와 마찬가지로 super()역시 생성자이다. 부모클래스의 생성자를 호출하는데 사용된다.
	생성자의 첫 줄에서 super()가 호출되어야 하는데, 그 이유는 자식클래스의 멤버가 부모클래스의 멤버를 사용할 수도 있으므로 부모의 멤버들이 먼저 초기화되어 있어야 하기 때문이다.
	이와 같은 부모클래스 생성자의 호출은 상속관계를 거슬러 올라가면서 계속 반복되며, Object()까지 가서야 끝이난다.
	
	그러므로 Object클래스를 제외한 모든 클래스 생성자의 첫 줄에는 다른 생성자 또는 부모의 생성자를 호출해야 한다.
	그렇지 않으면 컴파일러는 생성자의 첫 줄에 'super();'를 자동적으로 추가하게 되며 이로 인해 에러가 발생할 수 있다.
	
	결론은 부모클래스의 멤버변수는 이처럼 부모의 생성자에 의해 초기화되도록 해야 하는 것이다.
*/

public class ch7_객체지향4_super {
	public static void main(String[] args) {
		Point3D p3=new Point3D();
		System.out.println("p3.x="+p3.x); //100
		System.out.println("p3.y="+p3.y); //200
		System.out.println("p3.z="+p3.z); //300
	}
}

class Point{
	int x=10;
	int y=20;
	
	Point(int x,int y){
		this.x=x;
		this.y=y;
	} //컴파일 후 첫 줄에 super();가 추가된다.
}

class Point3D extends Point{
	int z=30;
	
	Point3D(){
		this(100,200,300);
	}
	
	Point3D(int x,int y,int z){
		super(x,y); //생성자의 첫 줄에서 정상적으로 super()를 호출했다.
		this.z=z;
	}
}