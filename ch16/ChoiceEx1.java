package ch16;

import java.awt.Choice;
import java.awt.Color;

public class ChoiceEx1 extends MFrame {
	
	String city[] = {"���ø� �����ϼ���.","������","�� ��",
			"�Ͽ���","�� ��","�� ��","�� ��"};
	Choice ch;
	
	public ChoiceEx1() {
		super(300, 300 , new Color(100,200,100));
		setTitle("Choice Example");
		ch = new Choice();
		for (int i = 0; i < city.length; i++) {
			ch.add(city[i]);
		}
		ch.select(3); //������(�� ���õ�)�� �� 3��(�Ͽ���) �����ϰ������
		add(ch);
	}

	public static void main(String[] args) {
		new ChoiceEx1();
	}
}



