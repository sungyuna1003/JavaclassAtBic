package ch16;

import java.awt.Frame;
import java.awt.Label; //11번 label 컨트롤+스페이스->awt 누르면 이것 자동생성
import java.awt.event.WindowEvent;
/*AWT만드는 방법
 * 1.필요한 컴포넌트(=창)를 생성한다.
 * 2.컴포넌트를 컨테이너(Frame->MFrame 추가)
 * 3.레이아웃 메니저를 사용한다.
 * 4.이벤트를 기능추가(뒤에...)*/
public class LabelEx1 extends MFrame{
	
	Label label1, label2, label3, label4; //변수생성: 이름만 만들어놓은 상태. new 가 나와야지 객체 생성
	
	public LabelEx1() {
		super(230, 200);
		setTitle("Label Example");
		String str = "오늘은 한주가 시작되는 월요일";
		// 상수를 왜 선언하는지 밑에서 나옴.
		label1 = new Label(str); //상수 
		label2 = new Label(str, Label.CENTER); //(str.1상수)해도 에러 안남.label.center는 유추가능
		label2.setBackground(MColor.rColor()); //색이 랜덤하게 나오는 컬러
		label3 = new Label(str, Label.RIGHT);
		label3.setBackground(MColor.rColor());
//label4.setForeground(MColor.rColor()); //4부분의 글자 색 랜덤하게 만들기 하지만 에러남. 객체의 주소값(포인트)가 null이라서. 25번까지는 객체 생성 안되고 26부터 객체 생성(new 선언)
		label4 = new Label(str, Label.LEFT);
		label4.setForeground(MColor.rColor()); //25의 부분을 27로 내렸더니 에러 사라짐.
		add(label1);add(label2);add(label3);add(label4);
		validate();
	}

	public static void main(String[] args) {
		new LabelEx1();
	}
}




