package starcraft4;

public class GateWay {
	private String name;
	
	public GateWay() {
		this.name = "게이트웨이";
	}
	
	// 자료 구조 - 배열을 배워야 풀 수 있는 문제임
	// 기능 : 원하는 마릿수의 질럿 생산하기
	public Zealot[] createZealot(int count) {
		Zealot[] arr = new Zealot[count]; // Zealot 자료형의 값을 총 count개 만큼 받을 수 있는 배열 arr 생성 -> 변수 arr의 자료형은 Zealot[] 
		
		// index 값 : 모든 프로그래밍에서 인덱스는 0부터 시작
		for (int i = 0; i < count; i++) {
			System.out.println("질럿을 생산합니다");
			arr[i] = new Zealot("질럿 " + (i+1)); 			
		}
		return arr;
	}
	
	
}
	