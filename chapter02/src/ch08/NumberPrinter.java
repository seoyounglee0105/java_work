package ch08;

public class NumberPrinter {
	private int id;
//	private static int waitNumber;
	public static int waitNumber;
	
	// 생성자는 가장 먼저 실행되과, 한 번만수행이 됨ㅁ
	public NumberPrinter(int id) {
		this.id = id;
		this.waitNumber = 1;
	}
	
	// 번호표를 출력합니다.
	public void printwaitNumber() {
		System.out.println("대기 순번 " + waitNumber);
		waitNumber++;
	}
}
