package ch12;

import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
             Vector<String> vec = new Vector<String>();
             vec.add("Java"); //1��°
             vec.add("JSP"); //2��°
             vec.add("Andorid"); //3����
             vec.add("Oracle"); //4��°
             vec.add("Kotlin"); //5��°
             System.out.println(vec.size()); //5 ��Ÿ�� ũ��
             System.out.println(vec.capacity()); //���� 10���� ���Ͱ� �������. 5���̱� ������ 10. 11�� �Ǹ� ���Ͱ� 20.
           //��Ÿ�� ���������� �־��ٰ� ���������� ������ ���� ���
             vec.remove(0);
             if(vec.contains("Andorid")) { 
            	 int idx = vec.indexOf("Andorid");
            	 System.out.println(idx);
             }
             System.out.println(vec.isEmpty()); //���� �־ ��������� �ʾ� false
             vec.addElement("Spring");//add�� ���. addElement �� get ����. 
             System.out.println(vec.get(0));
             System.out.println(vec.elementAt(1));
          
	}

}
