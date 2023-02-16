package ch04Ex;

public class MainTest {

	public static void main(String[] args) {

		Cooker<Carrot> cooker1 = new Cooker<>();
		Cooker<Onion> cooker2 = new Cooker<>();
//		Cooker<Soap> cooker3 = new Cooker<>();
		
		// 재료 넣기
		cooker1.setFood(new Carrot());
		cooker2.setFood(new Onion());
		
		
	}

}
