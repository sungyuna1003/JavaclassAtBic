package ch16;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckboxEx1 extends MFrame 
/*인터페이스 구현 ->추상메소드 오버라이딩*/
implements ItemListener{ //창 위에 나타나게 하기

	
	Checkbox cb1, cb2, cb3;
	Checkbox rb1, rb2, rb3;
	CheckboxGroup grp; //라디오버튼 그룹
	
	public CheckboxEx1() {
		super(220, 250);
		setTitle("Checkbox Example");
		add(cb1 = new Checkbox("선택1", false));
		add(cb2 = new Checkbox("선택2", true)); //선택된 상태로 실행
		add(cb3 = new Checkbox("선택3", false));
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		grp = new CheckboxGroup();
		add(rb1 = new Checkbox("라디오1",grp, true)); //체크된 상태로 실행
		add(rb2 = new Checkbox("라디오2", grp, false));
		add(rb3 = new Checkbox("라디오3", grp, false));

		
		validate();
	}
	//빈공간에 컨트롤+스페이스 하면 밑에 Override 가 자동생성
	@Override
		public void itemStateChanged(ItemEvent e) { //아이템(선택)상태가 변경되었을때
//		System.out.println("111111"); 
		   Checkbox cb = (Checkbox)e.getSource(); //선택하면 창 맨 위에 클릭한 설명이 나타남.
		   String str =cb.getLabel() + " : " +cb.getState();
		   setTitle(str);
	}
	
	public static void main(String[] args) {
      new CheckboxEx1();
	}

}
