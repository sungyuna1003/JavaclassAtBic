package ch06;

/*this : �ڱ� �ڽ�(�޸𸮿� ������� ��ü)�� ����Ű�� �����.
 * 1. this() : ��ü ������ �ǹ�
 * 2. this.�ʵ�: ��ü�� �Ӽ��� ���ϴ� �ʵ带 ����Ҷ�
 * �޼ҵ� �ȿ� ���������� ������ �������� �� �ʵ带 ����ϱ� ���� ����
 * 3. �ڽ��� ��ü�� ��ȯ�Ҷ� (���� ���� ����)*/
class A1 extends Object {
//������: ��ü�� ����� �޼ҵ�
//�����ڸ� �����ϴ� ����: ��ü�� ���� �� �� �ʿ��� �ʱ����� ���� ���� �� ����.
	public A1() {
		super(); // super �� ����? Object
	}

	public A1(int i) {
		this();
	}
}

class B1 {

	int age;
	int num;
	String name;

	public void setAge(int age) {
		// ������ ����
		int num = this.age * 10;
		System.out.println(age);
	}

	public void prn() {
		// �Ϲ������� �ʵ�� ������ ���������� ���� ������ �ȴ�.
		// �׷��� �ʵ带 ����Ϸ��� this �� �տ� ���̸� �ȴ�.
		String name; // local variable ��������
	}

	public void m(B1 b) {
	}

	public void m1() {
		m(this);
	}
}

public class Ex1 {

	public static void main(String[] args) {

	}

}
