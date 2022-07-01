//문자열이란 문자를 연이어 늘어놓은 것을 의미하므로 문자열이 곧 char배열이다.
//그러나 자바에서는 char배열이 아니라 String클래스를 이용해서 문자열을 처리하는 이유는 String클래스가 char배열에 여러가지 기능을 추가하여 확장한 것이기 때문이다.

public class ch5_배열_String클래스 {
	public static void main(String[] args) {
		String jv="Java";
		jv="Java"+"!"; //단, String객체(문자열)은 읽을 수만 있을 뿐 내용은 변경할 수는 없다.
		System.out.println(jv); //Java! 출력. 문자열이 변경되는 것 같지만, 문자열은 변경할 수 없으므로 새로운 내용의 문자열이 생성된다.
		
		String str="ABCDE";
		
		char ch=str.charAt(2); //charAt()함수는 문자열에서 해당 위치(index)에 있는 문자를 반환하는 함수이다.
		System.out.println(ch); //C 출력.
		
		String tmp=str.substring(1,4); //substring(int from, int to) 함수는 문자열에서 해당 범위에 있는 문자열을 반환한다. (to는 범위에 포함되지 않음)
		System.out.println(tmp); //BCD 출력.
		
		if(str.equals("ABCDE")) { //equals()함수는 문자열의 내용이 같은지 확인하는 함수이며 true 또는 false를 반환한다.
			System.out.println("일치합니다.");
		}
	}
}