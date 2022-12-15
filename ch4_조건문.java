//switch문은 if문과 달리 단 하나의 조건식으로 많은 경우의 수를 처리할 수 있고, 표현이 간결하여 가독성이 좋은 장점이 있는 조건문이다.
//처리할 경우의 수가 많은 경우에는 if문 보다 효율적이지만, 제약조건이 존재하기 때문에 어쩔 수 없이 if문으로 작성해야 되는 경우도 있다.
//switch문의 제약조건: 1) switch문의 조건식 결과는 정수 또는 문자열이어야 한다. 2) case문의 값은 정수 상수만 가능하며, 중복되지 않아야 한다.

import java.util.*;

//사용자와 컴퓨터가 가위바위보를 하는 간단한 게임 프로그램
public class ch4_조건문 {
	public static void main(String[] args) {
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
		
		Scanner scanner=new Scanner(System.in);
		int user=scanner.nextInt(); //화면을 통해 입력받은 숫자를 user에 저장
		int com=(int)(Math.random()*3)+1; //Math.random()함수는 0.0<=?<1.0 범위에 속하는 하나의 double 값을 반환한다. 그러므로 1,2,3 중 하나가 com에 저장된다.
		
		System.out.println("당신은 "+user +"입니다.");
		System.out.println("컴퓨터는 "+com +"입니다.");
		
		switch(user-com) { //제약조건 1. switch문의 조건식은 결과값이 반드시 정수 또는 문자열이어야 한다.
		case -1: //제약조건 2. case문의 값은 정수 상수만 가능하며, 중복되지 않아야 한다.
		case 2:
			System.out.println("당신이 졌습니다.");
			break; //break문은 각 case문의 영역을 구분하는 역할을 한다.
		case 1:
		case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
			break;
		default: //if문의 else블럭과 같은 역할을 한다.
			System.out.println("프로그램 에러.");
		}
	}
}