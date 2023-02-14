package ch02;

import java.awt.FlowLayout;
import java.nio.charset.CharsetDecoder;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyComponents extends JFrame {

	private JButton button1;
	private JLabel label;
	private JTextField textField;
	private JPasswordField jPasswordField;
	private JCheckBox checkBox;
	
	
	public MyComponents() {
		initData();
		setInitLayout();
	}
		
	private void initData() {
		setTitle("컴포넌트 확인");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("JButton");
		label = new JLabel("글자를 적는 컴포넌트");
		textField = new JTextField("아이디 입력", 20);
		jPasswordField = new JPasswordField("비번 입력", 10);
		checkBox = new JCheckBox("동의");
		
	}
	
	private void setInitLayout() {
		add(button1);
		add(label);
		add(textField);
		add(jPasswordField);
		add(checkBox);
		
		setLayout(new FlowLayout());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyComponents();
	}
	
	
}