package ch13;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MFrame extends Frame{

// 생성자
	public MFrame() {
		setSize(300,300);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
			//x 실행은 한번만 쓰기 때문에 익명클래스로 만듬
		} 
		});
	}
	
	public static void main(String[] args) {
		MFrame mf = new MFrame();

	}
	
}
