//자바는 Scanner 클래스를 이용하여 화면으로부터 입력 받는다.
import java.util.*; //Scanner 클래스는 java.util 패키지에 내장되어 있다.

public class ch2_변수_c_입력 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Scanner 클래스의 객체 생성
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine(); // nextLine() 함수는 호출시 입력대기 상태에 있다가 입력을 마치고 엔터를 누르면 입력한 내용이 문자열로 반환된다.
		int num = Integer.parseInt(input); // parseInt() 함수는 문자열을 숫자로 변환한다.
		
		System.out.println("입력내용 :"+input);
		System.out.printf("num=%d\n",num);
	}
}