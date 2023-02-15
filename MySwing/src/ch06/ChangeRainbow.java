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

	// 버튼을 누르면 패널의 색이 무지개색으로 변경되도록 하기

	private JPanel panel1;
	private JPanel panel2;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;

	public ChangeRainbow() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("무지개색으로 변경하기");
		setSize(530, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel1 = new JPanel();
		panel2 = new JPanel();
		panel2.setBackground(Color.black);

		button1 = new JButton("click1");
		button2 = new JButton("click2");
		button3 = new JButton("click3");
		button4 = new JButton("click4");
		button5 = new JButton("click5");
		button6 = new JButton("click6");
		button7 = new JButton("click7");
		
	}

	private void setInitLayout() {
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		
		panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		panel2.add(button7);
		
		setVisible(true);
	}

	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
	}
	


	public static void main(String[] args) {
		new ChangeRainbow();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 다운 캐스팅
		JButton targetButton = (JButton) e.getSource();
		System.out.println(targetButton.getText());
		
		// 버튼을 배열로 선언해서 했더니 getText()가 인식안되는데 뭔지모르겠음 ㅠ
		if (targetButton.getText() == "click1") {
			panel1.setBackground(Color.red);
		} else if (targetButton.getText() == "click2") {
			panel1.setBackground(Color.orange);
		} else if (targetButton.getText() == "click3") {
			panel1.setBackground(Color.yellow);
		} else if (targetButton.getText() == "click4") {
			panel1.setBackground(Color.green);
		} else if (targetButton.getText() == "click5") {
			panel1.setBackground(Color.blue);
		} else if (targetButton.getText() == "click6") {
			panel1.setBackground(Color.DARK_GRAY);
		} else if (targetButton.getText() == "click7"){
			panel1.setBackground(Color.MAGENTA);
		}
	}
}
