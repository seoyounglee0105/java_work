package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		ThreeDPrinter3 threeDPrinter3 = new ThreeDPrinter3();
		// 재료 넣기
		threeDPrinter3.setMaterial(plastic);
		
		// 재료 꺼내보기
		Plastic usePlastic = (Plastic) threeDPrinter3.getMaterial(); // 다운 캐스팅
		
		// => 재료가 바뀔 때마다 수정해야 해서 번거롭다.
		
		// Object 클래스를 이용하는 것에는 불편한 점들이 있다.
		// 다운 캐스팅 처리를 해야 하고
		// 런타임 시점에 잘못된 처리를 하면 예외를 발생시킬 수 있다. => ch03
		
	}

}
