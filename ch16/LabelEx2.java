package ch16;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;

public class LabelEx2 extends MFrame{
	/*�迭�� ����ϴ� ����*/
	/**/
	Label label[] = new Label[4];//new �� 4��� �迭�� ��������ٴ� �Ҹ�.
	
	public LabelEx2() {
		super(230, 200);
		setTitle("Label Example2");
		String str = "������ ������� ������";
//label[0].setBackground(MColor.rColor()); //���̶�� ��ü�� ���� ���� �ƴϰ�, �迭�� ��������� ������ ������. nullpointer

		for (int i = 0; i < label.length; i++) {
			label[i] = new Label(str,  Label.CENTER);
			Color c[] = MColor.rColor2();
			label[i].setBackground(c[0]);
			label[i].setForeground(c[1]);
			add(label[i]);
		}
		
		validate();
	}

	public static void main(String[] args) {
		new LabelEx2();
	}
}



