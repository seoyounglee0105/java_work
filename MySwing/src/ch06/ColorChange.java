package ch06;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.CharsetDecoder;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChange extends JFrame implements ActionListener {
	
	// 배경색 적용하기 : 패널을 설정해서
	
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	
	public ColorChange() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(3);
		panel = new JPanel();
		button1 = new JButton("click 1");
		button2 = new JButton("click 2");
		
	}
	
	private void setInitLayout() {
		// Frame -> borderLayout
		add(panel);
		panel.setBackground(Color.yellow);
		panel.add(button1);
		panel.add(button2);
		
		setVisible(true);
		
	}
	
	private void addEventListener() {
		
		// this : ColorChange -> 다형성 적용 : ActionListener 타입으로 바라볼 수 있음
		button1.addActionListener(this);  // 버튼 클릭하면 이벤트
		button2.addActionListener(this);  // 버튼 클릭하면 이벤트
		
	}
	

	public static void main(String[] args) {
		new ColorChange();
		
		
	} // end of main
	
	// 약속된 메서드
	// 이벤트가 일어나면 운영체제가 actionPerformed 메서드를 호출시킴

	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getSource() : 리턴 타입 : Object
		
		// 다운 캐스팅
		JButton targetButton = (JButton) e.getSource();
		
//		targetButton.setText("눌러진 버튼입니다."); // 컴포넌트의 텍스트 변경

		System.out.println(targetButton.getText()); // 컴포넌트의 텍스트 가져오기
		
		// 버튼에 따라 색상 변경 //
//		if (e.getSource() == this.button1) { // 주소 값이 같으면 (동일한 객체면)
//			System.out.println("button1이 눌러 졌어요!");
//			panel.setBackground(Color.gray); // 이벤트 발생하면 패널의 배경색이 변함
//		} else {
//			System.out.println("button2가 눌러 졌어요!");
//			panel.setBackground(Color.yellow);
//		}
//		System.out.println("호출됨!!!");
		
		
		// 문제 : 문자열을 비교해서 색상을 변경시키는 코드를 작성해 주세요
		
		if (targetButton.getText() == "click 1") {
			panel.setBackground(Color.blue);
		} else {
			panel.setBackground(Color.red);
		}
		
	}

} // end of class
