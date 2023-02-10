package ch08;

public class NumberPrinter2 {
	private int id;
//	private static int waitNumber;
	public static int waitNumber;
	
	public NumberPrinter2(int id) {
		this.id = id;
//		this.waitNumber = 1;
	}
	
	// 번호표를 출력합니다.
	public void printWaitNumber() {
		System.out.println("대기 순번 " + waitNumber);
		waitNumber++;
	}
	
	// static이 붙으면 대부분 메서드가 아니라 함수
	// 객체가 올라가기 전에 사용할 수 있는 함수
	// id는 static이 아니라서 오류를 방지하기 위해 막음
	
	// static 메서드 안에서는 멤버변수를 활용할 수 없음
	// 객체가 메모리에 올라갔다고 보장할 수 없기 때문임
	public static int getWaitNumber(){
//		id = 100;
		return waitNumber;
	}
	
	
	// 테스트 코드
	public static void main(String[] args) {
		// 정적 변수는 클래스 이름으로 접근 가능
		NumberPrinter2.waitNumber++;
		NumberPrinter2.waitNumber++;
		NumberPrinter2.waitNumber++;
		System.out.println(NumberPrinter2.waitNumber);
		NumberPrinter2 numberPrinter2 = new NumberPrinter2(1);
		System.out.println(NumberPrinter2.waitNumber);
		System.out.println("-----------------");
		System.out.println(numberPrinter2.getWaitNumber());
		// 클래스 이름으로 static 메서드에 접근해서 호출할 수 있음
		// 객체 가 생성되기 전에 사용 가능
		NumberPrinter2.getWaitNumber();
		
		
	}
}
