package ch04;

import java.util.Random;

public class Lotto1 {
	public static void main(String[] args) {
		Random r = new Random();
		int lotto[] = new int[6];
		System.out.println("�ζ��� ���ü��ڴ�");
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--; //i=i-1 �� �ٿ����ٸ�, i--
					break;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "  " + "\t");
		}
		System.out.println("�Դϴ�.");
	}
}