package ch16;

import java.awt.Frame;
import java.awt.Label; //11�� label ��Ʈ��+�����̽�->awt ������ �̰� �ڵ�����
import java.awt.event.WindowEvent;
/*AWT����� ���
 * 1.�ʿ��� ������Ʈ(=â)�� �����Ѵ�.
 * 2.������Ʈ�� �����̳�(Frame->MFrame �߰�)
 * 3.���̾ƿ� �޴����� ����Ѵ�.
 * 4.�̺�Ʈ�� ����߰�(�ڿ�...)*/
public class LabelEx1 extends MFrame{
	
	Label label1, label2, label3, label4; //��������: �̸��� �������� ����. new �� ���;��� ��ü ����
	
	public LabelEx1() {
		super(230, 200);
		setTitle("Label Example");
		String str = "������ ���ְ� ���۵Ǵ� ������";
		// ����� �� �����ϴ��� �ؿ��� ����.
		label1 = new Label(str); //��� 
		label2 = new Label(str, Label.CENTER); //(str.1���)�ص� ���� �ȳ�.label.center�� ���߰���
		label2.setBackground(MColor.rColor()); //���� �����ϰ� ������ �÷�
		label3 = new Label(str, Label.RIGHT);
		label3.setBackground(MColor.rColor());
//label4.setForeground(MColor.rColor()); //4�κ��� ���� �� �����ϰ� ����� ������ ������. ��ü�� �ּҰ�(����Ʈ)�� null�̶�. 25�������� ��ü ���� �ȵǰ� 26���� ��ü ����(new ����)
		label4 = new Label(str, Label.LEFT);
		label4.setForeground(MColor.rColor()); //25�� �κ��� 27�� ���ȴ��� ���� �����.
		add(label1);add(label2);add(label3);add(label4);
		validate();
	}

	public static void main(String[] args) {
		new LabelEx1();
	}
}




