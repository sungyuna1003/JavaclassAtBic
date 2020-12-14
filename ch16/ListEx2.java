package ch16;

import java.awt.Choice;
import java.awt.Color;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ListEx2 extends MFrame 
implements ItemListener{
	
	List name, star;
	String ms[] = {"�� ��","�� ��","�̹�ȣ","�����","����","������"};
	String fs[] = {"��ƶ�","�̿���","���ϴ�","��ä��","�� ��","�迬��"};
	
	public ListEx2() {
		setTitle("������ ����");
		name = new List(2, false);
		name.add("���ڿ�����");
		name.add("���ڿ�����");
		star = new List(6, true);
		inputItem(star, ms);
		add(name);
		add(star);
		name.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(name.getSelectedItem().equals("���ڿ�����"))
			inputItem(star, ms);
		else
			inputItem(star, fs);
	}
	
	public void inputItem(List list, String item[]) {
		list.removeAll();
		for (int i = 0; i < item.length; i++) {
			list.add(item[i]);
		}
	}
	
	public static void main(String[] args) {
		new ListEx2();
	}
}



