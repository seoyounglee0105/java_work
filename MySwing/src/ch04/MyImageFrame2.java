package ch04;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Paint;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ch04.MyImageFrame.ImagePanel;

public class MyImageFrame2 extends JFrame {
	
	private ImagePanel imagePanel; // 내부 클래스를 멤버 변수로 선언
	
	public MyImageFrame2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("이미지 연습");
		setSize(600, 600);
		setDefaultCloseOperation(3);
		imagePanel = new ImagePanel();
	}
	
	private void setInitLayout() {
		add(imagePanel);
		setVisible(true);
	}
	
	// 정적 - 내부 클래스
	static class ImagePanel extends JPanel{
		private Image image1;
		private Image image2;
		private Image image3;
		private Image image4;
		private Image image5;
		
		public ImagePanel() {
			image1 = new ImageIcon("image3.png").getImage();
			image2 = new ImageIcon("image4.png").getImage();
			image3 = new ImageIcon("image5.png").getImage();
			image4 = new ImageIcon("image6.png").getImage();
		}
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image1, 100, 100, 100, 100, null);
			g.drawImage(image2, 370, 10, 200, 200, null);
			g.drawImage(image3, 200, 300, 100, 100, null);
			g.drawImage(image4, 300, 200, 150, 150, null);
			g.drawOval(10, 10, 560, 540);
		}
	} // end of inner class
	
} // end of outer class
