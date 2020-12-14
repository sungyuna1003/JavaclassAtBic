package ch12;

import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
             Vector<String> vec = new Vector<String>();
             vec.add("Java"); //1번째
             vec.add("JSP"); //2번째
             vec.add("Andorid"); //3번재
             vec.add("Oracle"); //4번째
             vec.add("Kotlin"); //5번째
             System.out.println(vec.size()); //5 벡타의 크기
             System.out.println(vec.capacity()); //보통 10개의 벡터가 만들어짐. 5개이기 때문에 10. 11개 되면 벡터가 20.
           //벡타는 순차적으로 넣었다가 순차적으로 꺼낼때 보통 사용
             vec.remove(0);
             if(vec.contains("Andorid")) { 
            	 int idx = vec.indexOf("Andorid");
            	 System.out.println(idx);
             }
             System.out.println(vec.isEmpty()); //값이 있어서 비어이있지 않아 false
             vec.addElement("Spring");//add랑 비슷. addElement 과 get 같음. 
             System.out.println(vec.get(0));
             System.out.println(vec.elementAt(1));
          
	}

}
