package ch07;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 방향키를 누르면 조금씩 움직이게 하기

public class MoveLabelFrame3 extends JFrame implements Moveable {
	
	private JLabel label;
	private int labelX;
	private int labelY;
	private int sizeX;
	private int sizeY;
	
	public MoveLabelFrame3() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		sizeX = 800;
		sizeY = 800;
		setSize(sizeX, sizeY);
		setDefaultCloseOperation(3);
		setResizable(false);
		labelX = 300;
		labelY = 350;
		label = new JLabel(new ImageIcon("images/image4.png"));
		label.setSize(250, 250);
	}
	
	private void setInitLayout() {
		setLayout(null);
		label.setLocation(labelX, labelY);
		add(label);
		
		setVisible(true);
	}
	
	private void addEventListener() {
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right();
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					left();
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					up();
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					down();
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
	}

	@Override
	public void left() {
		int x = labelX;
		int y = labelY;
		
		if (x > 0) {
			x = labelX -= 40;
		}
		
		label.setLocation(x, y);
	}

	@Override
	public void right() {
		int x = labelX;
		int y = labelY;

		int xMax = sizeX - label.getWidth();

		if (x < xMax) {
			x = labelX += 40;				
 		}
		
		label.setLocation(x, y);
	}

	@Override
	public void up() {
		int x = labelX;
		int y = labelY;
		// 왼쪽 위가 (0, 0)라서 -해야 위로 올라감
		
		if (y > 0) {
			y = labelY -= 40;
		}
		
		label.setLocation(x, y);
	}

	@Override
	public void down() {
		int x = labelX;
		int y = labelY;
		
		int yMax = sizeY - label.getHeight();
		
		if (y < yMax) {
			y = labelY += 40;			
		}
		
		label.setLocation(x, y);
	}
	
	public static void main(String[] args) {
		new MoveLabelFrame3();
	}
}
