package ch05Ex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LeapYearFrameError extends JFrame implements ActionListener {
	
	private JPanel panel1;
	private JLabel label; // 항목이름
	private JTextField textField; // 입력
	private JButton button; // 실행 버튼 
	private JPanel panel2;
	
	private LeapYear leapYear;
	
	public LeapYearFrameError() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("윤년 계산기");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 창 크기 조정 불가
		
		panel1 = new JPanel();
		panel1.setBackground(Color.cyan);
		panel2 = new JPanel();
		
		label= new JLabel("연도 입력 ");
		textField = new JTextField("", 10);
		button = new JButton("실행");
	}
	
	private void setInitLayout() {
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.CENTER);
		
		panel1.add(label);
		panel1.add(textField);
		panel1.add(button);
	
		setVisible(true);	
	}
	
	private void addEventListener() {
		button.addActionListener(this);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		LeapYear leapYear = new LeapYear();
		// 방어적 코드
		if (textField.getText() != null) {
			int targetYear = Integer.parseInt(textField.getText());
			boolean result = leapYear.isLeapYear(targetYear);
			if (result == true) {
				g.drawString(targetYear + "년은 윤년입니다.", 100, 140);
			} else {
				g.drawString(targetYear + "년은 윤년이 아닙니다.", 100, 140);			
			}
		}
//		if (textField.getText() == null) {
//			return;  // 입력되지 않은 상태면 밑 코드 실행 X
//		}
//		int targetYear = Integer.parseInt(textField.getText());
//		boolean result = leapYear.isLeapYear(targetYear);
//		if (result == true) {
//			g.drawString(targetYear + "년은 윤년입니다.", 100, 140);
//		} else {
//			g.drawString(targetYear + "년은 윤년이 아닙니다.", 100, 140);			
//		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		
	}
	
	public static void main(String[] args) {
		new LeapYearFrameError();
	} // end of main
} // end of class
