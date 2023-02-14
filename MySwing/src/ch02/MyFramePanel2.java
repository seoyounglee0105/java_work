package ch02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFramePanel2 extends JFrame {

	JButton[] buttons = new JButton[6];
	
	private JPanel panel1;
	private JPanel panel2;
	
	public MyFramePanel2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("패널 추가 연습");
		setSize(600, 400);
		setDefaultCloseOperation(3);
		
		panel1 = new JPanel();
		panel1.setBackground(Color.red);
		panel2 = new JPanel();
		panel2.setBackground(Color.yellow);
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼 " + (i + 1));
		}
		
	}
	
	private void setInitLayout() {
		add(panel1, BorderLayout.CENTER);
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		add(panel2, BorderLayout.SOUTH);
		panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		for (int j = 0; j < 3; j++) {
			panel1.add(buttons[j]);
		}
		
		for (int h = 3; h < buttons.length; h++) {
			panel2.add(buttons[h]);
		}
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFramePanel2();
	}
	
}
