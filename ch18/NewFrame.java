package ch18;

import java.awt.Color;
import java.awt.Graphics;

public class NewFrame extends MFrame {

	int w, h , x , y;
	
	public NewFrame() {
		super(600, 600, Color.WHITE);
	}
	
	public void run() {
		try {
			for (int i = 0; i < 100000; i++) {
				x = (int)(Math.random()*600)+1;//1~600
				y = (int)(Math.random()*600)+1;//1~600
				w = (int)(Math.random()*20)+1;//1~20
				h = (int)(Math.random()*20)+1;//1~20
				Thread.sleep(1);//0.01초 동안 잠시 졸아라.
				repaint();
			}
		} catch (Exception e) {}
	}
	
	@Override
	public void update(Graphics g) {
		g.clipRect(x, y, w+1, h+1);//지정한 위치만 삭제
		paint(g);
	}
	//repaint -> update (생략가능) : 그렸든 부분 전부 삭제 -> paint
	@Override
	public void paint(Graphics g) {
		g.setColor(MColor.rColor());
		//g.drawRect(x, y, w, h);
		g.fillRect(x, y, w, h);
	}
	
	public static void main(String[] args) {
		NewFrame mf = new NewFrame();
		mf.run();
	}
}


