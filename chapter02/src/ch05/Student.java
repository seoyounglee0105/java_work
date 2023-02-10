package ch05;

public class Student {
	
	// 멤버변수
	String name;
	int money;
	
	// 생성자
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 기능 1 : 학생이 버스를 탄다
	public void takeBus(Bus targetBus) { // Bus 클래스를 참조 자료형으로 받음
		System.out.println("takeBus 메서드 실행됨");
		// 버스 요금 : 1000
		targetBus.take(1_000);
		this.money -= 1_000;
	}
	
	// 기능 2 : 학생이 지하철을 탄다
	public void takeSubway(Subway targetSubway) {
		System.out.println("takeSubway 메서드 실행됨");
		// 지하철 요금 : 1200
		targetSubway.take(1_200);
		this.money -= 1_200;
	}
	
	// 기능 3 : 상태 창
	public void showInfo() {
		System.out.println("====================");
		System.out.println("학생 이름 : " + this.name);
		System.out.println("학생 소지금 : " + this.money + "원");
		System.out.println("====================");
	}
	
}
