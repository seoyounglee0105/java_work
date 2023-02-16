package ch03;

public class GenericPrinterMainTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		// 사용 방법       <자료형 이름>
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();  // 해당 코드를 실행해야 .class 파일이 만들어지며, Generic의 자료형이 정해짐.
		// 제네릭을 사용하지 않는다면 int를 받는 GenericPrinter, String을 받는 Generic_, ... 이렇게 하나하나 다 정의를 해야 해서
		// class 파일이 너무 많아짐
		
		// 재료 넣기
//		genericPrinter.setMaterial(plastic);  // 컴파일 시점 오류 (인스턴스화에 입력한 자료형과 매개변수의 자료형이 다르면 오류라고 컴파일러가 알려줌)
		                                                                    // => Object 클래스를 사용할 때보다 안정적임.
																			// 가독성 UP (자료형 이름을 명시하므로)
		genericPrinter.setMaterial(powder);
		
		// 재료 꺼내기
		Powder usePowder = genericPrinter.getMaterial();  // 다운 캐스팅이 불필요해짐 (좀 더 간결~)
//		Plastic usePlastic = genericPrinter.getMaterial();   // 컴파일 시점 오류 (타입 미스매치)
		
		// 결론
		// 변수 이름이 동일하고, 기능이 동일할 때, 제네릭 프로그래밍을 설계하면
		// 보다 가독성이 높고 안정적인 프로그래밍을 만들 수 있다.         
		
	}
	
}
