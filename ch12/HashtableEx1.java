package ch12;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableEx1 {
	public static void main(String[] args) {
		//key-value �ѽ����� ����Ǵ� Collection
           Hashtable<String, String> ht =
        		   new Hashtable<String, String>();
           ht.put("���", "Apple");
           ht.put("����", "Grapes");
           ht.put("����", "Strawberry");
           ht.put("���", "Melon");
           System.out.println(ht.get("���"));//key��
           //Enumeration ������ ����
           Enumeration<String>e=ht.keys();
           while(e.hasMoreElements()/*��Ұ� ����������*/) {
        	   String key = e.nextElement();
        	   String value = ht.get(key);
        	   System.out.println(key+" : "+value);
        	   
           }
           
	}

}
