package ch07;

public class Human {
	// 멤버변수
	private String name;
	private int money;
	
	// 생성자
	public Human(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 버스를 타다
	public void takeBus(Bus targetBus) {
		System.out.println(this.name + "가 버스에 탑승합니다.");
		targetBus.take(1_000);
		this.money -= 1_000;
	}
	
	// 지하철을 타다
	public void takeSubway(Subway targetSubway) {
		System.out.println(this.name + "가 지하철에 탑승합니다.");
		targetSubway.take(1_200);
		this.money -= 1_200;
	}
	
	// 택시를 타다
	public void takeTaxi(Taxi targetTaxi) {
		System.out.println(this.name + "가 택시에 탑승합니다.");
		targetTaxi.take(10_000);
		this.money -= 10_000;
	}
	
}
