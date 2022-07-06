//기본 생성자: 컴파일 시 소스파일의 클래스에 생성자가 하나도 정의되지 않은 경우 컴파일러는 자동적으로 기본 생성자를 추가하여 컴파일한다.

class Data1{
	int value;
}

class Data2{
	int value;
	
	Data2(int x){
		value=x;
	}
}

public class ch6_객체지향11_기본생성자 {
	public static void main(String[] args) {
		Data1 d1=new Data1(); //컴파일러가 기본 생성자를 추가해준다.
		//Data2 d2=new Data2(); //에러 발생. 이미 생성자가 Data2(int x)가 정의되어 있으므로 기본 생성자가 추가되지 않기 때문이다.
		Data2 d2=new Data2(100); //컴파일러가 자동적으로 기본 생성자를 추가해주는 경우는 '클래스 내에 생성자가 하나도 없을 때' 뿐이라는 것을 명심하자. 
	}
}