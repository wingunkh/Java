//기존에는 메서드의 매개변수가 고정적이었으나 JDK1.5부터 동적으로 지정해 줄 수 있게 되었으며, 이 기능을 가변인자(variable arguments)라고 한다.
//가변인자는 '타입... 변수명'과 같은 형식으로 선언하며, 가변인자 외에도 매개변수가 더 있다면 구별을 위해 가변인자를 매개변수 중에서 제일 마지막에 선언해야 한다.
//가변인자 만을 매개변수로 가지는 메서드를 호출 할 때는 인자가 아예 없어도 된다. 가변인자는 내부적으로 배열을 이용하기에 배열도 인자가 될 수 있다.

public class ch6_객체지향9_가변인자 {

	public static void main(String[] args) {
		String[] strArr= {"100", "200", "300"};
		
		System.out.println(concatenate("","100","200","300")); //100200300 출력.
		System.out.println(concatenate("-",strArr)); //100-200-300 출력.
		System.out.println(concatenate(",",new String[] {"1","2","3"})); //1,2,3, 출력.
		System.out.println("[" + concatenate(",",new String[0]) + "]"); //[] 출력.
		System.out.println("[" + concatenate(",")+"]"); //[] 출력.
		//가변인자로 매개변수를 선언했기 때문에 문자열을 개수의 제약없이 매개변수로 지정할 수 있다.
	}
	
	static String concatenate(String delim, String... args) {
		String result="";
		
		for(String str : args) { //향상된 for문
			result += str + delim;
		}
		
		return result;
	}
}