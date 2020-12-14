package ch08;

//����Ŭ������ ������ �޼ҵ�� ���X.
public class VIPCustomer extends Customer { // VIP���� ����Ŭ������ Customer

//VIPCustomer: �����Ǹſ�, ����Ʈ���� 5%, ���� 10%
	public int agentID;
	public double saleRatio;

	public VIPCustomer() {

		// super Ctrl+space �ι�° Ŭ��
		customerGrade = "VIP";// ���.
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	public VIPCustomer(int customerID, String customerName, int agentID) {
//		this.customerID = customerID;
//		this.customerName = customerName;
		super(customerID, customerName);
		customerGrade = "VIP";// ���.
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}

	/*�޼ҵ� �������̵�(Override), ���� Ŭ������ ����������. �θ� ������ �޼ҵ带 �ڽ�Ŭ�������� ���ο� �°� �������ϴ� ��.
	 *  @Override �־ �ǰ� ��� ��. @:������̼�(Annotation)>�˸�,����*/

	public int calcPrice(int price) {
//	calcPrice 1�� ���� �ȳ�����override ����� ����
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio); // 90�������� ����
//	�Ϲݰ��� �ٸ� ���� ���� ������ ��� ����.
	}
}
