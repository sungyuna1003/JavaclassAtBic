package ch09;

//�߻�Ŭ����
abstract class A2 {
//�߻�޼ҵ�: ����θ� �ְ� �����δ� ����.
	abstract void prn();
}

// A2�� prn �żҵ�� �ݵ�� ���������� �������̵� �ؾ��Ѵ�.
class B2 extends A2 {
	@Override
	void prn() {
	}
}

class C2 extends A2 {
	@Override
	void prn() {
	}
}

public class Ex2 {
	public static void main(String[] args) {
	}
}
