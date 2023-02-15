package ch07;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

// 방향키를 누르면 조금씩 움직이게 하기

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
		setSize(800, 800);
		setDefaultCloseOperation(3);
//		setResizable(false);
		// 초깃값 세팅
		labelTextX = 300;
		labelTextY = 350;
		labelText = new JLabel("Hello World~");
		labelText.setSize(100, 100);
	}
	
	private void setInitLayout() {
		setLayout(null);
		labelText.setLocation(labelTextX, labelTextY);
		add(labelText);
		
		setVisible(true);
	}
	
	private void addEventListener() {
		this.addMouseListener(new MouseListener() {
			
			// 마우스를 클릭하다가 떼면
			@Override
			public void mouseReleased(MouseEvent e) {
				labelText.setLocation(e.getX(), e.getY());
				
			}
			
			// 마우스를 클릭하고 있으면
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			// 마우스 커서가 벗어나면
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			// 마우스 커서가 올라가면 
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			// 마우스로 클릭하면
			@Override
			public void mouseClicked(MouseEvent e) { 
				// TODO Auto-generated method stub
				
			}
		});
	}
		
}
