package ch12;

import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Java");
      //10은 int 형이므로 Object 아니지만 Auto-Boxing.Integer로 변환되어 저장
        list.add(10);
        list.add(true);
        list.add(new Object());
        for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
        
        ArrayList list2 = new ArrayList();
        list2.add("Java");
        list2.add("Jsp");
        list2.add("Oracle");
        
        for (int i = 0; i < list2.size(); i++) {
        	//저장할때 타입으로 캐스팅 시켜 가져온다.
 			String s = (String)list2.get(i);
 			System.out.println(s.length());
		}
        
        //제네릭: Collection 객체에 저장할 때 타입을 미리 선언하는 것. 
        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("Java");
        list3.add("Jsp");
        list3.add("Oracle");
//        list3.add(10);
        String s = list3.get(0);
        
	}

}
