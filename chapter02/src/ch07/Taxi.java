package ch07;

public class Taxi {
	// 멤버변수
	private String taxiCompany;  // 택시 회사
	private int money;  // 수익금
	
	// 생성자
	public Taxi(String taxiCompany) {
		this.taxiCompany = taxiCompany;
	}
	
	// 기능 : 승객을 태우다
	public void take(int money) {
		this.money += money;
	}
}
