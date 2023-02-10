package ch08;

public class MainTest2 {

	public static void main(String[] args) {
		
		// 클래스 안에 멤버변수를 사용하려면 메모리에 올려야 함
		
		// 수행 요청 - 클래스명.
		System.out.println(NumberPrinter.waitNumber);  // 메모리에 아직 올리지 않았는데 멤버변수에 접근함
		NumberPrinter.waitNumber++;
		NumberPrinter.waitNumber++;
		NumberPrinter.waitNumber++;
		System.out.println(NumberPrinter.waitNumber); // static은 태양이다. (먼저 존재하고, 하나만 존재하고, 다같이 공유해서 사용한다.)
		                                                                                           // -> static은 new 하기 전에 더 먼저 실행되기 때문임
		
		// 정리
		// static은 문법적으로 class xxx {} 안에 작성하지만, (자바는 모든 코드가 클래스 안에 작성되어야 해서)
		// static 키워드를 가진 녀석은 잠시 자리만 빌려서 문법만 사용할 뿐, 메모리를 사용하는 영역은 미리 뜨는 static 영역이다

	}

}
