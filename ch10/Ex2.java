package ch10;

interface A2{
	//�ʵ�: �ڵ����� ���. 
	int A = 22;
	//�޼ҵ�: �߻�޼ҵ常 ����(8.0����)
    void prn();
}

class B2 extends Object  implements A2{
@Override
	public void prn() {
}
}

//Ŭ������ ���߻�� �Ұ���������, ���� ������ ����
interface C2{
	void prn1();
}

//������ �������̽� ����(���߱����� ����)
class D2 implements A2, C2{

	@Override
	public void prn1() {
	}

	@Override
	public void prn() {
	}
	
}
public class Ex2 {

	public static void main(String[] args) {

	}
}

