/*
	[Vector클래스란?]
	: 동적으로 크기가 관리되는 객체배열을 제공해주는 클래스이다.
	내부적으로 Object타입의 배열을 가지고 있어서, 이 배열에 객체를 추가하거나 제거할 수 있게 작성되어있다.
	또한 배열의 크기를 알아서 관리해주기 때문에 저장할 인스턴스의 개수에 신경쓰지 않아도 된다.
	
	[Vector클래스의 주요 메서드]
	Vector() : 10개의 객체를 저장할 수 있는 Vector인스턴스를 생성한다.
	10개 이상의 인스턴스가 저장되면, 자동적으로 크기가 증가한다.
	
	boolean add(Object o) : Vector에 객체를 추가한다. 추가에 성공하면 결과값으로 true, 실패하면 false를 반환한다.
	
	boolean remove(Object o) : Vector에 객체를 제거한다. 제거에 성공하면 결과값으로 true, 실패하면 false를 반환한다.
	
	boolean isEmpty() : Vector가 비어있는지 검사한다. 비어있으면 결과값으로 true, 비어있지 않으면 false를 반환한다.
	
	Object get(int index) : 해당 인덱스의 객체를 반환한다. 반환타입이 Object타입이므로 적절한 타입으로의 형변환이 필요하다.
	
	int size() : Vector에 저장된 객체의 개수를 반환한다.
*/

import java.util.*; //Vector클래스를 사용하기 위해서 추가해 주었다.

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);
	}
	
	Product() {}
}

class Tv extends Product{
	Tv() {super(200);}
	public String toString() {return "Tv";}
}

class Computer extends Product{
	Computer() {super(100);}
	public String toString() {return "Computer";}
}

class Buyer{ 
	int money=1000; 
	int bonusPoint=0;
	Vector item = new Vector(); //구입한 제품을 저장하는데 사용될 Vector객체
	int i=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		item.add(p); //Vector에 객체를 추가
		System.out.println(p+"를 구매하셨습니다.");
	}
	
	void refund(Product p) {
		if(item.remove(p)) { //객체를 Vector에서 제거
			money+=p.price;
			bonusPoint-=p.bonusPoint;
			System.out.println(p+"를 반품하셨습니다.");
		}
		else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() {
		int sum=0;
		String itemList="";
		
		if(item.isEmpty()) { //Vector가 비어있는지 검사
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for(int i=0;i<item.size();i++) { //Vector에 저장된 객체의 개수를 반환
			Product p=(Product)item.get(i); //해당 인덱스의 객체를 반환
			sum+=p.price;
			itemList+=(i==0) ? ""+p : ", "+p;
		}
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
		System.out.println("구입하신 물품의 총 금액은 "+sum+"만원입니다.");
		System.out.println("누적된 마일리지는 "+bonusPoint+"만원입니다.");
	}
}

public class ch7_객체지향_o_Vector클래스 {
	public static void main(String[] args) {
		Buyer b=new Buyer();
		Tv tv=new Tv();
		Computer com=new Computer();
		
		b.buy(tv);
		b.buy(com);
		b.summary();
		
		System.out.println();
		
		b.refund(tv);
		b.summary();
	}
}

/*
	[출력문]
	Tv를 구매하셨습니다.
	Computer를 구매하셨습니다.
	구입하신 제품은 Tv, Computer입니다.
	구입하신 물품의 총 금액은 300만원입니다.
	누적된 마일리지는 30만원입니다.
	
	Tv를 반품하셨습니다.
	구입하신 제품은 Computer입니다.
	구입하신 물품의 총 금액은 100만원입니다.
	누적된 마일리지는 10만원입니다.
*/