//배열은 한번 생성하면 그 길이를 변경할 수 없다. 더 많은 저장공간이 필요하다면 보다 큰 배열을 만들고 이전 배열로부터 내용을 복사해야한다.

import java.util.Arrays;

public class ch5_배열_b_복사 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		int[] tmp=new int[arr.length*2]; //기존 배열보다 길이가 2배인 배열 생성
		
		//1) for문을 이용한 배열 복사. 배열의 요소 하나하나에 접근하여 복사하기에 비효율적이다.
		for(int i=0;i<arr.length;i++)
			tmp[i]=arr[i];
		
		arr=tmp; //참조변수 arr이 새로운 배열을 가리키게 된다.
		System.out.println(Arrays.toString(tmp)); //[1, 2, 3, 4, 5, 0, 0, 0, 0, 0] 출력
		
		//2) System클래스의 arraycopy()함수를 사용한 배열 복사. 지정된 범위의 값들을 한 번에 통째로 복사하기에 효율적이다.
		System.arraycopy(arr, 0, tmp, 0, arr.length); //5개의 매개변수를 가지고 있으며 arr배열의 0번째 요소부터 시작해서 arr.length개의 값을 tmp배열 0번째 요소에 복사한다.
		System.out.println(Arrays.toString(tmp)); //[1, 2, 3, 4, 5, 0, 0, 0, 0, 0] 출력
	}
}