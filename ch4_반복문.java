//do-while문은 while문의 변형으로 조건식의 결과에 관계없이 최소한 한번은 수행될 것을 보장한다.

//숫자 중에 3의 배수가 포함되어 있으면 포함된 개수만큼 박수를 치는 369게임 프로그램
public class ch4_반복문 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			System.out.printf("i=%d ",i);
			
			int tmp=i;
			
			do {
				if(tmp%10%3==0 && tmp%10!=0) //tmp%10이 3의 배수인지 확인하는 조건문(0 제외)
					System.out.printf("짝!");
				
			}while((tmp/=10)!=0);
			//ex) tmp=99일 때, if문을 만족하여 박수 한번.
			//조건식이 참이며 tmp는 9가 되어 반복문 재수행.
			//if문을 만족하여 박수 한번 더. 그러므로 tmp=99일 때 박수 두번.
			
			System.out.println();
		}
	}
}