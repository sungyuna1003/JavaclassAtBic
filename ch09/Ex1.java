package ch09;

import java.awt.Color;
import java.awt.Frame;

import javax.swing.plaf.synth.ColorType;

/*final(������):Ŭ����, �ʵ�(�Ű�����),�޼ҵ�
 * 1. Ŭ����: subŬ������ ���� Ŭ����
 * 2. �ʵ�: ����� ����
 * 3. �޼ҵ�: �������̵� �Ұ� �޼ҵ�
 */

final class A1 {
}

//class B1 extends A1{}
//class C1 extends String{}
class D1 {
	int a; // �ʵ�� �ʱ�ȭ�� JVM�� ��. �⺻�� Ÿ���� 0(booelan:false), Ŭ���� Ÿ���� null.
	final int B = 22; // ���������� ����� ��� ö�ڰ� �빮��.

	public void prn(final int n) {
//		n=23; //final �Ű������� �翬�� ����Ұ�
		System.out.println(5 * 5 * Math.PI);// ���� ����
		Frame f = new Frame();
		f.setBackground(new Color(255, 255, 0));
		f.setBackground(Color.yellow);

	}
}

class E1{
	void prn1() {}
	final void prn2(){}
}

class F1 extends E1{
	@Override
	void prn1() {}
//    @Override
//	void prn2() {}
}

public class Ex1 {

	public static void main(String[] args) {

	}

}
