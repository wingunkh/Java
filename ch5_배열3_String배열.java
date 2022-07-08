//배열의 타입이 String인 경우에도 int배열의 선언과 생성 방법은 다르지 않다.

import java.util.Arrays; 

public class ch5_배열_String배열 {
	public static void main(String[] args) {
		String[] arr=new String[3]; //3개의 String 타입의 참조변수를 저장하기 위한 공간 마련, 이 때 참조형 변수의 기본값은 null이므로 각 요소의 값은 null로 초기화된다.
		arr[0]=new String("JA"); //기본적인 초기화
		arr[1]="VA"; //특별히 String 클래스만 큰 따옴표만으로 간략히 표현하는 것이 허용된다.
		
		String[] name= {"Kim","Hyun","Geun"};
		
		System.out.println(Arrays.toString(name)); //[Kim, Hyun, Geun] 출력
		
		for(String i : name) {
			System.out.println(i);
		}// Kim (enter) Hyun (enter) Geun 출력
	}
}