package ch15;

import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) {
      InputStream is = System.in; //키보드에 연결 된 input 스트림. 내 java 안에 가져올 때 연결하는 빨대같은 역활.
      while(true){
    	  try {
    		  int i = is.read(); //내 java에 받은 상태. 내부적으로 대기상태->키보드 입력하면 실행
    		  System.out.print((char)i);
    	  }catch (Exception e) {
           e.printStackTrace();
		}
      } //-------while
	}

}
