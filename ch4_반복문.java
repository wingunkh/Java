//JDK1.5부터 배열과 컬렉션에 저장된 요소에 접근할 때 기존보다 편리한 방법으로 처리할 수 있도록 for문의 새로운 문법이 추가되었다.

public class ch4_반복문 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int sum=0;
		
		for(int tmp : arr) { //타입 변수명 : 배열 또는 컬렉션
			//위의 문장에서 타입은 배열 또는 컬렉션의 요소의 타입이여야 한다.
			//배열 또는 컬렉션에 저장된 값이 매 반복마다 하나씩 순서대로 읽혀서 변수에 저장된다.
			System.out.println(tmp);
			sum+=tmp;
		}
		
		System.out.println();
		System.out.println("sum="+sum);
	}		
}