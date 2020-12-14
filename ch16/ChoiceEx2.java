package ch16;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEx2 extends MFrame 
implements ItemListener{
	
	String sair[] = {"�����װ�","�ƽþƳ�","����λ�","������"};
	String scity[] = {"�� ��","�� ��","�� ��","�� ��","���ֵ�"};
	Choice air, city;
	
	public ChoiceEx2() {  //������(=â)�� ��� ���� �ȵǰ� �� �ѹ��� �����
		super(300, 300 , new Color(100,200,100)); //�������
		setTitle("Choice Example2");
		air = new Choice(); //���̽� ����, ������ �����ʿ����
		city = new Choice(); //���̽� ����, ������ �����ʿ����
		for (int i = 0; i < sair.length; i++) {
			air.add(sair[i]);
		}
		for (int i = 0; i < scity.length; i++) {
			city.add(scity[i]);
		}
		add(air); add(city);
		//�̺�Ʈ: city ���̽��� 33���� �޼ҵ�(itemStateChanged) ȣ��(����)
		city.addItemListener(this);//
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		repaint();//���������� paint �޼ҵ� ȣ��
	}
	
	@Override //�׸��� �׸��� �޼ҵ�. ��ü�� �����ϸ� �ڵ������� �ѹ� ȣ��
	public void paint(Graphics g/*��*/) {
		g.setColor(Color.RED);
		String str = "�װ��� ���� : " + air.getSelectedItem();
		g.drawString(str, 30, 120);
		g.setColor(Color.BLUE);
		str = "���� ���� : " + city.getSelectedItem();
		g.drawString(str, 30, 150);
	}
	
	public static void main(String[] args) {
		new ChoiceEx2();
	}
}



