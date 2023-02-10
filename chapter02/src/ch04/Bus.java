package ch04;

// 객체와 객체 간에 상호 작용하는 코드 짜기
public class Bus {

	// 상태
	int busNumber; // 버스 번호
	int passengerCount; // 승객 수
	int money; // 수익금
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	
	// 기능
	// 기능 1 : 달리다
	public void run() {
		System.out.println("버스가 출발합니다.");
	}
	
	// 기능 2 : 승차시키다
	public void take(int count) {
//		this.passengerCount++;
//		this.money += 1_000;
		this.passengerCount += count;
		this.money += 1_000 * count;
		System.out.println(count + "명의 승객이 탑승합니다.");
	}
	
	// 기능 3 : 하차시키다
	public void takeOff(int count) {
		this.passengerCount -= count;
		System.out.println(count + "명의 승객이 내립니다.");
	}
	
	public void showInfo() {
		System.out.println("상태 창");
		System.out.println("버스 번호 : " + this.busNumber);
		System.out.println("승객 수 : " + this.passengerCount);
		System.out.println("수익금 : " + this.money);
	}
	
	
}
