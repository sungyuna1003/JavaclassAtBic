package ch06;

public class Bus {

	public int busNumber; //������ȣ
	public int passengerCount; //�°���
	public int money; //������ ����
	
	public Bus(int busNumber) {
	this.busNumber = busNumber;
}
//�޼ҵ�
 public void take(int money) {
	 this.money += money;
	 passengerCount++;
 }
 public void showInfo() {
	 System.out.println("���� :"+ busNumber);
	 System.out.println("�°� :"+ passengerCount);
	 System.out.println("���� :"+ money);
	 System.out.println("----------------------------");
 }
}