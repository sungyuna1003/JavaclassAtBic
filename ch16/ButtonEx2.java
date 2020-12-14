package ch16;

import java.awt.Button;
import java.awt.Color;

public class ButtonEx2 extends MFrame{
	
	Button btn[] = new Button[4];
	String str[] = {"�߰�", "����", "��ü����" , "����"};
	
	public ButtonEx2() {
		super(250,250);
		setTitle("Button Example2");
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(str[i]);
			Color c[] = MColor.rColor2();
			btn[i].setForeground(c[0]);
			btn[i].setBackground(c[1]);
			add(btn[i]);
		}
		
		setResizable(false);//ũ��� ����
		validate();
	}

	public static void main(String[] args) {
		new ButtonEx2();
	}
}




