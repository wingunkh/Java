//형변환이란? 변수나 상수의 타입을 다른 타입으로 변환하는것. 형변환하고자 하는 변수나 상수 앞에 타입을 괄호와 함께 붙혀주면 된다.
//기본형에서 boolean을 제외한 나머지 타입들은 서로 형변환이 가능하다.
//그러나 기본형과 참조형 간의 형변환은 불가능하다.
//float타입의 값을 int타입으로 변환할 때 소수점 이하의 값은 반올림이 아닌 버림으로 처리된다.
//자동 형변환: 값의 범위가 작은 타입에서 큰 타입으로의 형변환은 생략할 수 있다.

public class ch2_변수_d_형변환 {
	public static void main(String[] args) {
		double d=85.4;
		int score=(int)d;
		
		System.out.println("score="+score);
		System.out.println("d="+d); //형변환 이후에도 피연산자에는 아무런 변화가 없다.
	}
}