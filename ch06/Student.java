package ch06;

public class Student {
	//�ʵ�(�������) : ��ü�� �Ӽ��� ���ϰ� �ִ�.
	public String studentName;//�л��̸�
	public int grade;//�г�
	public int money;//������ �ִ� ��
	
	//������
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	//�޼ҵ� : 3�� ����
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName+"�� ���� ���� " 
				+ money +"�Դϴ�." );
	}
}










