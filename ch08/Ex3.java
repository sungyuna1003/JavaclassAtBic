package ch08;

public class Ex3 {
	public static void main(String[] args) {
		Customer ct = new Customer();
		VIPCustomer vct = new VIPCustomer();
////////////////////////////////////////
//		������ ����ȯ
		int i = 10;
		double d=i;
//		����� ����ȯ
		short s =(short)i;
//		ĳ����(UPCasting)
		Customer ct1 = 
				new VIPCustomer(1004,"�豸��",2000); //����Ŭ������ ����Ŭ���� �� �� ����.
//		VIPCustomer vct1 = new Customer(); ����Ŭ������ ����Ŭ������ �� �� ����.
////////////////////////////////////////
//		�������̵� �żҵ�� ����Ŭ������ �żҵ尡 �ƴ� ����Ŭ������ �żҵ尡 ȣ��ȴ�=�������ε�
		int price = ct1.calcPrice(1000000);
		System.out.println("price:"+price);
		System.out.println(ct1.showCustomerInfo());
	}

}
