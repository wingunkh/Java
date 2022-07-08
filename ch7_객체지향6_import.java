/*
	[import]
	: 소스코드 작성 시 다른 패키지의 클래스를 사용하려면 패키지명이 포함된 클래스 아름을 사용해야 한다. 하지만, 매번 패키지명을 붙여서 작성하는 것은 불편하다.
	이 때 import문으로 사용하고자 하는 클래스의 패키지를 미리 명시해주면 사용되는 클래스이름에서 패키지명은 생략할 수 있다.
	import문의 역할은 컴파일러에게 소스파일에 사용된 클래스의 패키지에 대한 정보를 제공하는 것이다.
	이클립스는 단축키 'ctrl+shift+o'를 누르면, 자동으로 import문을 추가해주는 편리한 기능을 제공한다.
	
	[import문의 선언]
	: import문은 package문 다음에, 그리고 클래스 선언문 이전에 위치해야 한다.
	그러므로 일반적인 소스파일의 구성은 다음의 순서로 되어있다.
	
	1) package문
	2) import문
	3) 클래스 선언
	
	[static import]
	: import문을 사용하면 클래스의 패키지명을 생략할 수 있는 것과 같이 static import문을 사용하면 static 멤버를 호출할 때 클래스 이름을 생략할 수 있다.
*/

import java.text.SimpleDateFormat;
import java.util.Date; //import문

import static java.lang.System.out;
import static java.lang.Math.*; //static import문

public class ch7_객체지향6_import {
	public static void main(String[] args) {
		Date today=new Date();
		
		SimpleDateFormat date=new SimpleDateFormat("yyyy/MM/dd"); //"오늘 날짜는 2022/07/08" 출력.
		SimpleDateFormat time=new SimpleDateFormat("hh:mm:ss a"); //"현재 시간은 10:11:26 오후" 출력.
		
		System.out.println("오늘 날짜는 "+date.format(today));
		System.out.println("현재 시간은 "+time.format(today));
		out.println("Math.PI :"+PI); //"Math.PI :3.141592653589793" 출력.
	}
}