package ch06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeRainbow extends JFrame implements ActionListener {

	// 버튼을 배치할 패널
	private JPanel panel1;
	
	// 배경 색을 변경할 패널
	private JPanel panel2;
	
	// 버튼 배열
	private JButton[] buttons = new JButton[5];
	
	// 배경 색 배열
	private Color[] colors = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue};
	
	public ChangeRainbow() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("배경 색 바꾸기");
		setSize(530, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel1 = new JPanel();
		panel2 = new JPanel();
		panel2.setBackground(Color.black);

		// 버튼 인스턴스화
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("click" + (i + 1));
		}
		
	}

	private void setInitLayout() {
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		
		panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		for (int i = 0; i < buttons.length; i++) {
			panel2.add(buttons[i]);
			
		}
		
		setVisible(true);
	}

	private void addEventListener() {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addActionListener(this);
		}
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// 다운 캐스팅
		JButton targetButton = (JButton) e.getSource();
		
		// 버튼별 배경 색 적용
		for (int i = 0; i < buttons.length; i++) {
			if (targetButton == buttons[i]) {
				panel1.setBackground(colors[i]);
			}
		
		}
	}
	
	// 코드 실행
	public static void main(String[] args) {
		new ChangeRainbow();
		
	} // end of main
	
} // end of class