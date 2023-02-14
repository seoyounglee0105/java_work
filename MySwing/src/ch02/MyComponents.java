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
		label = new JLabel("JLabel");
		textField = new JTextField("JTextField", 20);
		jPasswordField = new JPasswordField("JPasswordField", 10);
		checkBox = new JCheckBox("JCheckBox");
		
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