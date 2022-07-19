/*
	 익명 클래스
	 : 다른 내부 클래스와 달리 이름이 없으며 클래스의 선언과 객체의 생성을 동시에 하기 때문에 단 한번만 사용될 수 있고 오직 하나의 객체만을 생성할 수 있는 일회용 클래스이다.
	 이름이 없기 때문에 생성자도 가질 수 없으며, 부모클래스의 이름이나 구현하고자 하는 인터페이스의 이름을 사용해서 정의한다.
	 (오로지 단 하나의 클래스를 상속받거나 단 하나의 인터페이스 만을 구현할 수 있다.)
*/

import java.awt.*;
import java.awt.event.*;

public class ch7_객체지향_w_익명클래스 {
	public static void main(String[] args) {
		Button b=new Button("Start");
		b.addActionListener(new ActionListener() { //익명 클래스의 시작
				public void actionPerformed(ActionEvent e) {
					System.out.println("ActionEvent occured!!!");
				}
			} //익명 클래스의 끝
		);
	}
}