package ch05;

import ch05_1.Ex10;

class A9 {
	protected int a;
}

public class Ex9 {
	public static void main(String[] args) {
		/*
		 * projected:������ ����Ű�� ����� public ����(������) SUN���� �����Ǵ� ��κ��� �ʵ�� �޼ҵ�� public ���࿡
		 * projected�� ����� �ʵ�� �޼ҵ� ����Ϸ��� ��� �ۿ� ��� ����. ����: ������ ����� Ŭ������ Sun���� �����Ǵ� Ŭ������
		 * ������ ��Ű�� ������ �Ұ���
		 */
		A9 a1 = new A9();
		a1.a = 22; // ������ ��Ű���̱� ������ ���� ����
		Ex10 e1 = new Ex10();
		e1.a = 22; // public �̱� ������ ����
		// e1.b = 23; // protected �̱� ������ ����
	}
}
