package ch06;

/*static : �ʵ�, �޼ҵ�,Ŭ����(Ư���� ��Ȳ)
 * static(������) �޸� ����: ��ü�� �����Ǳ� ���� �̸� ����� ���� �޸� ����
 * Ŭ���� �տ� �� �� �ִ� ���� �����ڴ� public �ۿ� ����.*/

class A2 {
	/*
	 * static ������ non-static ���� �� ���� ���� �޸𸮿� ����� ����? -> static ����. ��ü�� ��� ���� �ʰ� ���
	 * ������ ������ static �̹Ƿ� static ������ Ŭ���������� ���� ex) A2.a
	 */
	static int a;
	int b;
	static void prn() {
		/*non-static ������ static �޼ҵ� ���Ұ�: 
		 * ����:non-static ������ �ݵ�� ��ü�� �����ؾ� ����� ���� �����ظ�, static �żҵ�� ��ü��
		 * �������� �ʾƵ� ��� ������ �޼ҵ��̹Ƿ� ������ ����ȴ�.
		 *System.out.println(a+b); */
	}
	void prn1() {
		System.out.println(a+b);
	}
}

public class Ex2 {
	public static void main(String[] args) {
		A2.a = 22;
		System.out.println(A2.a);
		A2 aa = new A2();
		aa.a=23;
		aa.b=24;
		System.out.println(aa.a+":"+aa.b);
	}
}
