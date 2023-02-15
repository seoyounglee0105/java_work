package ch06;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.zip.CheckedOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ColorChangeFrame extends JFrame implements ActionListener {
// 이벤트 리스너에 대한 개념을 알자
	//실행의 흐름을 만들 수 있다
	private JButton button1;
	private JButton button2;
	private JButton button3;
	
	public ColorChangeFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(3);
		button1 = new JButton("click 1");
		button2 = new JButton("click 2");
		button3 = new JButton("click 3");
		
	}
	
	private void setInitLayout() {
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		add(button3);
		setVisible(true);
	}
	
	private void addEventListener() {
		ActionListener actionListener;
		// 자기 자신 ColorChangeFrame은 다형성이 적용되어서
		// ActionLstener 타입으로도 바라볼수 있음
		// 이벤트 리스너 등록
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new ColorChangeFrame();
	} // end of main
	
	// actionPerformed 메서드가 호출되어짐
	@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("actionPerformed 메서드 호출됨");
			System.out.println(e.toString());
			this.setBackground(Color.blue);
		
		}
	
}
