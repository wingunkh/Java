//버블 정렬 알고리즘이란? 서로 인접한 두 원소를 검사하여 정렬하는 알고리즘이다.

public class ch5_배열_활용_버블정렬 {

	public static void main(String[] args) {
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] = (int)(Math.random()*10));
		}
		System.out.println();
		
		for(int i=0;i<arr.length-1;i++) {
			//외부 반복문이 실행될 때 마다 배열의 마지막 요소에서부터 배열의 첫번째 요소 방향으로 최대값이 저장된다.
			//그러므로 배열의 첫번째 요소는 자동결정되며 배열의 크기가 n일 때 외부 반복문의 반복 횟수는 n-1회이다.
			boolean changed=false; //자리바꿈이 발생했는지를 확인하는 boolean형 변수이다. 매 반복마다 false로 초기화된다.
			
			for(int j=0;j<arr.length-1-i;j++) {
				//외부 반복문이 실행될 때 마다 배열의 마지막 요소에서부터 배열의 첫번째 요소 방향으로 최대값이 저장된다.
				//이러한 요소들은 자리바꿈 대상에서 제외해야 한다.
				//그러므로 내부 반복문의 반복 횟수는 n-1-i이다.
				if(arr[j]>arr[j+1]) { //왼쪽의 값이 오른쪽 값보다 크다면 서로 바꾼다.
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
					changed=true; //자리바꿈이 발생했으므로 changed의 값을 true로 변경
				}
			}
			
			if(!changed) break; //changed의 값이 false라면 (자리바꿈이 없었으면) 반복문을 벗어난다.
			
			for(int k=0;k<arr.length;k++)
				System.out.print(arr[k]);
			
			System.out.println();
		}
	}
}