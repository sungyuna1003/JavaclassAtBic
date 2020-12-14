package ch17;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyEventEx2 extends MFrame{
	
	Button move;
	
	public KeyEventEx2() {
		super(400, 500, new Color(100,200,100));
		setLayout(null);
		move = new Button("move");
		move.setBounds(200, 250 , 50 ,30);
		move.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				String txt = KeyEvent.getKeyText(code);
//				System.out.println(code + " : " + txt);
				int x = move.getX();
				int y = move.getY();
				if(txt.equals("Right")) { //방향키대로 move 움직임
				    if(x>getWidth()-50) {return;}
					x+=10;
				}else if(txt.equals("Left")) {
					if(x<0) {return;}//방향키대로 움직였을 때, move가 화면 밖으로 못나가게 함
					x-=10;
				}else if(txt.equals("Up")) {
					if(y<30) {return;}
					y-=10;
				}else if(txt.equals("Down")) {
					if(y>getHeight()+30) {return;}
					y+=10;
				}
				move.setLocation(x, y);
			}
		});

		add(move);
		move.requestFocus();
		validate();
	}
	
	public static void main(String[] args) {
		new KeyEventEx2();
	}
}



