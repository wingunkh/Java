/*
	[포함]
	: 상속 이외에도 클래스를 재사용하는 또다른 방법이 있는데, 포함관계를 맺어주는 것이다.
	포함관계를 맺어주는 것이란 '한 클래스의 멤버변수로 다른 클래스 타입의 참조변수를 선언하는 것'이다.
	
	[상속관계를 맺어 줄 것인가, 포함관계를 맺어 줄 것인가?]
	: 'is-a'(상속)와 'has-a'(포함)를 넣어서 문장을 만들어보면 클래스 간의 관계가 보다 명확해진다.
	ex) 원 클래스와 점 클래스가 존재할 때, 'has-a'를 넣어서 만든 문장이 더 옳다는 것을 알 수 있다. (Circle has a Point.) 그러므로 포함관계를 맺어주는 것이 더 옳다.
*/

public class ch7_객체지향2_포함 {

	public static void main(String[] args) {
		Point[] p= {	new Point(100,100),
						new Point(140,50),
						new Point(200,100)
					};
		
		Triangle t=new Triangle(p);
		Circle c=new Circle(new Point(150,150),50);
		
		t.draw();
		c.draw();
	}
}

class Shape{
	String color="black";
	void draw() {
		System.out.printf("[color=%s]%n",color);
	}
}

class Point{
	int x;
	int y;
	
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	Point(){
		this(0,0);
	}
	
	String getXY() {
		return "(" + x + "," + y + ")";
	}
}

class Circle extends Shape{ //Circle과 Shape는 상속관계
	Point center; //Circle과 Point는 포함관계
	int r;
	
	Circle(){
		this(new Point(0,0),100);
	}
	
	Circle(Point center, int r){
		this.center=center;
		this.r=r;
	}
	
	void draw() {
		System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);	
	}
}

class Triangle extends Shape{ //Triangle과 Shape는 상속관계
	Point[] p=new Point[3]; //Triangle과 Shape는 포함관계
	
	Triangle(Point[] p) {
		this.p=p;
	}
	
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}