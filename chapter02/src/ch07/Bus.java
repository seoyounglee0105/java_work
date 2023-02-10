package ch07;

	public class Bus {
		// 멤버 변수
		private int busNumber;  // 버스 번호
		private int money;  // 수익금
		
		// 생성자
		public Bus(int busNumber) {
			this.busNumber = busNumber;
		}
		
		// 기능 : 승객을 태우다
		public void take(int money) {
			this.money += money;
		}
		
		
}
