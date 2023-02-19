package ch07;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class MouseEventListener1 extends JFrame{
	
	private JLabel labelText;
	private int labelTextX;
	private int labelTextY;
	
	public MouseEventListener1() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("클릭으로 문자열 이동시키기");
		setSize(500, 500);
		setDefaultCloseOperation(3);
		
		// 초깃값 세팅
		labelTextX = 200;
		labelTextY = 200;
		labelText = new JLabel("Hello World~");
		labelText.setSize(100, 10);
	}
	
	private void setInitLayout() {
		setLayout(null);
		labelText.setLocation(labelTextX, labelTextY);
		add(labelText);
		
		setVisible(true);
	}
	
	private void addEventListener() {
		this.addMouseListener(new MouseListener() {
			
			// 마우스로 클릭하면
			@Override
			public void mouseClicked(MouseEvent e) { 
				labelText.setLocation(e.getX(), e.getY());
				
			}
			
			// 마우스를 클릭하다가 떼면
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			// 마우스를 클릭하고 있으면
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			// 마우스 커서가 벗어나면
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
			// 마우스 커서가 올라가면 
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
		});
	}
	
	// 코드 실행
	public static void main(String[] args) {
		new MouseEventListener1();
	} // end of main
		
} // end of class
