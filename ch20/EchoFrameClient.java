package ch20;
//cmd 가 계속 켜놔야지 이것이 작동
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketAddress;

public class EchoFrameClient extends MFrame
implements ActionListener{
	
	Button btn1, btn2;
	TextField tf1, tf2;
	TextArea ta;
	Panel p1, p2;
	BufferedReader in;
	PrintWriter out;
	int port = 8000;
	
	public EchoFrameClient() {
		super(350,400);
		setTitle("EchoFrameClient");
		p1 = new Panel();
		p1.add(new Label("HOST ",Label.CENTER));
		p1.add(tf1 = new TextField("127.0.0.1",25));
		p1.add(btn1 = new Button("Connect"));
		
		p2 = new Panel();
		p2.add(new Label("CHAT ",Label.CENTER));
		p2.add(tf2 = new TextField("",25));
		p2.add(btn2 = new Button("SEND"));	
		
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		add(p1,BorderLayout.NORTH);
		add(ta=new TextArea());
		add(p2,BorderLayout.SOUTH);
		validate();//갱신
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==tf1||obj==btn1) {
			//서버 접속
			connect(tf1.getText().trim());
			//비활성화
			tf1.setEnabled(false);
            btn1.setEnabled(false);
            tf2.requestFocus();//Host-> Connect 누르면 host와connect 비활성화
		}else if(obj==tf2||obj==btn2) {
		try {
			//tf2에 입력 된 문자를 서버로 보낸다.
			out.println(tf2.getText());
			//서버에서 에코 문자열이 온다.
			ta.append(in.readLine()+"\n");
			tf2.setText("");
			tf2.requestFocus();
		} catch (Exception e2) {
			e2.printStackTrace();
		}	
		}
	}
	//ServerSock에 접속한 시도하는기능
	public void connect(String host){
	    try {
			Socket sock = new Socket(host, port);
			in = new BufferedReader(new InputStreamReader(sock.getInputStream())); //->에코서버에서 복사함
			out = new PrintWriter(sock.getOutputStream(),true/*auto flush*/);//->에코서버에서 복사함
			//서버접속시 최초 받는 메세지를 ta 출력
			ta.append(in.readLine()+"\n"); //\n한칸 내려줘라
			tf2.requestFocus();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new EchoFrameClient();
	}
}





