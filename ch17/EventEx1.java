package ch17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEx1 extends MFrame implements ActionListener{
	/*이벤트 기능의 3대 요소
	 * 1.이벤트 소스
	 * 2.이벤트 소스를 클릭 또는 체크, 여러가지 이벤트를 하면 만들어지는 이벤트 객체가 있다.
	 * ex) ActionEvent 
	 * 3. 이벤트 핸들러:이벤트 소스(버튼)랑 이벤트 클래스랑 둘이 연결을 하기위해 
	 * 인터페이스를 하나 구현을 해야한다. XXXListener -> ActonListener*/
	   
	Button btn; //버튼을 클릭하면 ActionEvent가 객체가 생성: 미리 정해진것.
	
	public EventEx1() {
		add(btn = new Button("버튼"),
				BorderLayout.SOUTH);
//4. 이벤트 소스(btn) 랑 이벤트 핸들러를 연결: addXXXListenner
//	ch.addItemListener, tx.addKeyListener
		btn.addActionListener(this);
	}
	
	//이벤트 핸들러: 인터페이스 또는 메소드
	@Override
	public void actionPerformed(ActionEvent e) { //버튼누르면 이것이 호출
		setBackground(MColor.rColor());
	}
	
	public static void main(String[] args) {
		new EventEx1();
	}
}




