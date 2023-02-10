package ch05;

public class Bus {
	
	// 멤버변수
	int busNumber; // 버스 번호
	int passengerCount; // 승객 수
	int money; // 수익금
	
	// 생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 기능 1 : 승차시키다
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	// 기능 2 : 상태 창
	public void showInfo() {
		System.out.println("====================");
		System.out.println("버스 번호 : " + this.busNumber);
		System.out.println("승객 수 : " + this.passengerCount + "명");
		System.out.println("수익 금액 : " + this.money + "원");
		System.out.println("====================");
	}
	
}
