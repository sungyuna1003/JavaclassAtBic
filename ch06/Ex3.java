package ch06;

import java.awt.Color;

class A3 {
	private A3() {
	}

	static int i;

	static void prn() {
		System.out.println(i);
	}
}

public class Ex3 {
	public static void main(String[] args) {
		/* static ���� �� �޼ҵ�� ��ü�� �������� �ʰ� ��밡�� **/
		A3.i = 22;
		A3.prn();
//		A3 a = new A3();
		int a = -22;
//		Math Ŭ������ ��� �ʵ�� �޼ҵ�� static.
//		������ �ʿ��� �ʵ� �� �޼ҵ�� Ŭ���������� �����Ͽ� ����ϰ� 
//		��ü������ ������. �׷��� MathŬ������ �����ڴ� private �̴�.
		int b = Math.abs(a);
		System.out.println(b);
//	   Frame�� �Է��� ������ ��� ���ڿ� Ÿ���̴�.(String Ÿ��)
//	   �̷��� ���� ����� ���ڿ��� ����ϱ� ���ؼ��� ������ ��ȯ���Ѿ���.
		String s1 = "22";
		String s2 = "23";
		Integer it = new Integer(0);
		int i = it.parseInt(s1);
		i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		System.out.println(i + j);
//		PI �� ���(static final)
		System.out.println(Math.PI);
		System.out.println(Color.RED);
		System.out.println(Color.red);
	}
}
