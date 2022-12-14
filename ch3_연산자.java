/*
연산자 우선순위는 대부분 상식적으로 판단이 가능하다.(단항 연산자의 우선순위가 이항 연산자보다 높다.) 예외적인 몇가지의 경우만 적어보겠다.
	1) x<<2+1
		쉬프트 연산자(<<)는 덧셈 연산자보다 우선순위가 낮다.
	2) data & 0xFF == 0
		비트연산자(&)는 비교연산자(==)보다 우선순위가 낮다.
	3) x<-1 || x>3 && x<5
		논리연산자 중 '&&'가 '||'보다 우선순위가 높다. 이처럼 OR와 AND가 함께 사용되는 경우는 괄호를 사용해서 명확히 표기하자.
		
연산자 결합방향은 대부분 왼쪽에서 오른쪽이다. 단항 연산자와 대입 연산자만 오른쪽에서 왼쪽이다.
	ex) x=y=3
		y=3
		x=3
		
산술 변환: 연산 수행 직전에 발생하는 피연산자의 자동 형변환
	1) 두 피연산자의 타입을 보다 큰 타입으로 같게 일치시킨다. (int와 float의 덧셈에서 int를 float로 자동 형변환)
	2) 피연산자의 타입이 int보다 작은 타입이면 int로 변환된다. (정수형의 기본타입인 int가 오버플로우의 위험이 적은 등 가장 효율적이기 때문이다.)
*/

import java.util.*;

public class ch3_연산자 {
	public static void main(String[] args) {
		byte a=10;
		byte b=20;
		//byte c=a+b;
		//에러 발생. byte는 int보다 작은 자료형이기 때문에 연산자 '+'는 이 두 피연산자들의 자료형을 int형으로 자동 형변환 시킨 다음 연산을 수행한다.
		
		char c='a'+1;
		//에러 미발생. 상수 또는 리터럴 간의 연산은 실행과정 동안 변하는 값이 아니기 때문에 컴파일 시 컴파일러가 계산하게 되며 실행 시 덧셈연산이 수행되지 않는다.
		
		//대문자를 소문자로 변환하는 프로그램
		Scanner scanner = new Scanner(System.in);
		System.out.print("대문자 알파벳을 하나 입력해주세요.>");
		String input=scanner.nextLine();
		char lowerCase=input.charAt(0);
		char upperCase=(char)(lowerCase+32); //예를 들어 A의 유니코드는 65, a의 유니코드는 97이므로 32를 더한다.
		System.out.println(upperCase);
		
		//반올림 기능을 제공하는 Math.round()함수
		double pi=3.141592;
		double shortPi=Math.round(pi*1000)/1000.0;
		System.out.println(shortPi);
		
		//두 문자열의 내용을 비교할 때 사용하는 equals()함수
		String str="abc";
		boolean result=str.equals("abc"); //두 문자열의 내용이 같으면 true, 다르면 false 반환.
		System.out.println(result);
		
		String str2=new String("abc");
		System.out.println(str2=="abc"); //내용이 같아도 서로 다른 객체이기 때문에 '=='로 비교하면 false를 반환한다.
	}
}