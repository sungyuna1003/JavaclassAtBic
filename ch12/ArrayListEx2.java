package ch12;

import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Java");
      //10�� int ���̹Ƿ� Object �ƴ����� Auto-Boxing.Integer�� ��ȯ�Ǿ� ����
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
        	//�����Ҷ� Ÿ������ ĳ���� ���� �����´�.
 			String s = (String)list2.get(i);
 			System.out.println(s.length());
		}
        
        //���׸�: Collection ��ü�� ������ �� Ÿ���� �̸� �����ϴ� ��. 
        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("Java");
        list3.add("Jsp");
        list3.add("Oracle");
//        list3.add(10);
        String s = list3.get(0);
        
	}

}
