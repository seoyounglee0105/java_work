package ch05;

public class MainTest1 {

	// 메인 함수
	public static void main(String[] args) {
		
		Student studentKim = new Student("홍길동", 10_000);
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(100);
		
		// 객체와 객체 간에 메시지 전달하기 (상호 작용)
		
		studentKim.takeBus(bus100); // 홍길동이 버스를 탔다
		// bus100은 주솟값이 담긴 참조변수
		System.out.println("---------------");
		// 학생 정보 확인
		studentKim.showInfo(); // 홍길동의 소지금이 1000원 감소함
		// 버스 정보 확인
		bus100.showInfo(); // 홍길동이 지불한 버스 요금 1000원 
		                                    // -> 수익금 +1000, 승객 수 +1
		
		//-------------지하철
		Subway subwayLine1 = new Subway(1);
		Subway subwayLine2 = new Subway(2);
		
		studentKim.takeSubway(subwayLine2); // 홍길동이 지하철을 탔다
		// 학생 정보 확인
		studentKim.showInfo(); // 홍길동의 소지금이 1200원 감소함
		// 버스 정보 확인
		subwayLine2.showInfo();  // 홍길동이 지불한 지하철 요금 1200원
		                                               // -> 수익금 +1200, 승객 수 +1
		
		System.out.println("비교");
		subwayLine1.showInfo();
		
		
		
		
	} // end of main

} // end of class
