//배열이란? 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것이다. 변수와 달리 배열은 각 저장공간이 연속적으로 배치되어 있다.

import java.util.Arrays; //Array.toString() 함수를 사용하기 위해 추가

public class ch5_배열_a_개념 {
	public static void main(String[] args) {
		int[] array; //배열 선언문. 배열을 선언하는 것은 단지 생성된 배열을 다루기 위한 참조변수를 위한 공간을 만드는 것이다.
		array=new int[5]; //배열 생성문. 값을 저장할 수 있는 공간을 만드는 것이다. new 연산자와 함께 배열의 타입과 길이를 지정한다. (배열의 길이는 0을 포함한 양의 정수)
		
		int[] score=new int[5]; //배열의 선언과 생성을 동시에 했다. 이제 참조변수 score를 통해서 생성된 배열에 값을 저장하거나 읽어올 수 있다.
		
		score[2]=100; //배열의 각 저장공간을 '배열의 요소' 라고 하며, 배열의 요소마다 붙여진 일련번호를 '인덱스'라고 한다. 인덱스의 범위는 '0부터 배열길이-1' 까지이다.
		
		for(int i=0;i<score.length;i++) { //배열의 길이를 직접 적어주는 것보다 '배열이름.length'를 사용하는 것이 좋다. 
			System.out.print(score[i]+",");
		} //0,0,100,0,0, 이 출력된다. (배열 요소는 자동적으로 int의 디폴트인 0으로 초기화된다.)
		System.out.println();
		
		score=new int[] {50,50,100,50,50}; //자바는 이렇게 배열을 간단히 초기화 할 수 있는 방법을 제공한다.
		
		int[] score2= {50,60,70,80,90}; //이와 같이 'new 타입[]'을 생략할 수도 있다. 단, 배열의 선언과 생성을 같이하는 경우에만 가능하다.
		
		System.out.println(Arrays.toString(score2)); //Array.toString() 함수를 사용하여 배열을 출력할 수 있다. [50, 60, 70, 80, 90]이 출력된다.
		System.out.println(score2); //참조변수에는 '배열의 주소'가 저장되어 있어야 하지만 참조변수를 직접 출력시 '타입@주소' 형식이 출력된다. 지금 진도와 맞지 않는 내용이므로 참고만 한다.
	}
}