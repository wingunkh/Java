//다형성에 대해 학습할 때 부모타입의 참조변수로 자식클래스의 인스턴스를 참조하는 것이 가능하다는 걸 배웠다.
//인터페이스 역시 해당 인터페이스 타입의 참조변수로 이를 구현한 클래스의 인스턴스를 참조할 수 있으며, 인터페이스 타입으로 형변환도 가능하다.

interface Parseable{
	public abstract void parse(String fileName); //구문분석 추상메서드
}

class ParserManager{
	public static Parseable getParser(String type) { //리턴타입이 인터페이스라는 것은 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 것을 의미한다. 중요.
		if(type.equals("XML"))
			return new XMLParser();
		else 
			return new HTMLParser();
	}
}

class XMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName+"- XML 구분분석 완료.");
	}
}

class HTMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName+"- HTML 구분분석 완료.");
	}
}

public class ch7_객체지향_r_인터페이스다형성 {
	public static void main(String[] args) {
		Parseable p=ParserManager.getParser("XML");
		p.parse("김현근.xml"); //"김현근.xml- XML 구분분석 완료." 출력.
		p=ParserManager.getParser("HTML");
		p.parse("김깜이.html"); //"김깜이.html- HTML 구분분석 완료." 출력.
	}
}