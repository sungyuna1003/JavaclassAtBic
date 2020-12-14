package ch16;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckboxEx1 extends MFrame 
/*�������̽� ���� ->�߻�޼ҵ� �������̵�*/
implements ItemListener{ //â ���� ��Ÿ���� �ϱ�

	
	Checkbox cb1, cb2, cb3;
	Checkbox rb1, rb2, rb3;
	CheckboxGroup grp; //������ư �׷�
	
	public CheckboxEx1() {
		super(220, 250);
		setTitle("Checkbox Example");
		add(cb1 = new Checkbox("����1", false));
		add(cb2 = new Checkbox("����2", true)); //���õ� ���·� ����
		add(cb3 = new Checkbox("����3", false));
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		grp = new CheckboxGroup();
		add(rb1 = new Checkbox("����1",grp, true)); //üũ�� ���·� ����
		add(rb2 = new Checkbox("����2", grp, false));
		add(rb3 = new Checkbox("����3", grp, false));

		
		validate();
	}
	//������� ��Ʈ��+�����̽� �ϸ� �ؿ� Override �� �ڵ�����
	@Override
		public void itemStateChanged(ItemEvent e) { //������(����)���°� ����Ǿ�����
//		System.out.println("111111"); 
		   Checkbox cb = (Checkbox)e.getSource(); //�����ϸ� â �� ���� Ŭ���� ������ ��Ÿ��.
		   String str =cb.getLabel() + " : " +cb.getState();
		   setTitle(str);
	}
	
	public static void main(String[] args) {
      new CheckboxEx1();
	}

}
