package ch05Ex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LeapYearFrame extends JFrame implements ActionListener, KeyListener {
	
	private JPanel panel1;
	private JLabel label; // 항목이름
	private JTextField textField; // 입력
	private JButton button; // 실행 버튼 
	private JPanel panel2;
	private boolean isStart; // 이벤트 실행 여부
	private LeapYear leapYear; // 윤년 계산 클래스
	
	public LeapYearFrame() {
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
		textField = new JTextField("", 8);
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
		textField.addKeyListener(this);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font f = new Font("맑은 고딕", Font.BOLD, 18);
		g.setFont(f);
		// 방어적 코드
		if (isStart == false) {
			g.drawString("공백 없이 숫자를 입력해주세요.", 20, 180);
			return;  // 입력되지 않은 상태면 밑 코드 실행 X
		}
		LeapYear leapYear = new LeapYear();
		
		// 입력 값이 잘못되었을 때를 대비한 예외 처리
		try {
			int targetYear = Integer.parseInt(textField.getText());
			boolean result = leapYear.isLeapYear(targetYear);
			
			if (result == true) {
				// 하고 싶은 것 : 텍스트의 길이와 관계 없이 가운데 정렬하기
				// paint 메서드는 텍스트를 삽입한다기보다는 그린다는 의미로 이해해야 함.
				// -> 이 자체를 정렬하기는 어렵고, targetYear의 글자 개수로 세서
				//      if 문으로? 분리해서 하기
				// 아니면 JLabel로 해서 FlowLayout.Center로 해도 될듯?
				// 일단 그냥 왼쪽 정렬로 ..
				g.drawString(targetYear + "년은 윤년입니다.", 20, 180);
			} else {
				g.drawString(targetYear + "년은 윤년이 아닙니다.", 20, 180);			
			}
			// 텍스트 필드에 입력한 값을 초기화함
			textField.setText("");
		} catch (Exception e) {
			// 숫자가 아닌 문자를 입력해서 오류가 발생한 경우
			g.drawString("공백 없이 숫자를 입력해주세요.", 20, 180);
			// 텍스트 필드에 입력한 값을 초기화함
			textField.setText("");
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼을 누르면 실행되도록 하기
		isStart = true;
		repaint();
		
	}
	
	public static void main(String[] args) {
		new LeapYearFrame();
	} // end of main

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// 엔터를 눌렀을 때 실행되도록 하기 (엔터 키의 키 코드 = 10)
		if (e.getKeyCode() == 10) {
			isStart = true;
			repaint();
		}		
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
} // end of class
