package ch08;

//������ �ʿ����. �����ϴ� �� ������ �ʱ� ����
public class Customer {

	public  int customerID;
	public String customerName;
	public String customerGrade;
	public int bonusPoint;
	public double bonusRatio;

//    ������:��ü�� ������ ��, �⺻���� ���� ������ �������� �Ѵ�.
//	��ü�� ������ �� �ѹ��� ȣ���ϰ�, �ٸ� �޼ҵ�ó��  �ݺ����� ȣ���� �Ұ���
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01; // 1%
	}// ^�� ù��° ������: ���̵�, �̸��� ���� ���

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01; // 1%
	}// ^�� �ι�° ������: ���̵�, �̸��� �ִ� ���

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
//���� ������ 10����ġ ���, ���ʽ��� õ��. bonunsPoint ���� ���� �־��ٸ� ���� ������� ����.
		return price;
	}

	public String showCustomerInfo() {
		String str = customerName + "���� ����� " + customerGrade + "�̸� ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
		return str;
	}
}
