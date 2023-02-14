package ch03;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame {

	// 내부 클래스를 활용해서
	// JPanel 를 상속받고 paint 메서드로 집 그리기
	
	MyDrawPanel drawPanel;
	JPanel jPanel;
	
	class MyDrawPanel extends JPanel {
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawRect(140, 260, 200, 140);
			// 지붕
			g.drawLine(240, 160, 100, 260);
			g.drawLine(100, 260, 380, 260);
			g.drawLine(240, 160, 380, 260);
			
			// 굴뚝
			g.drawLine(155, 180, 155, 220);
			g.drawLine(180, 180, 180, 203);
			g.drawLine(155, 180, 180, 180);
			
			// 굴뚝 연기
			g.drawArc(123, 118, 40, 40, 65, 234);
			g.drawArc(148, 112, 40, 40, 30, 120);
			g.drawArc(148, 123, 40, 40, -30, -120);
			g.drawArc(173, 118, 40, 40, 240, 234);
			
			//창문
			g.drawRect(170, 300, 20, 20);
			g.drawRect(190, 300, 20, 20);
			g.drawRect(170, 320, 20, 20);
			g.drawRect(190, 320, 20, 20);
			g.drawRect(167, 297, 46, 46);
			
			// 문
			g.drawRect(260, 300, 60, 100);
			g.drawRect(263, 303, 54, 97); 
			g.drawOval(300, 350, 8, 8); // 손잡이
			
			// 지형
			g.drawLine(0, 400, 600, 400);
			
			// 별
			g.drawString("★", 70, 90);
			g.drawString("★", 380, 30);
			g.drawString("★", 310, 110);
			g.drawString("★", 180, 50);
			
			// 달
			g.drawArc(390, 50, 70, 70, 190, 284);    // x좌표, y좌표, 너비, 높이, 시작점 각도, 그릴 각도
			g.drawArc(388, 54, 50, 50, 210, 240);   // 시작점 각도는 →가 0도           
			
		}
	} // end of inner class
	
	public MyFrame2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("내부 클래스 연습");
		setSize(500, 500);
		setDefaultCloseOperation(3);
		drawPanel = new MyDrawPanel();
	}
	
	private void setInitLayout() {
		add(drawPanel);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame2();
	}
	
} // end of outer class
