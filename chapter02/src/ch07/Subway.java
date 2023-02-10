package ch07;

public class Subway {
	// 멤버변수
	private int subwayNumber;  // 지하철 번호
	private int money;  // 수익금
	
	// 생성자
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	// 기능 : 승객을 태우다
	public void take(int money) {
		this.money += money;
	}
	
	
}
