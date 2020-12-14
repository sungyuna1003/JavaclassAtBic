package ch16;

import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEx3 extends MFrame 
implements ItemListener{
	
	Choice name, star;
	String ms[] = {"�� ��","�� ��","�̹�ȣ","�����","����","������"};
	String fs[] = {"��ƶ�","�̿���","���ϴ�","��ä��","�� ��","�迬��"};
	
	public ChoiceEx3() {
		setTitle("������ ����");
		name = new Choice();
		name.add("���ڿ�����");
		name.add("���ڿ�����");
		star = new Choice();
		//�⺻�� ���� ���ڿ������̹Ƿ� ms�� ���� add �ȴ�.
		/*
		 * for (int i = 0; i < ms.length; i++) { star.add(ms[i]); }
		 */
		inputItem(star, ms);
		add(name);
		add(star);
		//name ���̽� �̺�Ʈ ����
		name.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
//System.out.println(name.getSelectedItem()); //name�̶�� ���̽����� ���õ� �� ������
	if(name.getSelectedItem().equals("���ڿ�����"))
		inputItem(star, ms);
	else
		inputItem(star, fs);
	}
	
	//ù��° �Ű����� ���̽��� �ι�° �Ű����� item�� �߰�
	public void inputItem(Choice c, String item[]) {
		//������ item�� ��� ����
		c.removeAll();
		for (int i = 0; i < item.length; i++) {
			c.add(item[i]);
		}
	}
	
	public static void main(String[] args) {
		new ChoiceEx3();
	}
}



