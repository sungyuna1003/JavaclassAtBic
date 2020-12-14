package ch17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventEx1_1 extends MFrame {

	Button btn;

	public MouseEventEx1_1() {

		add(btn = new Button("버튼"), BorderLayout.SOUTH);
		// Adapter는 이벤트리스너를 구현한 추상클래스->필요한메소드만 구현
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackground(new MColor().rColor());
			}

			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(new MColor().rColor());
			}
		});
		validate();
	}

	          public static void main(String[] args) {
		          new MouseEventEx1_1();
	}

}
