package ch01;

import javax.swing.JFrame;

public class MyGameFrame extends JFrame {

	// 클래스 문법
	// 변수, 생성자, 메서드 ... (식은 사용할 수 없다)
	
	// 구현 클래스
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			// 따로 작업하고자 하는 사항을 지시
			for (int i = 0; i < 30; i++) {
				System.out.println("-");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}; 
	
	public MyGameFrame() {
		// 익명 클래스 + 메서드 체이닝 방식
		new Thread(this.runnable).start();
		
	}
	
	
	// 메인 쓰레드가 일하는 곳
	public static void main(String[] args) {
		MyGameFrame gameFrame = new MyGameFrame();
		Thread thread = new Thread(gameFrame.runnable);
		thread.start();
		
//		gameFrame.runnable.run();
		for (int i = 0; i < 100; i++) {
			System.out.println("i : " + i);
		}
	}
	
	
	
}
