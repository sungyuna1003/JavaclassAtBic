package ch17;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EventEx3 extends MFrame {

	Button btn; //버튼을 클릭하면 ActionEvent가 객체가 생성: 미리 정해진것.
	
	
	public EventEx3() {
		add(btn = new Button("버튼"),
				BorderLayout.SOUTH);
		//이벤트 소스랑 이벤트 핸들러(MY Action 연결)
		MyAction ma = new MyAction();
		btn.addActionListener(ma);
	}
		//내부클래스
		class MyAction implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(MColor.rColor());
			}
			}
		

	public static void main(String[] args) {

	}

}
