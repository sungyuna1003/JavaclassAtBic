package ch05;

class A8 {
	public String name; // �̸�
	public int age; // ����
}

class B8 {
	public String name; // �̸�
	private int age; // ����: 1 �̻�

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 1)
			age = 1;
		this.age = age;
	}

}

public class Ex8 {
	public static void main(String[] args) {
		A8 a1 = new A8();
		a1.name = "ȫ�浿";
		a1.age = 26;
		A8 a2 = new A8();
		a2.name = "ȫ����";
		a2.age = -10;
		///////////////////////////////
		B8 b1 = new B8();
		b1.name = "��ȣ��";
    //b1.age = 10;
		b1.setAge(-10);
		System.out.println(b1.name + "�� ���̴� " + b1.getAge());
   //Math
	}
}
