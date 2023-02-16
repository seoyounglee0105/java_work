package ch09;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrameSolution extends JFrame {

	JButton button;
	Boolean isStart = false;
	
	public LottoFrameSolution() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("Lotto Game");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("Game Start");
	}

	private void setInitLayout() {
		// root 패널의 레이아웃은 기본값인 BorderLayout을 사용함
		add(button, BorderLayout.SOUTH); // 버튼을 위쪽에 추가
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// 그림을 그릴 때 처음 상태, 버튼을 누른 상태로 구분해서 그리기
		if (isStart == false) {
			g.drawString("게임을 실행해주세요.", 150, 150);
			return;
		}
		
		// 정렬된 난수 값을 받음
		LottoRandomNumberSolution lottoRandomNumberSolution = new LottoRandomNumberSolution();
		int[] getNumbers = lottoRandomNumberSolution.createNumber();
		
		// for 문으로 개선하기
		g.drawString(getNumbers[0] + "", 50, 150);
		g.drawString(getNumbers[1] + "", 150, 150);
		g.drawString(getNumbers[2] + "", 250, 150);
		g.drawString(getNumbers[3] + "", 350, 150);
		g.drawString(getNumbers[4] + "", 450, 150);
		g.drawString(getNumbers[5] + "", 550, 150);
	}
	
	private void addEventListener() {
		// 이벤트 등록
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				isStart = true;
				repaint();
			}
		});
	}

	
}
