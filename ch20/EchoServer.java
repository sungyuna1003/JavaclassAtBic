package ch20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {


		
		int cnt = 0; //client �� ���� ����
		ServerSocket server;
		int port = 8000; //��Ʈ ��ȣ
		public EchoServer() {
			try {
				server = new ServerSocket(port);
				System.out.println("ServerSocket Stat**************");			
				while(true) {
					//Client �� ���� �Ҷ����� ������
					Socket sock=server.accept();//wait
					EchoThread et = new EchoThread(sock);
					et.start();//run �޼ҵ� ȣ��
					cnt++;
					System.out.println("Client"+cnt+"Socket");				
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
		//���ӵ� client �����ϱ� ���� Thread ��� ���� Ŭ����
	    class EchoThread extends Thread {
	    	
	    	Socket sock;
	    	BufferedReader in; //Client�� ������ �޼��� �޴� ��Ʈ��
	    	PrintWriter out; //Client�� �޼��� ������ ��Ʈ��
	    	
	    	
	       public EchoThread(Socket sock) {
	    	   try {
				this.sock = sock;
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				out = new PrintWriter(sock.getOutputStream(),true/*auto flush*/);
			} catch (Exception e) {
				e.printStackTrace();
			}
	    
			}
	    	
	    	@Override
	    	public void run() {
	    		try {
					//Client �� ù�޼���
	    			out.println("Hello Enter BYB to exit");
	    			while(true) {
	    				String line = in.readLine(); //Client ���� �޼����� ��� �ö����� ������
	    				if(line==null) {
	    					break; //Client ���� ������ ������ ��������.
	    				}else {
	    					out.println("Echo : " + line); //�ٽ� Ŭ���̾�Ʈ���� �޼����� �״�� ����.
	    					if(line.equals("BYB"))
	    						break;
	    				}
	    			}
	    			out.close();
	    			in.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
	    	
	    	}
	    }
	
		
		
	public static void main(String[] args) {
       new EchoServer();
	}

}
