package ch16;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;

public class LabelEx2 extends MFrame{
	/*배열을 사용하는 목적*/
	/**/
	Label label[] = new Label[4];//new 라벨 4라고 배열이 만들어졌다는 소리.
	
	public LabelEx2() {
		super(230, 200);
		setTitle("Label Example2");
		String str = "오늘은 기분좋은 월요일";
//label[0].setBackground(MColor.rColor()); //라벨이라는 객체를 만든 것이 아니고, 배열이 만들어졌기 때문에 에러남. nullpointer

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




