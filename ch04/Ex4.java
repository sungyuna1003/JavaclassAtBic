package ch04;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �Է��� ���ڰ� ���, ����, 0 �� ��츦 �����Ͻÿ�.
		System.out.println("���ڸ� �Է��ϼ���.");
		int a = sc.nextInt();
		if (a > 0) {
			System.out.println("����Դϴ�.");
		} else if (a < 0) {
			System.out.println("�����Դϴ�.");
		} else if (a == 0) {
			System.out.println("0�Դϴ�.");
		}
	}
}
