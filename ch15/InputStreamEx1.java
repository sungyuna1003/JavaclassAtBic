package ch15;

import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) {
      InputStream is = System.in; //Ű���忡 ���� �� input ��Ʈ��. �� java �ȿ� ������ �� �����ϴ� ���배�� ��Ȱ.
      while(true){
    	  try {
    		  int i = is.read(); //�� java�� ���� ����. ���������� ������->Ű���� �Է��ϸ� ����
    		  System.out.print((char)i);
    	  }catch (Exception e) {
           e.printStackTrace();
		}
      } //-------while
	}

}
