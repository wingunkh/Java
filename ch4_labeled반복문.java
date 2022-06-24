/*
이름 붙은 반복문
: break문은 근접한 단 하나의 반복문만 벗어날 수 있기 때문에, 여러개의 반복문이 중첩된 경우에는 break문으로 중첩 반복문을 완전히 벗어날 수 없다. 
중첩 반복문 앞에 이름을 붙이고 break문과 continue문에 이름을 지정해 줌으로써 하나 이상의 반복문을 벗어나거나 반복을 건너뛸 수 있다.
*/

public class ch4_labeled반복문 {

	public static void main(String[] args) {
		Loop1:for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j==5) {
					//break Loop1;
					//break;
					//continue Loop1;
					//continue;
				}
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
	}
}

//break Loop1 주석 해제시: 반복문 Loop1을 벗어난다. 그러므로 2*1 ~ 2*4 까지 출력된다.
//break 주석 해제시: for문만을 벗어난다. 그러므로 2*1 ~ 2*4 ... 9*1 ~ 9*4 까지 출력된다. (띄어쓰기 포함)
//continue Loop1 주석 해제시: 반복문 Loop1의 다음 반복으로 넘어간다. 그러므로 2*1 ~ 2*4 ... 9*1 ~ 9*4 까지 출력된다. (띄어쓰기 미포함)
//continue 주석 해제시: for문의 다음 반복으로 넘어간다. 그러므로 *5를 제외한 구구단이 출력된다. (띄어쓰기 포함)