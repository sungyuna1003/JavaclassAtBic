package ch15;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;


public class FileWriterFrame extends MFrame
implements ActionListener{
	
	TextArea ta;
	TextField tf;
	Button save;
	
	public FileWriterFrame() {
		super(320, 400);
		setTitle("FileWriterFrame");
		add(ta=new TextArea());
		Panel p = new Panel();
		p.add(tf = new TextField(30));
		p.add(save = new Button("SAVE"));
		ta.setEditable(false);
		tf.addActionListener(this);
		save.addActionListener(this);
		add(p,BorderLayout.SOUTH);
		validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==tf) {
			ta.append(tf.getText()+"\n");
			tf.setText("");
			tf.requestFocus();
		}else if(obj==save) {
			saveFile(ta.getText());
			ta.setText("");
			for (int i = 5; i > 0; i--) { //-5  4 3 2 1 줄어들기
				ta.setText("저장 하였습니다. - " + i + "초 후에 사라집니다.");
 //--ta.append 하면 누적되니, setText로 적기
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} //1초 일을 하지마. 쓰레드만 쓰면 에러. 에러 부분 눌러서 try-catch 누르면 자동 변환
			}
		}
	}
	
	public void saveFile(String str) {
		try {
			long fName = System.currentTimeMillis();
			FileWriter fw = new FileWriter("ch15/"+fName+".txt");
			fw.write(str);
			fw.flush();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		new FileWriterFrame();
		//1970년1월1일~현재 : 1초 1000단위 계산된 값
		long fName = System.currentTimeMillis();
		//System.out.println(fName);
	}
}






