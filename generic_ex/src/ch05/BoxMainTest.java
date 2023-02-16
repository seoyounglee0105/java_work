package ch05;

public class BoxMainTest {

	public static void main(String[] args) {
		Box<Doll> box1 = new Box<>();
		Box<Robot> box2 = new Box<>();
		
		box1.put(new Doll());
		System.out.println("박스1이 비었는가? : " + box1.isEmpty());
		box2.put(new Robot());
		System.out.println("박스2가 비었는가? : " + box2.isEmpty());
		
		Doll doll = box1.take();
		System.out.println("박스1이 비었는가? : " + box1.isEmpty());
		
		

//		
//		String msg = box.take();
//		System.out.println("msg : " + msg);
//		System.out.println(box.isEmpty());
	}
}
