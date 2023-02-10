package ch05;

public class Subway {

	// 멤버변수
	int lineNumber;
	int passengerCount;
	int money;
	
	// 생성자
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// 기능 1 : 승차시키다
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	// 기능 2 : 상태 창
	public void showInfo() {
		System.out.println("====================");
		System.out.println("지하철 호선 : " + this.lineNumber);
		System.out.println("승객 수 : " + this.passengerCount + "명");
		System.out.println("수익 금액 : " + this.money + "원");
		System.out.println("====================");
	}
}
