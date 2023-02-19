package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

// 방향키를 누르면 조금씩 움직이게 하기

public class MoveLabelFrame extends JFrame{
	
	private JLabel labelText;
	private int labelTextX;
	private int labelTextY;
	private int sizeX;
	private int sizeY;
	
	public MoveLabelFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		sizeX = 800;
		sizeY = 800;
		setSize(sizeX, sizeY);
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
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
//				int currentX = labelText.getX(); // 현재 x좌표
//				int currentY = labelText.getY(); // 현재 y좌표
				
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					int x = labelTextX += 50;
					int y = labelTextY;
		
					int xMax = sizeX - labelText.getWidth();

					if (x >= xMax) {
						x = xMax;
					}
						labelText.setLocation(x, y);
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					int x = labelTextX -= 50;
					int y = labelTextY;
					
					labelText.setLocation(x, y);
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					int x = labelTextX;
					int y = labelTextY -= 50;
					// 왼쪽 위가 (0, 0)라서 -해야 위로 올라감
					
					labelText.setLocation(x, y);
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					int x = labelTextX;
					int y = labelTextY += 50;
					
					labelText.setLocation(x, y);
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public static void main(String[] args) {
		new MoveLabelFrame();
	}
}
