package ch12;

import java.util.ArrayList;

public class ArrayListEx1 {
	public static void main(String[] args) {
		//��ü�� �����ϴ� Ŭ����:�迭�� ������ �����ؼ� ���� Ŭ����
        //�迭: ������ Date Type �̰� ũ�Ⱑ ����
		//ArrayList / Vector �� Ÿ�� �� ũ�Ⱑ ������
         ArrayList list = new ArrayList();
         list.add("Java");
         list.add("Jsp");
         list.add("Database");
         System.out.println(list.size());
         for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
         list.remove(0);
         System.out.println("==============");
         for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));			
		}
	}
}
