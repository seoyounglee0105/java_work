package ch03;

import java.awt.Graphics;
import java.awt.Paint;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 내부 클래스, 외부 클래스

// 외부 클래스 선언 - outer class
public class MyFrame1 extends JFrame {

	MyDrawPanel drawPanel;
	
	// 내부 클래스 선언 - inner class
	// 내부 클래스의 종류 : 정적 클래스 / 인스턴스 클래스
	// 정적 클래스 : static 키워드가 붙는 클래스
	// new하지 않아도 접근 가능, 클래스 이름으로 접근 가능
	// 인스턴스 클래스 : 외부 클래스와 내부 클래스가 모두 new되어야 사용 가능
	class MyDrawPanel extends JPanel {
		
		// 혼동하지 않기 : paints, print
		@Override
		public void paint(Graphics g) {
			
			super.paint(g);
			//           x좌표, y좌표, 가로길이, 세로길이
			g.drawRect(100, 100, 100, 200);
			g.drawRect(100,  50, 50,  50);
			g.drawString("반가워", 300, 300);
			// 선 그리기        x1, y1, x2, y2
			g.drawLine(250, 300, 500, 550);
			// 원 그리기
			g.drawOval(300, 300, 50, 50);
		}
	}
	
	JPanel jPanel;
	
	public MyFrame1(){
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("내부 클래스란");
		setSize(600,600);
		setDefaultCloseOperation(3);
		drawPanel = new MyDrawPanel();
		
	}
	
	private void setInitLayout() {
		add(drawPanel);
		
		setVisible(true);
	}
	
} // end of class
