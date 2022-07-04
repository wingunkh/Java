//메서드의 내부에서 메서드 자신을 호출하는 것을 '재귀호출'이라 하고, 재귀호출을 하는 메서드를 '재귀메서드'라 한다.
//반복문과 유사한 점이 많다. 재귀호출 역시 반복문과 같이 무한반복을 피하기 위한 조건문이 필수적으로 필요하다.
//반복문보다 재귀호출의 수행시간이 더 오래 걸린다.(매개변수 복사 등) 그러나 '논리적 간결함'이라는 큰 장점을 가지고 있다.

import java.util.*;

public class ch6_객체지향_재귀호출 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("팩토리얼 계산 프로그램");
		System.out.print("정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
		int n=Integer.parseInt(input);
		
		System.out.println(n+"! = "+factorial(n));
	}
	
	static int factorial(int n) {
		if(n<=0 || n>12) return -1; //유효성 검사(13!의 값이 메서드 factorial의 반환타입인 int의 최대값보다 크다.)
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
}