package ch06;

public class Subway {
	public String lineNumber;//�뼱��ȣ
	public int passengerCount;//�°���
	public int money;//����ö�� ����

	//������
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	//�޼ҵ�
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("����ö : " + lineNumber);
		System.out.println("�°� : " + passengerCount);
		System.out.println("���� : " + money);
		System.out.println("-----------------------");
	}
	
}
