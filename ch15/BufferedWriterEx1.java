package ch15;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class BufferedWriterEx1 {
	public static void main(String[] args) {
       String s = "������ �ູ�� �ݿ���";
       BufferedWriter bw =
    		   new BufferedWriter(new OutputStreamWriter(System.out));//�ֿܼ� �ѷ���
       try {
		bw.write(s,0,s.length());
		bw.newLine();
		bw.write(s);
		bw.flush();
		bw.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

}
