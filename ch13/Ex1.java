package ch13;

import ch13.Outer1.Inner1;

//Outer1.class
/*����Ŭ������ ���������� �ܺ�Ŭ���� �ȿ� ���� Ư���� ����� �����ϰ��� ������ ������
 * �޼ҵ尡 �ƴ� ����� ����� �ִ� Ŭ������ ������ �Ѵ�. �̷��� ����Ŭ������ �� �ٸ� �ܺ�Ŭ������
 * �������� �ʴ� ������ �ܺ�Ŭ���� �ȿ����� ����ϱ� ���� �����̴�. */
class Outer1 {
	int i = 22;

	void prn() {
		System.out.println("i:" + i);
		// System.out.println(j+i);
		/*����Ŭ������ �ܺ�Ŭ���� �������� �Ϲ������� ����ϰ� ����� ������ ������ Ŭ�����̴�. �ܺ�Ŭ�������� ����Ŭ������ ��������� �޼ҵ带
		 * ����ϱ� ���ؼ��� �ݵ�� ��ü ������ �ʿ��ϴ�. */
		Inner1 in = new Inner1();
		System.out.println(i + in.j);
	}

	// ����Ŭ����: Outer1$Inner1.class
	class Inner1 {
		int j = 23;

		void prn1() {
    /*�ܺ�Ŭ������ ����Ŭ������ ���� Ư���� �޼ҵ�� �ν��� �Ѵ�. 
     * �׷��� �ܺ� Ŭ������ ��� ������ �޼ҵ�� �������� ����Ŭ�������� ����Ҽ��ִ�*/
			System.out.println("i+j:" + (i + j)); // i= 22
		}
	}
}

class A1 {
	int i = 22; // �������

	void prn() {
		int j = 23; // ��������
		System.out.println(i + j);
	}

	void prn1() {
		// System.out.println(i+j);
	}
}

public abstract class Ex1 {
	public static void main(String[] args) {
  /*��3�� Ŭ�������� ����Ŭ���� ����� 
		Inner1 in = new Innner1();//����(OUTER1)���� ��밡��*/
		Outer1 out = new Outer1();
		Outer1.Inner1 in = out.new Inner1();
		in.prn1();
	}

}
