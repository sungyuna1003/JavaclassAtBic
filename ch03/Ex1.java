package ch03;

public class Ex1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = ++a; // 1�� ���� �Ŀ� c �� ���� a = a + 1
		int d = b++;// ���� �Ŀ� 1�� ����
        //���� ���� : ctrl + alt + ����Ű
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		// ����: ctrl + F11
		System.out.println("d : " + d);
	}
}
