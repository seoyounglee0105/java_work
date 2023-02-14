package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx2 extends JFrame {

//	JButton button1;
//	JButton button2;
//	JButton button3;
	
	JButton[] buttons = new JButton[3];
	
	public NoLayoutEx2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("좌표 기반 배치 2");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼 " + (i + 1));
		}
				
		buttons[0].setSize(70, 440);
		buttons[1].setSize(380, 70);
		buttons[2].setSize(100, 200);
	}
	
	private void setInitLayout() {
		setLayout(null);
		
		buttons[0].setLocation(10, 10);
		buttons[1].setLocation(90, 380);
		buttons[2].setLocation(50, 200);
		
		for (int j = 0; j < buttons.length; j++) {
			add(buttons[j]);
		}
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NoLayoutEx2();
	}
	
	
}
