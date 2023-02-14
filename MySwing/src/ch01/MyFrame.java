package ch01;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	// 생성자
	public MyFrame() {
		// 제목
		setTitle("MyFrame01");
		
		// 창 크기 : width, height
		setSize(500, 500);
		
		// true : 창을 보이게 함, 기본값 false
		setVisible(true);
		
		// 설정해두지 않으면 매번 창을 끈 후 프로그램 종료 버튼을 눌러야 함
		// 설정하면 창을 끄면 프로그램도 같이 종료됨
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // JFrame 클래스 안에 상수로 선언되어 있는 값 가져오기 (3)
	}
	
	// 코드 테스트
	public static void main(String[] args) {
		new MyFrame();
		
		// GUI 관련 프로그램 학습 시에, <배치 관리자>를 먼저 명확히 이해하는 것이 좋음
		// 배치 관리자 = 레이아웃 : Button을 왼쪽에 배치할지, 오른쪽에 배치할지 등 이러한 배치를 설정해주는 것
		
		
		
	}
	
}
