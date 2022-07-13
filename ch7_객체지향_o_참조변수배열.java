class Product{
	int price; //제품의 가격
	int bonusPoint; //마일리지
	
	Product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);
	}
	
	Product() {} //기본 생성자
}

class Tv extends Product{ //Tv의 가격은 200만원
	Tv() {super(200);}
	public String toString() {return "Tv";}
}

class Computer extends Product{ //컴퓨터의 가격은 100만원
	Computer() {super(100);}
	public String toString() {return "Computer";}
}

class Buyer{ //구매자 클래스
	int money=1000; //보유 금액
	int bonusPoint=0; //보유 마일리지
	Product[] item = new Product[10];
	//부모타입의 참조변수로 자식타입의 객체를 참조하는 것이 가능하다는 것을 배웠다.
	//그러므로 부모타입의 참조변수 배열을 사용하면, 공통의 부모를 가진 서로 다른 종류의 객체를 배열로 묶어서 다룰 수 있다.
	int i=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		item[i++]=p;
		System.out.println(p+"를 구매하셨습니다.");
	}
	
	void summary() {
		int sum=0;
		String itemList="";
		
		for(int i=0;i<item.length;i++) {
			if(item[i]==null) break;
			sum+=item[i].price;
			itemList+=item[i]+", ";
		}
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
		System.out.println("구입하신 물품의 총 금액은 "+sum+"만원입니다.");
		System.out.println("누적된 마일리지는 "+bonusPoint+"만원입니다.");
	}
}

public class ch7_객체지향_o_참조변수배열 {
	public static void main(String[] args) {
		Buyer b=new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		
		b.summary();
	}
}